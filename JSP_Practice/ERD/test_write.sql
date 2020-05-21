
/* Drop Tables */

DROP TABLE practiceTable CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE practiceTable
(
	pr_uid number NOT NULL,
	pr_subject varchar2(100) NOT NULL,
	pr_content clob,
	pr_name varchar2(20) NOT NULL,
	pr_viewcnt number,
	pr_regdate date,
	pr_recommend number,
	PRIMARY KEY (pr_uid)
);

CREATE SEQUENCE practiceTable_SEQ;

SELECT * FROM practiceTable;




