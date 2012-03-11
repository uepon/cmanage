package org.uepon.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link CustomerMaster}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/02/21 14:09:18")
public class CustomerMasterNames {

    /**
     * customerIdのプロパティ名を返します。
     * 
     * @return customerIdのプロパティ名
     */
    public static PropertyName<Long> customerId() {
        return new PropertyName<Long>("customerId");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * shozokuKigyoのプロパティ名を返します。
     * 
     * @return shozokuKigyoのプロパティ名
     */
    public static PropertyName<String> shozokuKigyo() {
        return new PropertyName<String>("shozokuKigyo");
    }

    /**
     * yubinNoのプロパティ名を返します。
     * 
     * @return yubinNoのプロパティ名
     */
    public static PropertyName<String> yubinNo() {
        return new PropertyName<String>("yubinNo");
    }

    /**
     * jushoのプロパティ名を返します。
     * 
     * @return jushoのプロパティ名
     */
    public static PropertyName<String> jusho() {
        return new PropertyName<String>("jusho");
    }

    /**
     * telのプロパティ名を返します。
     * 
     * @return telのプロパティ名
     */
    public static PropertyName<String> tel() {
        return new PropertyName<String>("tel");
    }

    /**
     * mobileTelのプロパティ名を返します。
     * 
     * @return mobileTelのプロパティ名
     */
    public static PropertyName<String> mobileTel() {
        return new PropertyName<String>("mobileTel");
    }

    /**
     * shokushuCdのプロパティ名を返します。
     * 
     * @return shokushuCdのプロパティ名
     */
    public static PropertyName<Integer> shokushuCd() {
        return new PropertyName<Integer>("shokushuCd");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CustomerMasterNames extends PropertyName<CustomerMaster> {

        /**
         * インスタンスを構築します。
         */
        public _CustomerMasterNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CustomerMasterNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _CustomerMasterNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * customerIdのプロパティ名を返します。
         *
         * @return customerIdのプロパティ名
         */
        public PropertyName<Long> customerId() {
            return new PropertyName<Long>(this, "customerId");
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * shozokuKigyoのプロパティ名を返します。
         *
         * @return shozokuKigyoのプロパティ名
         */
        public PropertyName<String> shozokuKigyo() {
            return new PropertyName<String>(this, "shozokuKigyo");
        }

        /**
         * yubinNoのプロパティ名を返します。
         *
         * @return yubinNoのプロパティ名
         */
        public PropertyName<String> yubinNo() {
            return new PropertyName<String>(this, "yubinNo");
        }

        /**
         * jushoのプロパティ名を返します。
         *
         * @return jushoのプロパティ名
         */
        public PropertyName<String> jusho() {
            return new PropertyName<String>(this, "jusho");
        }

        /**
         * telのプロパティ名を返します。
         *
         * @return telのプロパティ名
         */
        public PropertyName<String> tel() {
            return new PropertyName<String>(this, "tel");
        }

        /**
         * mobileTelのプロパティ名を返します。
         *
         * @return mobileTelのプロパティ名
         */
        public PropertyName<String> mobileTel() {
            return new PropertyName<String>(this, "mobileTel");
        }

        /**
         * shokushuCdのプロパティ名を返します。
         *
         * @return shokushuCdのプロパティ名
         */
        public PropertyName<Integer> shokushuCd() {
            return new PropertyName<Integer>(this, "shokushuCd");
        }
    }
}