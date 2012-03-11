package org.uepon.entity;

import javax.annotation.Generated;
import org.uepon.entity.CustomerMasterNames._CustomerMasterNames;
import org.uepon.entity.ShokushuMasterNames._ShokushuMasterNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2012/02/21 14:09:18")
public class Names {

    /**
     * {@link CustomerMaster}の名前クラスを返します。
     * 
     * @return CustomerMasterの名前クラス
     */
    public static _CustomerMasterNames customerMaster() {
        return new _CustomerMasterNames();
    }

    /**
     * {@link ShokushuMaster}の名前クラスを返します。
     * 
     * @return ShokushuMasterの名前クラス
     */
    public static _ShokushuMasterNames shokushuMaster() {
        return new _ShokushuMasterNames();
    }
}