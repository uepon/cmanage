create table customer_master (
customer_id int unsigned NOT NULL auto_increment,
name VARCHAR(255) NOT NULL,
shozoku_kigyo VARCHAR(255),
yubin_no VARCHAR(8),
jusho VARCHAR(255),
tel VARCHAR(30),
mobile_tel VARCHAR(30),
shokushu_cd int,
constraint KEY_NAME primary key (
customer_id
)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;