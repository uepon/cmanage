package org.uepon.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * CustomerMasterエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/02/21 14:09:14")
public class CustomerMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    /** customerIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long customerId;

    /** nameプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String name;

    /** shozokuKigyoプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String shozokuKigyo;

    /** yubinNoプロパティ */
    @Column(length = 8, nullable = true, unique = false)
    public String yubinNo;

    /** jushoプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String jusho;

    /** telプロパティ */
    @Column(length = 30, nullable = true, unique = false)
    public String tel;

    /** mobileTelプロパティ */
    @Column(length = 30, nullable = true, unique = false)
    public String mobileTel;

    /** shokushuCdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer shokushuCd;
}