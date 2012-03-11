package org.uepon.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.uepon.dto.CustomerMasterDto;
import org.uepon.dto.PageConditionDto;

public interface CustomerMasterDao {
	public CustomerMasterDto findById(Long customerId) throws DataAccessException;
	public List<CustomerMasterDto> findAll() throws DataAccessException;

	public List<CustomerMasterDto> findPage(PageConditionDto condition) throws DataAccessException;
	public Integer count() throws DataAccessException;

	public void insert(CustomerMasterDto dto) throws DataAccessException;
	public void update(CustomerMasterDto dto) throws DataAccessException;
	public void delete(Long customerId) throws DataAccessException;
}
