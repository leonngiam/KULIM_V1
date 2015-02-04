CREATE TABLE product  ( 
	id            	varchar(32,0) NOT NULL,
	code            varchar(5) NOT NULL,
	description     varchar(255,0) NOT NULL,
	last_update_by	varchar(32,0),
	last_update_on	datetime year to fraction(5),
	created_by    	varchar(32,0) NOT NULL,
	created_on    	datetime year to fraction(5) NOT NULL 
	)
GO
insert into product
values('id001', 'FFB', 'FFB', null, null, 'MIGRATED_DATA', current)
