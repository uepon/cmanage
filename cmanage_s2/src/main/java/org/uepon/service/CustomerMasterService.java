package org.uepon.service;

import static org.seasar.extension.jdbc.operation.Operations.asc;
import static org.uepon.entity.CustomerMasterNames.customerId;

import java.util.List;

import javax.annotation.Generated;

import org.uepon.dto.PageConditionDto;
import org.uepon.entity.CustomerMaster;

/**
 * {@link CustomerMaster}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/02/21 14:09:22")
public class CustomerMasterService extends AbstractService<CustomerMaster> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param customerId
     *            識別子
     * @return エンティティ
     */
    public CustomerMaster findById(Long customerId) {
        return select().id(customerId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<CustomerMaster> findAllOrderById() {
        return select().orderBy(asc(customerId())).getResultList();
    }

    public List<CustomerMaster> find(PageConditionDto conditionDto) {
        return select().orderBy(asc(customerId())).offset(conditionDto.getOffset()).limit(conditionDto.limit).getResultList();
    }
}