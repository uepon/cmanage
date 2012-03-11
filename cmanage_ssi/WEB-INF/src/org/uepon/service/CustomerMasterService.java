package org.uepon.service;

import java.util.List;

import org.uepon.dto.CustomerMasterDto;
import org.uepon.dto.PageConditionDto;

public interface CustomerMasterService {
	public List<CustomerMasterDto> getCustomerMasterList ();
	public List<CustomerMasterDto> getCustomerMasterListPage (PageConditionDto condition);
	public Integer countCustomerMaster ();
	public CustomerMasterDto getCustomerMaster (Long customerId);
	public void insertCustomerMaster (CustomerMasterDto dto);
	public void updateCustomerMaster (CustomerMasterDto dto);
	public void deleteCustomerMaster (Long customerId);
}
