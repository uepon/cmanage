package org.uepon.service;

import java.util.List;

import org.uepon.dao.CustomerMasterDao;
import org.uepon.dto.CustomerMasterDto;
import org.uepon.dto.PageConditionDto;


public class CustomerMasterServiceImpl implements CustomerMasterService {
	private CustomerMasterDao customerMasterDao;

	public CustomerMasterDao getCustomerMasterDao() {
		return customerMasterDao;
	}

	public void setCustomerMasterDao(CustomerMasterDao customerMasterDao) {
		this.customerMasterDao = customerMasterDao;
	}

	public List<CustomerMasterDto> getCustomerMasterList () {
		return customerMasterDao.findAll();
	}

	public CustomerMasterDto getCustomerMaster (Long customerId) {
		return customerMasterDao.findById(customerId);
	}

	public void insertCustomerMaster (CustomerMasterDto dto){
		customerMasterDao.insert(dto);
	}
	public void updateCustomerMaster (CustomerMasterDto dto){
		customerMasterDao.update(dto);
	}
	public void deleteCustomerMaster (Long customerId) {
		customerMasterDao.delete(customerId);
	}

	public List<CustomerMasterDto> getCustomerMasterListPage (PageConditionDto condition){
		return customerMasterDao.findPage(condition);
	}

	public Integer countCustomerMaster () {
		return customerMasterDao.count();
	}

}
