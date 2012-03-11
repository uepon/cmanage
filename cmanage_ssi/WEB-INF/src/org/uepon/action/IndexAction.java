package org.uepon.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.uepon.dto.CustomerMasterDto;
import org.uepon.dto.PageConditionDto;
import org.uepon.dto.ViewDto;
import org.uepon.service.CustomerMasterService;

import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

@Results({
	@Result(name = "top", location = "/", type = "redirectAction"),
	@Result(name = "page_success", location = "index.jsp")
 })
public class IndexAction extends AbsAction implements SessionAware  {

	private static final long serialVersionUID = 1L;
	private static int LIMIT = 5;
	private static String KEY = "KEY_PAGECONDITIONDTO";

	@Action("/")
	@SkipValidation
	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		PageConditionDto pageDto = new PageConditionDto(LIMIT, (int)customerMasterService.countCustomerMaster());
		sessionMap.put(KEY, pageDto);
		viewDto = new ViewDto();
		List<CustomerMasterDto> list = customerMasterService.getCustomerMasterListPage(pageDto);
		viewDto.setCustomerList(list);
		viewDto.setPageConditionDto(pageDto);
		return "success";
	}

	@Action("/edit")
	@SkipValidation
	public String edit() throws Exception {
		viewDto = new ViewDto();
		CustomerMasterDto dto = customerMasterService.getCustomerMaster(this.getCustomerId());
		viewDto.setCustomerDto(dto);
		return "success";
	}
	@Action("/insert")
	@SkipValidation
	public String insert() throws Exception {
		return "success";
	}

	@Action("/delete")
	@SkipValidation
	public String delete() throws Exception {
		customerMasterService.deleteCustomerMaster(this.getCustomerId());
		return "top";
	}

	public String execEdit() throws Exception {
		customerMasterService.updateCustomerMaster(viewDto.getCustomerDto());
		if (hasActionErrors()) {
			return "success";
		}
		return "top";
	}

	public String execInsert() throws Exception {
		customerMasterService.insertCustomerMaster(viewDto.getCustomerDto());
		if (hasActionErrors()) {
			return "success";
		}
		return "top";
	}

	@Action("/prev")
	@SkipValidation
	public String prev() throws Exception {
		PageConditionDto pageDto = (PageConditionDto)sessionMap.get(KEY);
		pageDto.prevPage();
		viewDto = new ViewDto();
		List<CustomerMasterDto> list = customerMasterService.getCustomerMasterListPage(pageDto);
		viewDto.setCustomerList(list);
		viewDto.setPageConditionDto(pageDto);
		return "page_success";
	}


	@Action("/next")
	@SkipValidation
	public String next() throws Exception {
		PageConditionDto pageDto = (PageConditionDto)sessionMap.get(KEY);
		pageDto.nextPage();
		viewDto = new ViewDto();
		List<CustomerMasterDto> list = customerMasterService.getCustomerMasterListPage(pageDto);
		viewDto.setCustomerList(list);
		viewDto.setPageConditionDto(pageDto);
		return "page_success";
	}

	@Action("/back")
	@SkipValidation
	public String back() throws Exception {
		return "top";
	}

	private ViewDto viewDto;
	private Long customerId;
	private CustomerMasterService customerMasterService;

	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

    public CustomerMasterService getCustomerMasterService() {
		return customerMasterService;
	}
	public void setCustomerMasterService(CustomerMasterService customerMasterService) {
		this.customerMasterService = customerMasterService;
	}
	public ViewDto getViewDto() {
		return viewDto;
	}
	@VisitorFieldValidator( message="" )
	public void setViewDto(ViewDto viewDto) {
		this.viewDto = viewDto;
	}
    private Map sessionMap;

    public void setSession(Map sessionMap) {
        this.sessionMap = sessionMap;
    }
}
