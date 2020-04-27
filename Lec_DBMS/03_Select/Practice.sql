SELECT * FROM T_EMP;

SELECT empno "사원번호", ename "사원명" , JOB "직업"
FROM T_EMP;

SELECT DEPTNO "부서#", DNAME "부서명",LOC "위치"
FROM T_DEPT;

SELECT DEPTNO 
FROM T_EMP ;

SELECT DISTINCT DEPTNO 
FROM T_EMP;

SELECT DISTINCT DEPTNO1 
FROM T_STUDENT;

SELECT DISTINCT JOB 
FROM t_emp;

SELECT name || '-' || POSITION "교수님 명단"
FROM T_PROFESSOR 

SELECT name || '의 키는 ' ||HEIGHT|| 'cm, 몸무게는 ' || WEIGHT ||'kg 입니다'
FROM T_STUDENT 

SELECT *
FROM T_EMP 
WHERE job='SALESMAN';

SELECT ENAME ,SAL ,DEPTNO 
FROM T_EMP 
WHERE DEPTNO =10;

SELECT ENAME ,SAL 
FROM T_EMP 
WHERE sal>2000;

SELECT ENAME ,empno,SAL 
FROM T_EMP 
WHERE ename='SCOTT';

SELECT ename, job 
FROM t_emp 
WHERE job IN ('CLERK', 'ANALYST');

SELECT ename 
FROM t_emp 
WHERE ename LIKE 'A%';

SELECT name,GRADE 
FROM T_STUDENT 
WHERE grade IN (2,3)

SELECT NAME ,PAY ,POSITION
FROM T_PROFESSOR 
WHERE pay>300 AND POSITION LIKE '%정교수%';

SELECT name,POSITION
FROM T_PROFESSOR 
WHERE bonus IS NULL ;

SELECT NAME 
FROM T_PROFESSOR 
WHERE name LIKE '김%';

SELECT ENAME 
FROM T_EMP 
WHERE ENAME LIKE '%NE%';

SELECT ENAME 
FROM T_EMP 
WHERE ENAME LIKE '_A%';

SELECT ENAME 
FROM T_EMP 
WHERE ename LIKE '%L%'
ORDER BY ENAME DESC ;

--직원의 이름,직책, 급여를 출력하되 우선은 직책(job) 사전 내림차순으로, 그리고 급여(sal) 오름차순으로 출력

SELECT ENAME,JOB ,SAL 
FROM T_EMP 
ORDER BY JOB DESC,sal ASC;

SELECT name,GRADE,HEIGHT 
FROM T_STUDENT 
ORDER BY grade,height DESC;

SELECT INITCAP(id) 
FROM T_STUDENT 
WHERE DEPTNO1 = '201';

SELECT name,id,LENGTH (id)
FROM T_STUDENT 
WHERE LENGTH (id)>=9;

SELECT concat(name,POSITION )
FROM T_PROFESSOR 
WHERE DEPTNO ='101';

SELECT name,substr(JUMIN,1,6) "생년월일" 
FROM T_STUDENT 
WHERE DEPTNO1='101';

SELECT name,substr(jumin,1,6) "생년월일" 
FROM T_STUDENT 
WHERE jumin LIKE '%08%';

SELECT name,jumin
FROM T_STUDENT 
WHERE grade='4' AND substr(jumin,7,1)='2';

SELECT name,TEL,instr(tel,')',1,1) 위치
FROM T_STUDENT 
WHERE DEPTNO1 =101;

SELECT name,TEL,substr(tel,1,instr(tel,')')-1) 지역번호
FROM T_STUDENT 
WHERE DEPTNO1 =101;

SELECT * FROM T_DEPT2 ;

SELECT RTRIM(DNAME,'부') 
FROM T_DEPT2 

SELECT REPLACE(name,substr(name,'1','1'),'#')
FROM T_STUDENT 
WHERE DEPTNO1 ='102';

SELECT * FROM T_STUDENT;
SELECT * FROM T_DEPARTMENT;

SELECT s.NAME,s.DEPTNO1,d.DNAME 
FROM T_STUDENT s,T_DEPARTMENT d
WHERE s.DEPTNO1=d.DEPTNO;

SELECT REPLACE(name,substr(name,'2','1'),'#')
FROM T_STUDENT 
WHERE DEPTNO1 ='101';

SELECT name "이름",REPLACE(jumin,substr(JUMIN,7,13),'*******') "주민번호"
FROM T_STUDENT 
WHERE DEPTNO1 ='101';

SELECT name,tel,REPLACE(tel,substr(tel,instr(tel,')')+1,3),'###') "전화번호"
FROM T_STUDENT 
WHERE DEPTNO1 ='102';

SELECT * FROM T_PROFESSOR;

SELECT name,pay,nvl(BONUS,'0'),pay*12+nvl(bonus,'0')
FROM T_PROFESSOR 
WHERE DEPTNO='101'; 

SELECT name,pay,nvl2(bonus,bonus,'0'),nvl2(bonus,pay*12+bonus,pay*12)
FROM T_PROFESSOR 
WHERE DEPTNO='101'; 


