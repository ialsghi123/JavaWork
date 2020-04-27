
/* Drop Tables */

DROP TABLE course CASCADE CONSTRAINTS;
DROP TABLE lecture CASCADE CONSTRAINTS;
DROP TABLE professor CASCADE CONSTRAINTS;
DROP TABLE student CASCADE CONSTRAINTS;
DROP TABLE department CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE course
(
	prono number NOT NULL,
	lecnum number NOT NULL
);


CREATE TABLE department
(
	depnum number NOT NULL,
	decphonenum varchar2(15),
	decoffice varchar2(15) NOT NULL,
	decname varchar2(15) NOT NULL,
	PRIMARY KEY (depnum)
);


CREATE TABLE lecture
(
	lecnum number NOT NULL,
	lecname varchar2(10),
	lecgrade number,
	lecpar number,
	lecroom varchar2(15),
	lecdate varchar2(15),
	pronum number NOT NULL,
	PRIMARY KEY (lecnum)
);


CREATE TABLE professor
(
	pronum number NOT NULL,
	projumin number,
	proaddress varchar2(15),
	proname varchar2(10) NOT NULL,
	proposition varchar2(10),
	prophonenum varchar2(15),
	hiredate varchar2(20),
	depnum number NOT NULL,
	PRIMARY KEY (pronum)
);


CREATE TABLE student
(
	prono number NOT NULL,
	grade number,
	phonenumber varchar2(15),
	address varchar2(30),
	jumin varchar2(15),
	name varchar2(10) NOT NULL,
	depnum number NOT NULL,
	PRIMARY KEY (prono)
);



/* Create Foreign Keys */

ALTER TABLE professor
	ADD FOREIGN KEY (depnum)
	REFERENCES department (depnum)
;


ALTER TABLE student
	ADD FOREIGN KEY (depnum)
	REFERENCES department (depnum)
;


ALTER TABLE course
	ADD FOREIGN KEY (lecnum)
	REFERENCES lecture (lecnum)
;


ALTER TABLE lecture
	ADD FOREIGN KEY (pronum)
	REFERENCES professor (pronum)
;


ALTER TABLE course
	ADD FOREIGN KEY (prono)
	REFERENCES student (prono)
;



