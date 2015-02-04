CREATE TABLE vehicle  ( 
	id            	varchar(32,0) NOT NULL,
	code          	varchar(20,0) NOT NULL,
	description   	varchar(255,0) NOT NULL,
	last_update_by	varchar(32,0),
	last_update_on	datetime year to fraction(5),
	created_by    	varchar(32,0) NOT NULL,
	created_on    	datetime year to fraction(5) NOT NULL 
	)
GO
INSERT INTO vehicle(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('8a8080b82a0caa30012a0caba3de0001', 'CC001', 'CC001', '4', EXTEND(MDY(6,13,2012), YEAR to SECOND)+10 UNITS HOUR+54 UNITS MINUTE+46 UNITS SECOND, '4', EXTEND(MDY(7,26,2010), YEAR to SECOND)+10 UNITS HOUR+53 UNITS MINUTE+49 UNITS SECOND)
GO
INSERT INTO vehicle(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('8a8080b92ca9dd4c012caa2ca18a0017', 'CC002', 'CC002', '4', EXTEND(MDY(5,30,2012), YEAR to SECOND)+17 UNITS HOUR+36 UNITS MINUTE+37 UNITS SECOND, '4', EXTEND(MDY(12,3,2010), YEAR to SECOND)+3 UNITS HOUR+0 UNITS MINUTE+40 UNITS SECOND)
GO
INSERT INTO vehicle(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('8a8080bc2ce2a793012ce2acc70e0006', 'CC003', 'CC003', '4', EXTEND(MDY(5,30,2012), YEAR to SECOND)+15 UNITS HOUR+46 UNITS MINUTE+8 UNITS SECOND, '4', EXTEND(MDY(12,14,2010), YEAR to SECOND)+10 UNITS HOUR+19 UNITS MINUTE+22 UNITS SECOND)
GO
INSERT INTO vehicle(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('8a8080ba33ce8c630133ce8c639a0000', 'BEX6061', 'BEX6061', '4', EXTEND(MDY(6,14,2012), YEAR to SECOND)+10 UNITS HOUR+8 UNITS MINUTE+21 UNITS SECOND, '4', EXTEND(MDY(11,23,2011), YEAR to SECOND)+11 UNITS HOUR+51 UNITS MINUTE+6 UNITS SECOND)
GO
INSERT INTO vehicle(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('8a8080ba37e3c2080137e3c208d00000', 'BEX6062', 'BEX6062', '4', EXTEND(MDY(6,13,2012), YEAR to SECOND)+10 UNITS HOUR+54 UNITS MINUTE+32 UNITS SECOND, '4', EXTEND(MDY(6,13,2012), YEAR to SECOND)+10 UNITS HOUR+52 UNITS MINUTE+53 UNITS SECOND)
GO
INSERT INTO vehicle(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('8a8080ba3d14270e013d14270e3f0000', 'QSA022601', 'QSA022601', '4', EXTEND(MDY(2,26,2013), YEAR to SECOND)+11 UNITS HOUR+32 UNITS MINUTE+2 UNITS SECOND, '4', EXTEND(MDY(2,26,2013), YEAR to SECOND)+9 UNITS HOUR+38 UNITS MINUTE+56 UNITS SECOND)
GO
INSERT INTO vehicle(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('8a8080ba3d14270e013d142770740001', 'QSA022602', 'QSA022602', '4', EXTEND(MDY(2,26,2013), YEAR to SECOND)+11 UNITS HOUR+32 UNITS MINUTE+9 UNITS SECOND, '4', EXTEND(MDY(2,26,2013), YEAR to SECOND)+9 UNITS HOUR+39 UNITS MINUTE+21 UNITS SECOND)
GO
INSERT INTO vehicle(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('8a8080ba3d148dd1013d1495c6ca0005', 'QSA022603', 'QSA022603', NULL, NULL, '4', EXTEND(MDY(2,26,2013), YEAR to SECOND)+11 UNITS HOUR+39 UNITS MINUTE+52 UNITS SECOND)
GO