SELECT to_char(sysdate,'YYYY/MM/DD') "sysdate",to_char(sysdate,'YYYY-MM-DD HH24:MI:SS') "날짜"
FROM dual;

SELECT *FROM T_STUDENT;

SELECT name,TO_CHAR(BIRTHDAY,'YYYY-MM-DD') "생일"
FROM T_STUDENT 
WHERE to_char(BIRTHDAY,'MM')='03';

SELECT to_char(123456789,'999,999,999')
FROM dual;

SELECT name,to_char(pay*12+nvl(bonus,0),'9,999') "연봉"
FROM T_PROFESSOR 
WHERE DEPTNO ='101';

SELECT * FROM T_PROFESSOR 

SELECT name,to_char(HIREDATE,'YYYY-MM-DD') "입사일" ,
			to_char(pay*12,'99,999') "연봉",
			TO_CHAR( (pay*12)*1.1,'99,999') "인상후"
FROM T_PROFESSOR
WHERE to_char(HIREDATE,'YYYY')<2000;

SELECT round(345.663,2),MOD(23,5),power(5,3),sysdate-to_date('2020-01-01')
FROM dual;

SELECT * FROM T_PROFESSOR;

SELECT name,
	TO_CHAR(SYSDATE,'YYYY-MM-DD') "오늘",  
	TO_CHAR(HIREDATE,'YYYY-MM-DD') "입사일",
	TO_CHAR(SYSDATE,'YYYY')-TO_CHAR(HIREDATE,'YYYY')"근속연수",
	ROUND(MONTHS_BETWEEN(SYSDATE,HIREDATE),1) "근속개월",
	round((SYSDATE-HIREDATE),1) "근속일수"
FROM T_PROFESSOR 



SELECT DEPTNO,round(avg(nvl(pay,0)),1)
FROM T_PROFESSOR
GROUP BY DEPTNO
HAVING round(avg(nvl(pay,0)),1)>450;

SELECT * FROM T_EMP;

SELECT mgr,count(job),sum(sal),round(avg(sal),1),nvl(avg(comm),0)
FROM T_EMP 
WHERE job!='PRESIDENT'
GROUP BY mgr;

SELECT * FROM T_PROFESSOR;

SELECT DEPTNO,count(*),avg(SYSDATE-HIREDATE),avg(PAY),avg(bonus)
FROM T_PROFESSOR 
WHERE POSITION in('정교수','조교수')
GROUP BY deptno;


SELECT DEPTNO1,max(WEIGHT)-min(WEIGHT) "최대최소 몸무게 차이"
FROM T_STUDENT 
GROUP BY DEPTNO1
HAVING max(WEIGHT)-min(WEIGHT)>=30;

SELECT s.NAME,s.DEPTNO1,d.DNAME
FROM T_STUDENT s,T_DEPARTMENT d
WHERE s.DEPTNO1 =d.DEPTNO;

SELECT s.NAME,s.DEPTNO1,d.DNAME
FROM T_STUDENT s JOIN T_DEPARTMENT d
on s.DEPTNO1 =d.DEPTNO;

SELECT * FROM T_STUDENT ;
SELECT * FROM T_PROFESSOR;
SELECT * FROM T_DEPARTMENT ;


SELECT s.NAME,p.PROFNO,p.NAME
FROM T_STUDENT s,T_PROFESSOR p
WHERE s.PROFNO=p.PROFNO


SELECT s.NAME ,d.DNAME,p.NAME 
FROM T_STUDENT s,T_DEPARTMENT d,T_PROFESSOR p
WHERE s.DEPTNO1=d.DEPTNO AND s.PROFNO =p.PROFNO ;

SELECT * FROM t_emp2;
SELECT * FROM T_POST;

SELECT e.NAME,e.POST,e.PAY,p.S_PAY,p.E_PAY 
FROM t_emp2 e,T_POST p
WHERE e.POST = p.POST 

SELECT s.NAME,p.NAME 
FROM T_STUDENT s,T_PROFESSOR p
WHERE s.PROFNO=p.PROFNO AND s.DEPTNO1 ='101';


SELECT * FROM T_CUSTOMER;
SELECT * FROM T_GIFT;

SELECT c.C_NAME ,c.C_POINT,g.G_NAME 
FROM T_CUSTOMER c,T_GIFT g
WHERE c.C_POINT BETWEEN g.G_START AND g.G_END

SELECT g.G_NAME ,COUNT(*) 
FROM T_CUSTOMER c,T_GIFT g 
WHERE c.c_point BETWEEN g.g_start AND g.g_end
GROUP BY g_name;


SELECT * FROM v_prof;
DROP VIEW v_prof;

CREATE OR REPLACE VIEW v_prof
AS SELECT profno,name,email,hpage FROM T_PROFESSOR;

SELECT tname FROM tab;

SELECT *FROM T_PROFESSOR;

CREATE OR REPLACE VIEW v_prof_dept
AS
SELECT p.profno "교수번호", p.name "교수명", d.dname "소속학과명"
FROM t_professor p, t_department d
WHERE p.deptno = d.deptno;
-- 확인
SELECT * FROM v_prof_dept;


