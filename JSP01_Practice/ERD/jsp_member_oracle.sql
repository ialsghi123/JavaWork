
/* Drop Tables */

DROP TABLE jsp_member CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE jsp_member
(
	id varchar2(50) NOT NULL,
	password varchar2(50) NOT NULL,
	name varchar2(50),
	gender varchar2(10),
	birth date,
	mail varchar2(100),
	phone varchar2(50),
	address varchar2(200),
	reg date DEFAULT SYSDATE,
	PRIMARY KEY (id)
);



