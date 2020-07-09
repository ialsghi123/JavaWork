
/* Drop Tables */

DROP TABLE test_write CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE test_write
(
	wr_uid number NOT NULL,
	wr_subject varchar2(200) NOT NULL,
	wr_content clob,
	wr_name varchar2(40) NOT NULL,
	wr_viewcnt number DEFAULT 0,
	wr_regdate date DEFAULT SYSDATE,
	PRIMARY KEY (wr_uid)
);

-- 시퀀스

CREATE SEQUENCE TEST_WRITE_SEQ;

SELECT * FROM test_write;

SELECT * FROM test_write_SEQUENCES;

SELECT * FROM USER_SEQUENCES;


SELECT GRANTED_ROLE FROM DBA_ROLE_PRIVS 
     WHERE GRANTEE ='SCOTT0316';



-- 기본데이터 작성
INSERT INTO TEST_WRITE VALUES
(TEST_WRITE_SEQ.nextval, '동전을 몇개던져봐라', '나도하', '동전던지기달인', 0, '2017-03-02');
INSERT INTO TEST_WRITE VALUES
(TEST_WRITE_SEQ.nextval, '반갑다','1111', '눈이내리면', 0, '2017-03-02');
INSERT INTO TEST_WRITE VALUES
(TEST_WRITE_SEQ.nextval, '초특급', '7394', '좌절' , 0, '2017-08-12');
INSERT INTO TEST_WRITE VALUES
(TEST_WRITE_SEQ.nextval, '자세한 설명은 생략한다', '9090', '교강용', 0, '2018-02-09');
INSERT INTO TEST_WRITE VALUES
(TEST_WRITE_SEQ.nextval, '전국구', '7531', '결호', 0, sysdate);



--다량의 데이터 필요 

SELECT * FROM test_write ORDER BY wr_uid DESC;

INSERT INTO test_write(wr_uid, wr_subject, wr_content, wr_name)
	SELECT test_write_seq.nextval, wr_subject, wr_content, wr_name FROM test_write;



DELETE FROM test_write WHERE wr_uid >10;

SELECT dbms_xdb.gethttpport() FROM dual;

