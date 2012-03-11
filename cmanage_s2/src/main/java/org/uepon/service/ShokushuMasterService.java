package org.uepon.service;

import java.util.List;
import javax.annotation.Generated;
import org.uepon.entity.ShokushuMaster;

import static org.seasar.extension.jdbc.operation.Operations.*;
import static org.uepon.entity.ShokushuMasterNames.*;

/**
 * {@link ShokushuMaster}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/02/21 14:09:22")
public class ShokushuMasterService extends AbstractService<ShokushuMaster> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param shokushuCd
     *            識別子
     * @return エンティティ
     */
    public ShokushuMaster findById(Integer shokushuCd) {
        return select().id(shokushuCd).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<ShokushuMaster> findAllOrderById() {
        return select().orderBy(asc(shokushuCd())).getResultList();
    }
}