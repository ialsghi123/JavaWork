-- dual 은 ROW 1개 짜리 dummy TABLE;
SELECT 'abcde' FROM dual;
SELECT '안녕하세요' FROM dual;
SELECT '100' FROM dual;
SELECT 100+10 FROM dual;


--*:'모든 컬럼'
SELECT * FROM t_emp;

--원하는 컬럼만 조회

SELECT EMPNO,ENAME
FROM t_emp;

--
SELECT * FROM T_PROFESSOR;
SELECT NAME FROM  T_PROFESSOR;
SELECT bonus FROM T_PROFESSOR;

SELECT '안녕하세요' FROM T_PROFESSOR;
SELECT name,'교수님 싸랑해요' FROM T_PROFESSOR;

--컬럼 별명(alias) 사용한 출력

SELECT STUDNO 학번,NAME 이름
FROM T_STUDENT;

SELECT studno "학번",name AS 이름
FROM T_STUDENT;

SELECT STUDNO "학생 학번",NAME 이름
FROM T_STUDENT;

SELECT * FROM T_EMP;

SELECT empno "사원 번호",ename 사원명,job 직업
FROM T_EMP;

SELECT deptno 부서#,dname 부서명,loc 위치
FROM T_DEPT;

--DISTINCT

SELECT * FROM T_EMP;
SELECT deptno FROM  T_EMP;
SELECT DISTINCT  deptno FROM T_EMP;

SELECT DISTINCT deptno1 FROM T_STUDENT;

SELECT DISTINCT job FROM T_EMP;

--||:필드,문자열 연결 연산

SELECT name,POSITION 
FROM T_PROFESSOR;

SELECT name || '-' || POSITION AS 교수님명단
FROM T_PROFESSOR;

SELECT * FROM T_STUDENT;

SELECT name ||'의 키는'||HEIGHT||'몸무게는'||WEIGHT||'입니다' AS "학생의 키와 몸무게"
FROM T_STUDENT;













