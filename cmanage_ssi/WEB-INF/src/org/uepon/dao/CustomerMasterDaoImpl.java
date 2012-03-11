package org.uepon.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.uepon.dto.CustomerMasterDto;
import org.uepon.dto.PageConditionDto;

public class CustomerMasterDaoImpl extends SqlMapClientDaoSupport implements CustomerMasterDao {

    public CustomerMasterDto findById(Long customerId) throws DataAccessException {
        return (CustomerMasterDto) getSqlMapClientTemplate().queryForObject("cmanage.findById", customerId);
    }
    @SuppressWarnings("unchecked")
    public List<CustomerMasterDto> findAll() throws DataAccessException {
        return (List<CustomerMasterDto>) getSqlMapClientTemplate().queryForList("cmanage.findAll");
    }
    @SuppressWarnings("unchecked")
	public List<CustomerMasterDto> findPage(PageConditionDto condition) throws DataAccessException {
		return (List<CustomerMasterDto>) getSqlMapClientTemplate().queryForList("cmanage.findPage", condition);
	}
	public Integer count() throws DataAccessException {
		return (Integer)getSqlMapClientTemplate().queryForObject("cmanage.findAllCount");
	}

	public void insert(CustomerMasterDto dto) throws DataAccessException {
		getSqlMapClientTemplate().insert("cmanage.insertCmanage",dto );
	}
	public void update(CustomerMasterDto dto) throws DataAccessException {
		getSqlMapClientTemplate().update("cmanage.updateCmanage",dto );
	}
	public void delete(Long customerId) throws DataAccessException {
		getSqlMapClientTemplate().delete("cmanage.deleteCmanage", customerId);
	}

}