SELECT * FROM T_STUDENT;
SELECT * FROM T_EXAM01;
SELECT * FROM  T_CREDIT;

SELECT 
FROM T_STUDENT s,T_EXAM01 e,T_CREDIT c
WHERE s.STUDNO=e.STUDNO AND 


SELECT * FROM T_PROFESSOR 


SELECT name,pay
FROM T_PROFESSOR 
WHERE pay*12>5000;

SELECT * FROM T_PROFESSOR;
SELECT * FROM T_DEPARTMENT; 

SELECT p.NAME "교수님 이름",d.DNAME "소속 학과명" 
FROM T_PROFESSOR p,T_DEPARTMENT d
WHERE p.DEPTNO = d.DEPTNO;

SELECT *FROM T_STUDENT;
SELECT * FROM T_PROFESSOR;
SELECT * FROM T_DEPARTMENT; 


--7번
SELECT name
FROM T_STUDENT 
WHERE name='이윤나';


--8번
CREATE OR REPLACE VIEW v_stud_info("학생이름","학생학과명","담당교수님 이름")
AS
SELECT s.NAME,d.DNAME,p.NAME 
FROM T_STUDENT s,T_DEPARTMENT d,T_PROFESSOR p
WHERE s.DEPTNO1=d.DEPTNO AND d.DEPTNO=p.DEPTNO;

CREATE OR REPLACE VIEW v_stud_info("학생이름","학생학과명","담당교수님 이름")
AS
SELECT s.NAME,d.DNAME,p.NAME 
FROM T_STUDENT s,T_DEPARTMENT d,T_PROFESSOR p
WHERE s.DEPTNO1=d.DEPTNO AND d.DEPTNO=p.DEPTNO;

CREATE OR REPLACE VIEW v_stud_info("학생이름","학생학과명","담당교수님 이름")ASSELECT s.NAME,d.DNAME,p.NAME FROM T_STUDENT s,T_DEPARTMENT d,T_PROFESSOR pWHERE s.DEPTNO1=d.DEPTNO AND d.DEPTNO=p.DEPTNO;

CREATE OR REPLACE VIEW v_stud_info("학생이름","학생학과명","담당교수님 이름")
AS
SELECT s.NAME,d.DNAME,p.NAME FROM T_STUDENT s,T_DEPARTMENT d,T_PROFESSOR p
WHERE s.DEPTNO1=d.DEPTNO AND d.DEPTNO=p.DEPTNO;

--9번

ALTER TABLE phonebook

ADD (   

       email VARCHAR2(20),

       addr VARCHAR2(100),

       age NUMBER DEFAULT 21

);

ALTER TABLE T_STUDENT ADD(birthday date);

SELECT tname FROM tab;


CREATE USER scott IDENTIFIED BY tiger;
GRANT connect, resource, create view, create procedure TO scott;


CREATE TABLE T_MEMBER (
	mb_uid NUMBER PRIMARY KEY,
	mb_name VARCHAR2(20) NOT NULL,
	mb_jumin VARCHAR2(13) UNIQUE,
	mb_age NUMBER CHECK(age>0),
	mb_dept NUMBER REFERENCES T_DEPT(DCODE)
);

SELECT dbms_xdb.gethttpport() FROM dual;

exec dbms_xdb.sethttpport(9090);

SELECT deptno1 FROM t_student WHERE name = '이윤나';

SELECT s.name "학생이름", d.dname "학과명"
FROM t_student s, t_department d
WHERE s.deptno1 = d.deptno 
	AND s.deptno1 = (SELECT deptno1 FROM t_student WHERE name = '이윤나');


SELECT s.name "학생이름", d.dname "학과명"
FROM t_student s, t_department d
WHERE s.deptno1 = d.deptno 
	AND s.deptno1 = (SELECT deptno1 FROM t_student WHERE name = '이윤나');

DELETE FROM T_STUDENT WHERE grade='4';

SELECT name,pay
FROM T_PROFESSOR 
WHERE pay*12>'5000';

SELECT name,pay
FROM T_PROFESSOR 
WHERE pay*12>5000;

INSERT INTO T_STUDENT (학번,이름,아이디,학과번호,학년,담당교수) VALUES (9091,'김수진','sooplus',101,2,1004);

SELECT p.NAME "교수님 이름",d.DNAME "소속 학과명" 
FROM T_PROFESSOR p,T_DEPARTMENT d
WHERE p.DEPTNO = d.DEPTNO;

SELECT s.name "학생이름", d.dname "학과명"
FROM t_student s, t_department d
WHERE s.deptno1 = d.deptno 
AND s.deptno1 = (SELECT deptno1 FROM t_student WHERE name = '이윤나');

CREATE OR REPLACE VIEW v_stud_info("학생이름","학생학과명","담당교수님 이름")
AS
SELECT s.NAME,d.DNAME,p.NAME FROM T_STUDENT s,T_DEPARTMENT d,T_PROFESSOR p
WHERE s.DEPTNO1=d.DEPTNO AND d.DEPTNO=p.DEPTNO;

SELECT tname FROM tab;

SELECT tname FROM tab;

