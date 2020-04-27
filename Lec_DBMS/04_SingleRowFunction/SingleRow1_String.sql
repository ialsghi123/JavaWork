--INITCAP () 함수

--#4101

SELECT INITCAP('pretty girl') 
FROM dual;

--#4102

SELECT id,INITCAP(ID) ID
FROM T_STUDENT
WHERE DEPTNO1 =201;

--LOWER(),UPPER()
--#4103

SELECT name,id,UPPER(id) 대문자,LOWER(id) 소문자
FROM T_STUDENT 
WHERE DEPTNO1 =201;

--LENGTH / LENGTHB
--#4104

SELECT name,id,LENGTH (ID) 글자수
FROM T_STUDENT 
WHERE LENGTH(ID) >=9; --단일행 함수는 WHERE 조건절에서 사용 가능!

--#4105

SELECT name 이름,LENGTH(name) 길이,LENGTHB(NAME) 바이트 
FROM T_STUDENT 
WHERE DEPTNO1 =201;

--CONCAT() 함수
--#4106

SELECT CONCAT(name,POSITION) 교수님명단
FROM T_PROFESSOR 
WHERE DEPTNO =101;

--SUBSTR() 함수

SELECT SUBSTR('ABCDE',2,3) -- 'BCD' 문자열 인덱스 1부터 시작!
FROM dual;

SELECT SUBSTR('ABCDE',20,3) --null(에러 아님)
FROM dual;

SELECT SUBSTR(('ABCDE',-2,3)
FROM dual;

SELECT * FROM T_STUDENT;

--#4107
SELECT name,substr(JUMIN,1,6) 생년월일
FROM T_STUDENT 
WHERE DEPTNO1=101;

--#4108
SELECT NAME,SUBSTR(JUMIN,1,6) 생년월일 
FROM T_STUDENT 
WHERE SUBSTR(jumin,3,2)='08'; 



--#4109

SELECT name,JUMIN
FROM T_STUDENT 
WHERE SUBSTR(JUMIN,7,1) ='2' AND grade=4;

--INSTR() 함수

SELECT INSTR('A*B*C*','*',1,1) FROM dual; --2
SELECT INSTR('A*B*C*','*',1,2) FROM dual; --4
SELECT INSTR('A*B*C*','*',3,2) FROM dual; --6
SELECT INSTR('A*B*C*','*',-4,1) FROM dual; --2 음수인덱스의 경우 검색도 음의 방향으로 진행
SELECT INSTR('A*B*C*','*',-4,2) FROM dual; --0 없으면 0리턴
SELECT INSTR('A*B*C*','*',-2,2) FROM dual; --2

--#4110

SELECT name,tel,INSTR(TEL,')',1,1) 위치
FROM T_STUDENT WHERE DEPTNO1 =101;
 

--#4111

SELECT name,tel,SUBSTR(TEL,1,INSTR(tel,')')-1 ) 지역번호
FROM T_STUDENT WHERE DEPTNO1=101;

--LTRIM(),RTRIM(),TRIM()
SELECT 
	LTRIM('슈퍼슈퍼슈가맨','슈퍼')LTRIM,
	LTRIM('슈퍼슈퍼슈가맨','슈')LTRIM,
	LTRIM('   슈퍼슈가맨',' ')LTRIM,
	LTRIM('   슈퍼슈가맨')LTRIM, --디폴트로 '공백'제거
	RTRIM('우측 공백 제거   ') RTRIM,
	TRIM('      슈퍼맨      ') TRIM, --좌우 공백 제거
	LTRIM('*******10000','*') 
FROM dual;

--#4116

SELECT LTRIM(dname,'영')LTRIM 
FROM T_DEPT2;

--#4117

SELECT RTRIM(dname,'부')RTRIM 
FROM T_DEPT2;

--REPLACE 함수

SELECT REPLACE('슈퍼맨 슈퍼걸','슈퍼','파워')
FROM dual;

SELECT REPLACE ('아버지가 방에 들어간다',' ','')
FROM dual; 

--#4118


SELECT NAME,REPLACE(name,SUBSTR(name,1,1),'#') 학생 
FROM T_STUDENT
WHERE DEPTNO1 = 102;

--#4119

SELECT name,REPLACE(name,substr(name,2,1),'#') 학생
FROM T_STUDENT 
WHERE DEPTNO1 =101;

--#4120

SELECT name,JUMIN,REPLACE(JUMIN,SUBSTR(jumin,7,7),'*******') 주민 
FROM T_STUDENT 
WHERE DEPTNO1=101;

--#4121

SELECT name,TEL,REPLACE (tel,substr(TEL ,INSTR(tel,')')+1,3),'###') 전화번호 
FROM T_STUDENT 
WHERE DEPTNO1=102;











