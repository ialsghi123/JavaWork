SELECT * FROM T_PROFESSOR;


--null값 과의 연산 결과는 null이다!
SELECT name,pay,bonus,pay+BONUS 
FROM T_PROFESSOR;

--그룹함수에서는 동작,null은 연산에서 제외되어 동작.
SELECT sum(pay),sum(bonus) FROM T_PROFESSOR;

--nvl() 함수 (null value 함수)
SELECT name,pay,bonus,
 		pay+BONUS 총지급액,
 		pay+nvl(bonus,0) 총지급액
FROM T_PROFESSOR;

--#4201

SELECT name,pay,nvl(bonus,0) BONUS,pay*12+nvl(bonus,0) 연봉
FROM T_PROFESSOR 
WHERE DEPTNO=101;

--#4202

SELECT name,pay,nvl2(bonus,BONUS,0) BONUS,
				nvl2(bonus,pay*12+bonus,pay*12) 연봉
FROM T_PROFESSOR 
WHERE DEPTNO=101;