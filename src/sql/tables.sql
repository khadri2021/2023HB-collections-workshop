-- by using set and map starts

drop table rivers;
drop table capitals;
drop table country;

create table country(COUNTRY_ID int primary key,COUNTRY_NAME varchar(30));
create table rivers(COUNTRY_ID int,RIVER_NAME varchar(30),key (COUNTRY_ID),constraint foreign key(COUNTRY_ID) references country(COUNTRY_ID));
create table capitals(COUNTRY_ID int,STATE_NAME varchar(30),CAPITAL_NAME varchar(30),key (COUNTRY_ID),constraint foreign key(COUNTRY_ID) references country(COUNTRY_ID));

select * from country;
select * from rivers;
select * from capitals;

-- by using set and map ends

-- one2one using primary key starts

DROP TABLE EMPLOYEE;
DROP TABLE ADHAAR_CARD;

CREATE TABLE EMPLOYEE (
   EMP_ID varchar(32) NOT NULL ,
   EMP_NAME varchar(30) NOT NULL,
   PRIMARY KEY (EMP_ID)
);
CREATE TABLE WORK_STATION (
   WORK_STATION_ID varchar(32) NOT NULL,
   WORK_STATION_FLOOR varchar(30) NOT NULL,
   WORK_STATION_BLOCK varchar(30) NOT NULL,
   PRIMARY KEY (WORK_STATION_ID)
);

select * from  EMPLOYEE;
select * from  WORK_STATION;

-- one2one using primary key ends

-- one2many using foreign key starts

DROP TABLE EMPLOYEE1;
DROP TABLE PROJECTS;

CREATE TABLE EMPLOYEE1(
EMP_ID VARCHAR(32) NOT NULL,
EMP_NAME VARCHAR(30) NOT NULL, 
PRIMARY KEY(EMP_ID)
);
CREATE TABLE PROJECTS(
PROJECT_ID VARCHAR(32) NOT NULL,
PROJECT_NAME VARCHAR(30)NOT NULL,
PROJECT_DURATION VARCHAR(30) NOT NULL,
EMP_ID VARCHAR(32) NOT NULL,
PRIMARY KEY (PROJECT_ID),
KEY (EMP_ID),
CONSTRAINT FOREIGN KEY(EMP_ID) REFERENCES EMPLOYEE1(EMP_ID)
);

select * from  EMPLOYEE1;
select * from  PROJECTS;

-- one2many using foreign key ends