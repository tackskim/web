--------------------------------------------------------
--  DDL for Table ADLOGIN
--------------------------------------------------------

  CREATE TABLE "H1"."ADLOGIN" 
   (	"ID" VARCHAR2(20 BYTE), 
	"PW" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table BROAD
--------------------------------------------------------

  CREATE TABLE "H1"."BROAD" 
   (	"TITLE" VARCHAR2(20 BYTE), 
	"PRODUCTION" VARCHAR2(20 BYTE), 
	"SCREEN" VARCHAR2(20 BYTE), 
	"CAST" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CAREER
--------------------------------------------------------

  CREATE TABLE "H1"."CAREER" 
   (	"TITLE" VARCHAR2(20 BYTE), 
	"CONTENT" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CRUNEW
--------------------------------------------------------

  CREATE TABLE "H1"."CRUNEW" 
   (	"TITLE" VARCHAR2(20 BYTE), 
	"CONTENT" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ENDS
--------------------------------------------------------

  CREATE TABLE "H1"."ENDS" 
   (	"TITLE" VARCHAR2(20 BYTE), 
	"PRODUCTION" VARCHAR2(20 BYTE), 
	"SCREEN" VARCHAR2(20 BYTE), 
	"CAST" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table INTERN
--------------------------------------------------------

  CREATE TABLE "H1"."INTERN" 
   (	"TITLE" VARCHAR2(20 BYTE), 
	"CONTENT" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table RELEASES
--------------------------------------------------------

  CREATE TABLE "H1"."RELEASES" 
   (	"CONTENT" VARCHAR2(20 BYTE), 
	"DAY" VARCHAR2(20 BYTE), 
	"TITLE" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table USLOGIN
--------------------------------------------------------

  CREATE TABLE "H1"."USLOGIN" 
   (	"ID" VARCHAR2(20 BYTE), 
	"PW" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table VIEWCOMMENT
--------------------------------------------------------

  CREATE TABLE "H1"."VIEWCOMMENT" 
   (	"TITLE" VARCHAR2(20 BYTE), 
	"CONTENT" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
