CREATE TABLE transporter  ( 
	id            	varchar(32,0) NOT NULL,
	code          	varchar(5,0) NOT NULL,
	description   	varchar(255,0) NOT NULL,
	last_update_by	varchar(32,0),
	last_update_on	datetime year to fraction(5),
	created_by    	varchar(32,0) NOT NULL,
	created_on    	datetime year to fraction(5) NOT NULL 
	)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('id001', 'ACHI', 'ACHI JAYA SDN BHD', NULL, NULL, 'MIGRATED_DATA', EXTEND(MDY(2,4,2015), YEAR to SECOND)+14 UNITS HOUR+23 UNITS MINUTE+23 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_1', 'H06', 'HAEG CONSULTANCY & SERVICES SB', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_2', 'K01', 'KEJURUTERAAN AWAM CANG CENG', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_3', 'A01', 'ACHIPELAGO SHIPPING (S)SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_4', 'A02', 'AIR MARINE CARGO AGENCY', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_5', 'A03', 'A.B.F. SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_6', 'A04', 'A.T.DUNIA SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_7', 'B02', 'BACOM BINTULU FERTILISERS', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_8', 'B03', 'BOUSTEAD SHIPPING SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_9', 'B04', 'BARWIL AGENCIES SDN. BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_10', 'B05', 'BINTULU EDIBLE OIL SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_11', 'J01', 'JIMSBURG SERVICES SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_12', 'C01', 'C.K.Y TRADING', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_13', 'E01', 'ESSO BORNEO SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_14', 'F01', 'FAURO AND SIMA HOLDING', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_15', 'H01', 'HARRISONS TRADING(S)SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_16', 'H02', 'HARBOUR SERVICES SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_17', 'M01', 'MIGHTYLINE SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_18', 'M02', 'MAXLINE SHIPPING AGENCIES S/B', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_19', 'S01', 'SEBOR (S) MARKETING & SERVICES', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_20', 'I01', 'INTERCARGO SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_21', 'I02', 'INTERCARGO SHIPPING & FORWARDING', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_22', 'T01', 'TAN YONG SING (MIRI) SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_23', 'G01', 'GEMA HIJAU SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_24', 'M03', 'M.L.N.G SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_25', 'S02', 'SHELL MDS SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_26', 'A05', 'ANTAH TRANSACT SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_27', 'S03', 'SIM SWEE JOO SHIPPING SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_28', 'B01', 'BINTULU ADHESIVES & CHEMICALS', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_29', 'S04', 'SABOMA SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_30', 'S05', 'SHELL TIMUR SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_31', 'P01', 'PETRONAS DAGANGAN SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_32', 'P02', 'POLY TRADING', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_33', 'S06', 'SYARIKAT SEBANGUN SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_34', 'P03', 'PAN SARAWAK CO.SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_35', 'T02', 'TRANSMARINE SHIPPING AGENCY', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_36', 'I03', 'ISTI JAYA TRANSACT CO.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_37', 'B06', 'BINTULU COLD STORAGE (1982)S/B', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_38', 'B07', 'BORNEO UNITED SAWMILLS SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_39', 'C02', 'CONTINENTAL FORWARDER & TRANSPOR', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_40', 'U01', 'UNIVERSAL SHIPPING SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_41', 'E02', 'E.S.NG PEMBINAAN PERNIAGAAN S/B', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_42', 'T03', 'TANJUNGRIA SHIPPING & FORWARDING', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_43', 'T04', 'TECK SING LIK SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_44', 'M04', 'MAS LAUT SHIPPING', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_45', 'F02', 'FORESTRADE SDN. BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_46', 'M05', 'MOHD.MAHMUD SHIPPING SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_47', 'F03', 'FORTUNE TRADING COMPANY', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_48', 'S07', 'SHELL REFINING(FOM)', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_49', 'T05', 'TENATIGA SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_50', 'G02', 'GROFIELDS SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_51', 'H03', 'HARBOUR AGENCIES SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_52', 'H04', 'HOCK LEE HOLDING SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_53', 'J02', 'JIM LOGS TRADING CO. SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_54', 'J03', 'JOE CURIO FORWARDING AGENCIES', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_55', 'A06', 'ASIA TRANSPORT SERVICES', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_56', 'K02', 'KRIS PAHLAWAAN SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_57', 'K03', 'KTS SDN. BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_58', 'B08', 'BHP LYSAGHT, 8 MILE, JALAN', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_59', 'L01', 'LION (MALAYSIA) SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_60', 'L02', 'LEMBAGA PELABUHAN BINTULU', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_61', 'M07', 'MANUPLY WOOD INDUSTRIEES (S)', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_62', 'M08', 'MAJOROLE SDN. BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_63', 'M06', 'MALAYSIAN SHIPPING AGENCIES S/B', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_64', 'O01', 'OKUTAI TIMBER PRODUCTS', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_65', 'O02', 'OMAR SHIPPING & FORWADING S/B', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_66', 'O03', 'OVERSEAS PETROLEUM (OPIC)', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_67', 'P04', 'POSAN (SARAWAK) SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_68', 'P05', 'PERMAISARA SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_70', 'R01', 'RIMEX INDUSTRIES SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_71', 'S08', 'SING YANG TRADING SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_72', 'S10', 'SASCO SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_73', 'S09', 'SHIN YANG TIMBER PROCESSING', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_74', 'S11', 'SABOMA (S) SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_75', 'S13', 'SYT PEMBANGUNAN/PEMBINAAN', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_76', 'S12', 'SYARIKAT POLY COLDSTORAGE', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_77', 'S14', 'SAMLING PLYWOOD (BTU) SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_78', 'S15', 'SUMILINSA SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_79', 'T06', 'TRANS TEAM SERVICES SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_80', 'S16', 'SRI MINAH TIMBER INDUSTRIES S/B', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_81', 'T07', 'TECK HONG (S) SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_82', 'T08', 'TRACTOR MALAYSIA SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_83', 'TO9', 'TOMITA CONCRETE SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_84', 'T11', 'TABWOOD SAWMILL SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_85', 'T10', 'TRENGGO MINERALS SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_86', 'Y01', 'YUKONG LINE (S) PTE LTD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_87', 'W01', 'WINSAR PLYWOOD SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_88', 'D01', 'DAIYA MALAYSIA SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_89', 'Z01', 'ZEDTEE PLYWOODS SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_90', 'Z02', 'ZEDTEE SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_91', 'Z99', 'DUMMY SHIP AGENT', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_92', 'M09', 'MASTAR CORPORATION SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_93', 'I04', 'INTERCARGO SHIPPING SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_94', 'M10', 'MAWILLA DUA', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_95', 'B09', 'BUNGA TENAGA SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_96', 'B10', 'BINTULU FREIGHT FORWARDERS S/B', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_97', 'H05', 'HYPER SHIPPING SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_98', 'D02', 'DYNAROY CORPORATION SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_99', 'K04', 'KEMBARA SHIPPING SDN. BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_100', 'S17', 'SHIN YANG SHIPPING SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_101', 'K05', 'KUEH LEONG HUP', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_102', 'G03', 'GROMART ENTERPRISE SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_103', 'C03', 'CMS TRANSPORTATION SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_104', 'K06', 'KING HUNG SHIPPING AGENCY', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_105', 'S18', 'MARINEMINE SHIPPING SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_106', 'M11', 'MARINEMINE SHIPPING SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_107', 'S19', 'SYARIKAT TENAGA SURIA', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_108', 'K07', 'KOMPASS SHIPPING CORPORATION', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_109', 'S20', 'SIM POH BOON & SONS SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_110', 'K08', 'KINGSAR SENDIRIAN BERHAD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_111', 'P06', 'POLYANG SHIPPING SDN BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_112', 'J04', 'JADE CURIO FORWARDING & SHIPPING', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_113', 'S21', 'SYARIKAT SRIBIMA SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_114', 'D03', 'DESTINY SHIPPING AGENCY SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_115', 'R02', 'RELIANCE GROMAT SHIPPING (M) S/B', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_116', 'K09', 'KESUMA SHIPPING SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_117', 'M12', 'MISC AGENCIES (SARAWAK) SDN.BHD.', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_118', 'Z03', 'ZAINON SHIPPING (SARAWAK)', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_119', 'J05', 'JADE CURIO EXPRESS SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_120', 'A07', 'ALIM MARITIME SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_121', 'G04', 'GREEN PENINSULAR AGENCY', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_122', 'S22', 'SARAWAK SHELL BERHAD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_123', 'L03', 'LURAHMAS', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_124', 'P07', 'PASTI BERNAS SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_125', 'K10', 'KONSORTIUM LOGISTIK (SWK) S/B', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_126', 'A08', 'A.T.DUNIA (MIRI) SD.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_127', 'K11', 'KAWASAKI KINKAI KISEN KAISHA (M)', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_128', 'J06', 'JOVERLINE AGENCIES SDN BHD C/O', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_129', 'O04', 'ORION SHIPPING & FORWARDING S/B', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_130', 'SKS', 'SAKARGO SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_131', 'T09', 'TIDALMARINE KUALA INDAH JV', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_132', 'A09', 'ACHI JAYA TRANSPORTATION SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_133', 'T12', 'TEMVES (BINTULU).SDN.BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_134', 'EMS', 'EM SHIPPING SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_135', 'P08', 'PASTI LAKSANA SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_136', 'B11', 'BEBASA SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_137', 'T13', 'TENAGA RIM SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('vendor_conv_138', 'JAS', 'JASMINE SHIPPING SDN BHD', '', NULL, 'MIGRATED_DATA', EXTEND(MDY(12,6,2006), YEAR to SECOND)+12 UNITS HOUR+0 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('40818183100617df01100617df9b0001', 'BPSB', 'BINTULU PORT SDN BHD', NULL, NULL, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(1,9,2007), YEAR to SECOND)+17 UNITS HOUR+2 UNITS MINUTE+12 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('408181821154faf4011154faf4460001', 'K12', 'KUDRAT MARITIME (SABAH)S/B', NULL, NULL, 'MIGRATED_DATA', EXTEND(MDY(3,15,2007), YEAR to SECOND)+17 UNITS HOUR+43 UNITS MINUTE+24 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('408181821154faf4011154fb9e430003', 'SAK', 'SAKURA BAGGAGE TRSPT FWDG & SHPG', NULL, NULL, 'MIGRATED_DATA', EXTEND(MDY(3,15,2007), YEAR to SECOND)+17 UNITS HOUR+44 UNITS MINUTE+8 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('408181821154faf4011154fd1d520005', 'SUM', 'SYARIKAT UMINACA SDN BHD', NULL, NULL, 'MIGRATED_DATA', EXTEND(MDY(3,15,2007), YEAR to SECOND)+17 UNITS HOUR+45 UNITS MINUTE+46 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('408181821154faf4011154fe49f70007', 'B12', 'BINTULU G.M.P. TRADING SDN. BHD', NULL, NULL, 'MIGRATED_DATA', EXTEND(MDY(3,15,2007), YEAR to SECOND)+17 UNITS HOUR+47 UNITS MINUTE+3 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a53e721421', 'CJ', 'Chung Jing S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+32 UNITS MINUTE+11 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a5a760145b', 'SH', 'San Hup S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+32 UNITS MINUTE+38 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a5f125145f', 'HS', 'Harbour Services S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+32 UNITS MINUTE+57 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a637961461', 'MU', 'Melinau S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+33 UNITS MINUTE+15 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a6794b1499', 'IO', 'Intercargo S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+33 UNITS MINUTE+32 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a70ada14a3', 'ZE', 'Zedtee S/B', '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,18,2007), YEAR to SECOND)+10 UNITS HOUR+12 UNITS MINUTE+23 UNITS SECOND, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+34 UNITS MINUTE+9 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a74b8814b7', 'BCS', 'BCS S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+34 UNITS MINUTE+26 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a7966c14dd', 'SSJ', 'SSJ S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+34 UNITS MINUTE+45 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a7d86514df', 'DH', 'Destiny Hub S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+35 UNITS MINUTE+2 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a81d9b14e2', 'DT', 'Destiny Transport S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+35 UNITS MINUTE+19 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a854a114e4', 'MY', 'Mightyline S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+35 UNITS MINUTE+34 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a890cf14e9', 'YB', 'Yus Brothers S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+35 UNITS MINUTE+49 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a8c02e14ef', 'CT', 'Casolid Transport S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+36 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211b64e230111b7a9090e14ff', 'IT', 'Idris Transport S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,3,2007), YEAR to SECOND)+21 UNITS HOUR+36 UNITS MINUTE+20 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211d65f9e0111de16b21516f2', 'M13', 'MENWIN SHIPPING AGENCY SDN BHD', NULL, NULL, '408181830bfeb541010bfeb731ed0004', EXTEND(MDY(4,11,2007), YEAR to SECOND)+8 UNITS HOUR+41 UNITS MINUTE+41 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818211eaf1060111ef09c3f713d9', 'ML', 'Manuply Shipping Sdn Bhd', '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(4,18,2007), YEAR to SECOND)+10 UNITS HOUR+14 UNITS MINUTE+43 UNITS SECOND, '408181830f2cb73b010f31ab2523088d', EXTEND(MDY(4,14,2007), YEAR to SECOND)+15 UNITS HOUR+41 UNITS MINUTE+6 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('40818182120f1fda0112134d1d431b1d', 'TANG', 'TANG CONTAINER & SERVICES S.B', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+24 UNITS MINUTE+50 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,21,2007), YEAR to SECOND)+16 UNITS HOUR+40 UNITS MINUTE+59 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('40818182120f1fda0112134d65b61b21', 'RT', 'R.T.CARGO TRANSPORTATION AGY', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+25 UNITS MINUTE+3 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,21,2007), YEAR to SECOND)+16 UNITS HOUR+41 UNITS MINUTE+18 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('40818182120f1fda0112134da8fb1b29', 'ZAI', 'ZAINON SHIPPING', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+27 UNITS MINUTE+16 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,21,2007), YEAR to SECOND)+16 UNITS HOUR+41 UNITS MINUTE+35 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('40818182120f1fda0112134de2ae1b31', 'MISC', 'CONTAINERS SERVICES & TSPORT', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+23 UNITS MINUTE+28 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,21,2007), YEAR to SECOND)+16 UNITS HOUR+41 UNITS MINUTE+50 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bec095211b0', 'TMFF', 'TRANS MIRI FREIGHT FWDR.S.B', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+24 UNITS MINUTE+5 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+51 UNITS MINUTE+32 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bec876511b5', 'HTSB', 'HIGH TRACKLE SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+21 UNITS MINUTE+59 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+52 UNITS MINUTE+5 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bed888111e4', 'AMCA', 'AIR-MARINE CARGO SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+18 UNITS MINUTE+54 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+53 UNITS MINUTE+10 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bedd42f11ee', 'HSSB', 'HARBOUR SERVICES SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+21 UNITS MINUTE+25 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+53 UNITS MINUTE+30 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf17c0d1232', 'BCSSB', 'BINTULU CONTAINER SERVICES S/B', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+19 UNITS MINUTE+52 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+57 UNITS MINUTE+29 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf1de821237', 'SSJSB', 'SIM SWEE JOO SDN BERHAD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+25 UNITS MINUTE+16 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+57 UNITS MINUTE+55 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf22bf1123a', 'CKY', 'CKY TRADING SDN BERHAD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+20 UNITS MINUTE+51 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+58 UNITS MINUTE+14 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf27cc3123d', 'KESU', 'KESUMA SHIPPING AND FWDG S/B', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+26 UNITS MINUTE+13 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+58 UNITS MINUTE+35 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf2bf3e1242', 'INTR', 'INTERCARGO SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+24 UNITS MINUTE+56 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+58 UNITS MINUTE+52 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf2fdb41245', 'LSTC', 'LEE SING TRADING COMPANY MIRI', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+22 UNITS MINUTE+22 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+59 UNITS MINUTE+8 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf3509c124b', 'MAJ', 'MAJOROLE S/B BTU.', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+23 UNITS MINUTE+12 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+59 UNITS MINUTE+29 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf3ad11125f', 'JC', 'JOE CURIO FWDG & SHPG S/B BTU', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+22 UNITS MINUTE+29 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+8 UNITS HOUR+59 UNITS MINUTE+53 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf416411267', 'JCE', 'JADE CURIO EXPRESS S/B BTU', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+22 UNITS MINUTE+15 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+0 UNITS MINUTE+20 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf47a8e128d', 'EPSS', 'EASTERN PILLARS SDN BHD SIBU', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+25 UNITS MINUTE+39 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+0 UNITS MINUTE+46 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf4c3361292', 'POLY', 'POLY SHPG SDN BHD BINTULU', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+23 UNITS MINUTE+54 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+1 UNITS MINUTE+4 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf51073129a', 'SPBS', 'SIM POH BOON & SONS SDN.BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+24 UNITS MINUTE+41 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+1 UNITS MINUTE+24 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf5620d129d', 'ATD', 'A.T. DUNIA (MIRI) SDN BHD MIRI', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+19 UNITS MINUTE+4 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+1 UNITS MINUTE+45 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf59e9c12a6', 'DEST', 'DESTINY TRANSPORT SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+20 UNITS MINUTE+58 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+2 UNITS MINUTE+0 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf5dde612b4', 'OMA', 'OMA SHIPPING  & FWDG SB BTU', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+25 UNITS MINUTE+23 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+2 UNITS MINUTE+17 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf62f2e12b9', 'BICT', 'BINTULU INTERNATIONAL CONTR.', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+20 UNITS MINUTE+10 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+2 UNITS MINUTE+37 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf6687a12bb', 'JCFS', 'JOE CURIO FWDG & SHPG S/B BTU', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+22 UNITS MINUTE+5 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+2 UNITS MINUTE+52 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf69fc112bd', 'HARI', 'HARRISONS TRADING (S) SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+25 UNITS MINUTE+9 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+3 UNITS MINUTE+6 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf6de5912bf', 'ELHA', 'ELHA SUPPLY & ENGINEERING', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+26 UNITS MINUTE+32 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+3 UNITS MINUTE+22 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf738d012ca', 'ITSB', 'IDRIS TRANSPORT & TRADING S/B', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+21 UNITS MINUTE+18 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+3 UNITS MINUTE+45 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf775b612ce', 'HYPR', 'HYPER SHIPPING SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+25 UNITS MINUTE+31 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+4 UNITS MINUTE+1 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf7b4b812d2', 'UNIT', 'UNITED TRAILLER (M) S/B SIBU', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+26 UNITS MINUTE+21 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+4 UNITS MINUTE+17 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf8735f12e5', 'SSBT', 'SOON SEN BROTHERS TRANSPORT', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+25 UNITS MINUTE+46 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+5 UNITS MINUTE+6 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf8cd6e12e7', 'STS', 'SYARIKAT TENAGA SURIA (EM) S/B', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+27 UNITS MINUTE+6 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+5 UNITS MINUTE+29 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf9043712e9', 'HARR', 'HARRISONS TRDG (S) SDN.BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+21 UNITS MINUTE+51 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+5 UNITS MINUTE+43 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bf9512a12f0', 'KONS', 'KONSORTIUM LOGISTIK (S) S/B', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+22 UNITS MINUTE+43 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+6 UNITS MINUTE+3 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfa0e9112f6', 'BFF', 'BINTULU FREIGHT FORWARDING', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+20 UNITS MINUTE+3 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+6 UNITS MINUTE+51 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfa581d12f9', 'TAN', 'TAN YONG SING {MIRI} S/B BTU', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+24 UNITS MINUTE+15 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+7 UNITS MINUTE+10 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfaea061300', 'MERL', 'MERLIN TRDG AGENCY BTU', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+22 UNITS MINUTE+54 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+7 UNITS MINUTE+47 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfb9b7f130d', 'JASB', 'JOVERLINE AGENCIES S/B BTU', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+23 UNITS MINUTE+2 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+8 UNITS MINUTE+33 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfbf9761319', 'SRI', 'SYKT.SRIBIMA SDN.BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+23 UNITS MINUTE+45 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+8 UNITS MINUTE+57 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfc3575131c', 'ALIM', 'ALIM MARITIME SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+18 UNITS MINUTE+45 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+9 UNITS MINUTE+12 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfc7b81131f', 'MTSB', 'MELINAU TRANSPORT S/B', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+22 UNITS MINUTE+36 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+9 UNITS MINUTE+30 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfcb7c11345', 'ZEDT', 'ZEDTEE PLYWOOD SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+27 UNITS MINUTE+24 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+9 UNITS MINUTE+46 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfd1dd9134a', 'SAKSB', 'S.A KARGO S/B|BPBRT154', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+23 UNITS MINUTE+38 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+10 UNITS MINUTE+12 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfd7200134c', 'POL', 'POLYANG SHIPPING SDN.BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+23 UNITS MINUTE+18 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+10 UNITS MINUTE+33 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfdbc2d1350', 'EVER', 'EVERGREEN MARINE CORP(M)S/B', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+21 UNITS MINUTE+10 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+10 UNITS MINUTE+52 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfdf4e41355', 'DIAN', 'DIAN GLOBAL SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+26 UNITS MINUTE+49 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+11 UNITS MINUTE+7 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfe36101357', 'TRAC', 'TRAC-WHEELS(M)SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+24 UNITS MINUTE+33 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+11 UNITS MINUTE+23 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfe79331359', 'PREM', 'PREMIER PATH LOGISTICS SDN BHD', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+24 UNITS MINUTE+24 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+11 UNITS MINUTE+41 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bfed89e135d', 'EMSSB', 'EM SHIPPING S/B', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+21 UNITS MINUTE+43 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+12 UNITS MINUTE+5 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bff24031372', 'FAR', 'SYKT.FAR EAST TRADING AGENCY', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+21 UNITS MINUTE+33 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+12 UNITS MINUTE+24 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212140b6e01121bff65191378', 'STRF', 'SWEE HUAT RECV & FWDG', '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+25 UNITS MINUTE+54 UNITS SECOND, '408181830ed4eea1010edf7407ca006c', EXTEND(MDY(4,23,2007), YEAR to SECOND)+9 UNITS HOUR+12 UNITS MINUTE+41 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('40818182126e461a01126ee899820dce', 'MX', 'Maxline Shipping S/B', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(5,9,2007), YEAR to SECOND)+11 UNITS HOUR+36 UNITS MINUTE+16 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('40818182126e461a01126eeb4abd0ddf', 'CKYT', 'CKY Trading Co.', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(5,9,2007), YEAR to SECOND)+11 UNITS HOUR+39 UNITS MINUTE+12 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212aedeaf0112b1bf73d20ad1', 'AM', 'Air Marine Agency', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(5,22,2007), YEAR to SECOND)+11 UNITS HOUR+5 UNITS MINUTE+53 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818212aedeaf0112b1bfbed80ad3', 'JV', 'Joverline', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(5,22,2007), YEAR to SECOND)+11 UNITS HOUR+6 UNITS MINUTE+12 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818213b545700113b861571f09f1', 'P09', 'PERKAPALAN DAI ZHUN SDN BHD', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(7,12,2007), YEAR to SECOND)+11 UNITS HOUR+3 UNITS MINUTE+13 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('408181821416fa3301142037fb3a1699', 'MS', 'Miscellaneous', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(8,1,2007), YEAR to SECOND)+14 UNITS HOUR+58 UNITS MINUTE+33 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('P10', 'P10', 'PAKAT GLOBAL SERVICES', NULL, NULL, '408181830ed4eea1010ed53e05e20032', EXTEND(MDY(11,11,2007), YEAR to SECOND)+11 UNITS HOUR+0 UNITS MINUTE+0 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('4081818218a01df90118a238d7530b50', 'B13', 'BARAM LOGISTIK SDN BHD', '408181830bfeb541010bfeb731ed0004', EXTEND(MDY(3,12,2008), YEAR to SECOND)+17 UNITS HOUR+2 UNITS MINUTE+10 UNITS SECOND, '408181830bfeb541010bfeb731ed0004', EXTEND(MDY(3,12,2008), YEAR to SECOND)+17 UNITS HOUR+1 UNITS MINUTE+17 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('40818182193035d80119324ba94d0b68', 'W02', 'WILHELMSEN SHIPS SERVICE (M) SDN BHD', NULL, NULL, '408181830bfeb541010bfeb731ed0004', EXTEND(MDY(4,9,2008), YEAR to SECOND)+16 UNITS HOUR+27 UNITS MINUTE+9 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('40818182197319f301197454420004c0', 'J07', 'JOINT SHIPPING SDN BHD', NULL, NULL, '408181830bfeb541010bfeb731ed0004', EXTEND(MDY(4,22,2008), YEAR to SECOND)+12 UNITS HOUR+11 UNITS MINUTE+29 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('408181821a228236011a246ecd5b0fbf', 'G05', 'GAPIMA SDN BHD', NULL, NULL, '408181830bfeb541010bfeb731ed0004', EXTEND(MDY(5,26,2008), YEAR to SECOND)+16 UNITS HOUR+53 UNITS MINUTE+38 UNITS SECOND)
GO
INSERT INTO transporter(id, code, description, last_update_by, last_update_on, created_by, created_on)
  VALUES('408181821b4d2542011b4d6a4fdf0137', 'KT', 'KEYWORK TRANSPORT', NULL, NULL, '40818182119d4e6d0111a10849f50a88', EXTEND(MDY(7,23,2008), YEAR to SECOND)+8 UNITS HOUR+55 UNITS MINUTE+57 UNITS SECOND)
GO
