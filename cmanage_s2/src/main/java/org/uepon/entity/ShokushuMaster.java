package org.uepon.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * ShokushuMasterエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/02/21 14:09:14")
public class ShokushuMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    /** shokushuCdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer shokushuCd;

    /** shokushuNameプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String shokushuName;
}