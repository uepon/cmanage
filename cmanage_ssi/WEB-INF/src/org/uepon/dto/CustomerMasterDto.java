package org.uepon.dto;

import java.io.Serializable;

import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;

public class CustomerMasterDto implements Serializable {

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

    public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}
	@RequiredStringValidator(message="名前を入力してください")
	@StringLengthFieldValidator(maxLength = "100" , trim=true, message="名前の入力が不正です")
	public void setName(String name) {
		this.name = name;
	}

	public String getShozokuKigyo() {
		return shozokuKigyo;
	}
	@StringLengthFieldValidator(maxLength = "100" , trim=true, message="所属企業の入力が不正です")
	public void setShozokuKigyo(String shozokuKigyo) {
		this.shozokuKigyo = shozokuKigyo;
	}

	public String getYubinNo() {
		return yubinNo;
	}
	@RegexFieldValidator(expression="\\d{3}-\\d{4}", message="郵便番号の入力が不正です")
	public void setYubinNo(String yubinNo) {
		this.yubinNo = yubinNo;
	}

	public String getJusho() {
		return jusho;
	}
	@StringLengthFieldValidator(maxLength = "100" , trim=true, message="住所の入力が不正です")
	public void setJusho(String jusho) {
		this.jusho = jusho;
	}

	public String getTel() {
		return tel;
	}
	@RegexFieldValidator(expression="^[0-9\\-]+$", message="電話番号の入力が不正です")
	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMobileTel() {
		return mobileTel;
	}
	@RegexFieldValidator(expression="^[0-9\\-]+$", message="携帯電話の入力が不正です")
	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}

	public Integer getShokushuCd() {
		return shokushuCd;
	}
	@RegexFieldValidator(expression="[0-9]+$", message="職業コードの入力が不正です")
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
