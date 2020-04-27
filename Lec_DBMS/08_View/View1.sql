CREATE OR REPLACE VIEW v_prof
AS
SELECT profno,name,email,hpage
FROM T_PROFESSOR;

SELECT * FROM v_prof;

SELECT tname FROM tab; --VIEW 확인 가능

--view 생성시 별도의 컬럼이름을 지정해줄 수 있다
CREATE OR REPLACE VIEW v_prof(pfno,nm,em,hp)
AS
SELECT profno,name,email,hpage
FROM T_PROFESSOR;


--#8102

SELECT *FROM T_PROFESSOR;
SELECT *FROM T_DEPARTMENT ;


CREATE OR REPLACE VIEW v_prof_dept("교수번호","교수명","소속학과명")
AS
SELECT p.PROFNO ,p.name,d.DNAME 
FROM T_PROFESSOR p,T_DEPARTMENT d
WHERE p.DEPTNO =d.DEPTNO;

SELECT max(height) "최대키"
FROM T_STUDENT
GROUP BY DEPTNO1;

SELECT d.DNAME "학과명", height "최대키"
FROM T_STUDENT s,T_DEPARTMENT d
WHERE (SELECT max(height) "최대키"
FROM T_STUDENT
GROUP BY DEPTNO1);--

