CREATE TABLE accounts ( 
	id            	varchar(32) NOT NULL,
	user_login    	varchar(20) NOT NULL,
	user_name     	varchar(50) NOT NULL,
	password      	varchar(32) NOT NULL,
	last_update_by	varchar(32),
	last_update_on	datetime year to fraction(5),
	created_by    	varchar(32) NOT NULL,
	created_on    	datetime year to fraction(5) NOT NULL 
	)
GO
INSERT INTO accounts(id, user_login, user_name, password, last_update_by, last_update_on, created_by, created_on)
  VALUES('id001', 'admin', 'Administrator', '12345678', 'id001', EXTEND(MDY(11,5,2014), YEAR to SECOND)+16 UNITS HOUR+35 UNITS MINUTE+36 UNITS SECOND, 'MIGRATED_DATA', EXTEND(MDY(10,28,2014), YEAR to SECOND)+11 UNITS HOUR+57 UNITS MINUTE+28 UNITS SECOND)
GO
