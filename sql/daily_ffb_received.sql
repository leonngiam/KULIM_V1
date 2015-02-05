CREATE TABLE daily_ffb_received  ( 
	id            	varchar(32,0) NOT NULL,
    vehicle_no      varchar(20),
    transporter_code    varchar(5),
    product_code    varchar(5),
    driver_code     varchar(5),
    driver_ic       varchar(20),
    remarks         varchar(255),
    weigh_in_dt     datetime year to fraction(5),
    weigh_in_tonn   decimal(12,2),
    weigh_out_dt     datetime year to fraction(5),
    weigh_out_tonn   decimal(12,2),
	last_update_by	varchar(32,0),
	last_update_on	datetime year to fraction(5),
	created_by    	varchar(32,0) NOT NULL,
	created_on    	datetime year to fraction(5) NOT NULL 
	)
GO
