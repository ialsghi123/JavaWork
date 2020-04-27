--계층형 쿼리 (Hierarchical Query)

SELECT * FROM T_DEPT2; --서로의 계층 관계 주목

SELECT LPAD(dname,10,'*') 부서명 FROM t_dept2;

--LEVEL 
SELECT dname,LEVEL
FROM T_DEPT2
CONNECT BY PRIOR dcode = pdept
START WITH dcode = 0001;

/* 해설
 * LEVEL 은 오라클에서 계속 사용할 수 있는 것으로
 * 해당 데이터가 몇번째 단계 이냐를 의미하는 것.
 * 
 * CONNECT BY PRIOR  :  각 row 들이 어떻게 연결되어야 하는지 조건 지정
 * PRIOR를 어느쪽에 주느냐가 중요!
 */

--PRIOR를 다른데 주면?
SELECT dname,LEVEL
FROM T_DEPT2
CONNECT BY dcode = PRIOR pdept
START WITH dcode = 0001;


SELECT dcode,dname,pdept,LEVEL
FROM T_DEPT2
CONNECT BY dcode = PRIOR pdept
--START WITH dcode = 1005; --s/w지원(1) -> 기술부(2) ->사장실(3)
START WITH dcode = 1011;    --영업 4팀 - 영업기획팀 - 영업부 - 사장실


SELECT lpad(dname,LEVEL*6,'*') 부서명 
FROM T_DEPT2 
CONNECT BY PRIOR dcode = PDEPT 
START WITH dcode=0001;


-------------
SELECT * FROM T_STUDENT ;
SELECT * FROM T_PROFESSOR;

SELECT LPAD(e.name || ' ' || d.dname || ' ' || nvl(e.post,'사원'),LEVEL*22,'-') "이름과 직급"
FROM T_EMP2 e,(SELECT dname,dcode,pdept FROM t_dept2) d
WHERE e.DEPTNO = d.dcode
CONNECT BY PRIOR e.empno=e.pempno
START WITH e.empno=20000101;



SELECT h.hr "HOUR",count(datetime) "COUNT"
FROM 
    (SELECT LEVEL -1 HR FROM dual CONNECT BY LEVEL <=24) h
    LEFT OUTER JOIN ANIMAL_OUTS a
    ON h.hr=to_number(to_char(a.datetime,'hh24'))
GROUP BY h.hr
ORDER BY 1
;

--개체 회원,게시물
--속성 회원-친구요청,게시물 열람,사진 동영상 업로드,그룹만들기 가입 / 게시물-공개 설정,댓글,좋아요
--관계 1:N










