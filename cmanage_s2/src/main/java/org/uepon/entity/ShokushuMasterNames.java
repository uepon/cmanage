package org.uepon.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link ShokushuMaster}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/02/21 14:09:18")
public class ShokushuMasterNames {

    /**
     * shokushuCdのプロパティ名を返します。
     * 
     * @return shokushuCdのプロパティ名
     */
    public static PropertyName<Integer> shokushuCd() {
        return new PropertyName<Integer>("shokushuCd");
    }

    /**
     * shokushuNameのプロパティ名を返します。
     * 
     * @return shokushuNameのプロパティ名
     */
    public static PropertyName<String> shokushuName() {
        return new PropertyName<String>("shokushuName");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _ShokushuMasterNames extends PropertyName<ShokushuMaster> {

        /**
         * インスタンスを構築します。
         */
        public _ShokushuMasterNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _ShokushuMasterNames(final String name) {
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
        public _ShokushuMasterNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * shokushuCdのプロパティ名を返します。
         *
         * @return shokushuCdのプロパティ名
         */
        public PropertyName<Integer> shokushuCd() {
            return new PropertyName<Integer>(this, "shokushuCd");
        }

        /**
         * shokushuNameのプロパティ名を返します。
         *
         * @return shokushuNameのプロパティ名
         */
        public PropertyName<String> shokushuName() {
            return new PropertyName<String>(this, "shokushuName");
        }
    }
}