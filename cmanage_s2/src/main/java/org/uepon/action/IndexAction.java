package org.uepon.action;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.uepon.dto.PageConditionDto;
import org.uepon.entity.CustomerMaster;
import org.uepon.form.IndexForm;
import org.uepon.service.CustomerMasterService;

public class IndexAction {

	@Resource
	private CustomerMasterService customerMasterService;

	@ActionForm
	@Resource
	private IndexForm indexForm;

	private static int LIMIT = 5;

    @Execute(validator = false)
	public String index() {
    	indexForm.pageConditionDto = new PageConditionDto(LIMIT, (int)customerMasterService.getCount());
    	indexForm.customerList = customerMasterService.find(indexForm.pageConditionDto);
        return "index.jsp";
	}

    @Execute(validator = false)
    public String insert() {
    	return "insert.jsp";
    }

    @Execute(validator = true, input = "insert.jsp", removeActionForm = true)
    public String execInsert() {
    	CustomerMaster customerMaster = Beans.createAndCopy(CustomerMaster.class, indexForm).execute();
    	customerMasterService.insert(customerMaster);
    	return "/redirect=true";
    }

    @Execute(validator = false, urlPattern = "edit/{customerId}")
    public String edit() {
    	CustomerMaster customerMaster = customerMasterService.findById(indexForm.customerId);
    	Beans.copy(customerMaster, indexForm).execute();
    	return "edit.jsp";
    }

    @Execute(validator = true, input = "insert.jsp", removeActionForm = true)
    public String execEdit() {
    	CustomerMaster customerMaster = Beans.createAndCopy(CustomerMaster.class, indexForm).execute();
    	customerMasterService.update(customerMaster);
    	return "/redirect=true";
    }

    @Execute(validator = false, urlPattern = "delete/{customerId}")
    public String delete() {
    	CustomerMaster customerMaster = customerMasterService.findById(indexForm.customerId);
    	customerMasterService.delete(customerMaster);
    	return "/redirect=true";
    }

    @Execute(validator = false)
    public String back() {
    	return "/redirect=true";
    }

    @Execute(validator = false)
    public String prev() {
    	indexForm.pageConditionDto.prevPage();
    	indexForm.customerList = customerMasterService.find(indexForm.pageConditionDto);
    	return "index.jsp";
    }

    @Execute(validator = false)
    public String next() {
    	indexForm.pageConditionDto.nextPage();
    	indexForm.customerList = customerMasterService.find(indexForm.pageConditionDto);
    	return "index.jsp";
    }

}
