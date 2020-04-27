-- DB03
-- p25~p27 12개 SELECT 쿼리

SELECT * FROM T_STUDENT;

--1
SELECT name FROM T_STUDENT WHERE HEIGHT>=180;

--2
SELECT name,WEIGHT eight FROM T_STUDENT WHERE WEIGHT >=60 AND WEIGHT <=80;

--3
SELECT name FROM T_STUDENT WHERE DEPTNO1 IN(101,201);

--4
SELECT name FROM T_STUDENT WHERE name LIKE '%김%';

--5
SELECT name,grade,height FROM T_STUDENT WHERE grade=4 AND height>=170;

--6
SELECT name,height,grade,weight FROM T_STUDENT WHERE grade=1 OR WEIGHT>=80;

--7
SELECT name,grade,height,weight FROM T_STUDENT WHERE grade=2 AND height>180 AND weight>70;

--8
SELECT name,grade,height,weight FROM T_STUDENT WHERE grade=2 AND (height>180 OR weight>70);

--9
SELECT ename,hiredate FROM T_EMP WHERE HIREDATE BETWEEN '1990-01-01' AND '1991-12-31';

--10
SELECT name,birthday,height,weight FROM T_STUDENT WHERE grade=1
ORDER BY BIRTHDAY;

--11
SELECT name 이름,height 키 
FROM T_STUDENT WHERE grade=1
ORDER BY name;

--12
SELECT name,birthday FROM T_EMP2 WHERE BIRTHDAY BETWEEN '1980-01-01' AND '1989-12-31';


