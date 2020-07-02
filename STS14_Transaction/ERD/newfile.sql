
/* Drop Tables */

DROP TABLE board CASCADE CONSTRAINTS;
DROP TABLE join CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE board
(
	board_uid number NOT NULL,
	board_name varchar2(20),
	board_subject varchar2(20) NOT NULL,
	board_content clob NOT NULL,
	board_viewcount number DEFAULT 0,
	board_date date DEFAULT SYSDATE,
	PRIMARY KEY (board_uid)
);


CREATE TABLE join
(
	join_uid number NOT NULL,
	join_id varchar2(20) NOT NULL UNIQUE,
	join_password varchar2(20) NOT NULL,
	join_name varchar2(20) NOT NULL,
	join_email varchar2(20) UNIQUE,
	PRIMARY KEY (join_uid)
);



