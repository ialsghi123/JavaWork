--산술연산자

SELECT  ename,sal,sal*1.1 --급여 10%인상분
FROM T_EMP;

SELECT ENAME,SAL,COMM,sal+COMM ---NULL 값과의 산술연산은 무조건 NULL!
FROM T_EMP;

--WHERE 조건절

SELECT * FROM T_EMP WHERE job='SALESMAN';
SELECT * FROM T_EMP WHERE job='SALESman'; --문자열은 대소문자구분!

--직원 테이블(t_emp) 에서 10번 부서(deptno)에 근무하는 직원의 
--이름(ename)과 급여(sal)와 부서번호(deptno) 출력

SELECT ename,sal,deptno
FROM T_EMP 
WHERE deptno=10;

SELECT ename,sal
FROM T_EMP
WHERE sal>2000;

SELECT ENAME ,EMPNO ,SAL 

FROM T_EMP
WHERE ename='SCOTT';

--연습

SELECT * FROM T_STUDENT;

SELECT  name,grade FROM T_STUDENT WHERE GRADE =2 OR grade=3;

SELECT  name,grade FROM T_STUDENT WHERE grade IN(2,3);

SELECT  name,grade FROM T_STUDENT WHERE grade >1 AND grade <4;

SELECT  name,grade FROM T_STUDENT WHERE grade NOT in(1,4);

SELECT  name,grade FROM T_STUDENT WHERE grade BETWEEN 2 AND 3;

SELECT  name,pay,POSITION FROM T_PROFESSOR WHERE pay >300 AND POSITION ='정교수';

SELECT *FROM T_PROFESSOR;

SELECT name,POSITION FROM T_PROFESSOR WHERE BONUS IS NULL;


--LIKE

SELECT NAME 
FROM T_PROFESSOR WHERE name LIKE '김%';

SELECT ename FROM T_EMP WHERE ENAME LIKE '%NE%';

SELECT ename FROM T_EMP WHERE ENAME LIKE '_A%' -- _는 무조건 그 자리에 하나는 와야함 %는 그 이후나 전에는 뭐가 와도 상관없음

---------------------------------------------
--ORDER BY
--내림차순 출력

SELECT ename FROM T_EMP WHERE ename LIKE '%L%'
ORDER BY ename DESC --디센딩오더 내림차순


SELECT ename,job,sal FROM T_EMP 
ORDER BY job DESC,SAL;

SELECT name,grade,height FROM T_STUDENT 
ORDER BY height DESC,grade;




