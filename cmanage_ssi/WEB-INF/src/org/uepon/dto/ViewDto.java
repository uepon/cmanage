package org.uepon.dto;

import java.io.Serializable;
import java.util.List;

import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

public class ViewDto implements Serializable {

	private static final long serialVersionUID = 1L;

    private Long customerId;
    private String name;
    private String shozokuKigyo;
    private String yubinNo;
    private String jusho;
    private String tel;
    private String mobileTel;
    private Integer shokushuCd;
    private PageConditionDto pageConditionDto;
    private List<CustomerMasterDto> customerList;
    private CustomerMasterDto customerDto;

    public CustomerMasterDto getCustomerDto() {
		return customerDto;
	}
    @VisitorFieldValidator( message="" )
	public void setCustomerDto(CustomerMasterDto customerDto) {
		this.customerDto = customerDto;
	}

	public List<CustomerMasterDto> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<CustomerMasterDto> customerList) {
		this.customerList = customerList;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShozokuKigyo() {
		return shozokuKigyo;
	}

	public void setShozokuKigyo(String shozokuKigyo) {
		this.shozokuKigyo = shozokuKigyo;
	}

	public String getYubinNo() {
		return yubinNo;
	}

	public void setYubinNo(String yubinNo) {
		this.yubinNo = yubinNo;
	}

	public String getJusho() {
		return jusho;
	}

	public void setJusho(String jusho) {
		this.jusho = jusho;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobileTel() {
		return mobileTel;
	}

	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}

	public Integer getShokushuCd() {
		return shokushuCd;
	}

	public void setShokushuCd(Integer shokushuCd) {
		this.shokushuCd = shokushuCd;
	}


	public PageConditionDto getPageConditionDto() {
		return pageConditionDto;
	}

	public void setPageConditionDto(PageConditionDto pageConditionDto) {
		this.pageConditionDto = pageConditionDto;
	}


}
