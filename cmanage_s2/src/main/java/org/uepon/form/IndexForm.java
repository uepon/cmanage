package org.uepon.form;

import java.io.Serializable;
import java.util.List;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Required;
import org.uepon.dto.PageConditionDto;
import org.uepon.entity.CustomerMaster;

@Component(instance = InstanceType.SESSION)
public class IndexForm implements Serializable {
	private static final long serialVersionUID = 1L;
	public List<CustomerMaster> customerList;

    /** customerIdプロパティ */
    public Long customerId;

    /** nameプロパティ */
    @Required
    @Maxlength(maxlength = 100)
    public String name;

    /** shozokuKigyoプロパティ */
    @Maxlength(maxlength = 100)
    public String shozokuKigyo;

    /** yubinNoプロパティ */
    @Mask(mask = "^\\d{3}\\-\\d{4}$")
    public String yubinNo;

    /** jushoプロパティ */
    @Maxlength(maxlength = 100)
    public String jusho;

    /** telプロパティ */
    @Minlength(minlength = 10)
    @Maxlength(maxlength = 15)
    @Mask(mask = "^[0-9\\-]+$")
    public String tel;

    /** mobileTelプロパティ */
    @Minlength(minlength = 10)
    @Maxlength(maxlength = 15)
    @Mask(mask = "^[0-9\\-]+$")
    public String mobileTel;

    /** shokushuCdプロパティ */
    @IntegerType
    public Integer shokushuCd;

    public PageConditionDto pageConditionDto;

}
