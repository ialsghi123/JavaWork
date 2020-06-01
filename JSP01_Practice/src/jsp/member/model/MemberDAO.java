package jsp.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jsp.member.util.D;

import java.sql.Date;
import java.sql.DriverManager;




/**
 * JSP_MEMBER 테이블과 연관된 DAO로
 * 회원 데이터를 처리하는 클래스이다.
 * <br><br>
 * Data Access Object - 테이블 당 한개의 DAO를 작성한다.
 */
public class MemberDAO {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null; 
	/**
	 * String -> java.sql.Date로 변경하는 메서드
	 * <pre>
	 * 문자열로된 생년월일을 Date로 변경하기 위해 필요하다.
	 * java.util.Date클래스로는 오라클의 Date형식과 연동할 수 없다.
	 * Oracle의 date형식과 연동되는 java의 Date는 java.sql.Date 클래스이다. </pre>
	 * @param member 회원정보를 담고있는 TO
	 * @return java.sql.Date
	 */
	
	public MemberDAO() {
		try {
			Class.forName(D.DRIVER);
			conn = DriverManager.getConnection(D.URL, D.USERID, D.USERPW);
			System.out.println("WriteDAO 생성, 데이터 베이스 연결!");
		} catch(Exception e) {
			e.printStackTrace();
			// throw e;
		}	
	}
	
	public void close() throws SQLException {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}
	
	public Date stringToDate(MemberBean member)
	{
		String year = member.getBirthyy();
		String month = member.getBirthmm();
		String day = member.getBirthdd();
		
		Date birthday  = null;
		
		if(year != null && month != null && day != null)
			birthday = Date.valueOf(year+"-"+month+"-"+day);
		
		return birthday;
		
	} // end stringToDate()
	
	


	/**
	 * 회원정보를 JSP_MEMBER 테이블에 저장하는 메서드
	 * @param member 가입할 회원정보를 담고있는 TO
	 * @throws SQLException
	 * @throws ClassNotFoundException 
	 */
	public void insertMember(String id,String password,String name,String gender,
			String birthyy,String birthmm,String birthdd,String mail1,
			String mail2,String phone,String address) throws SQLException {
		
		int cnt=0;
		
		try {
			// 커넥션을 가져온다.
		
			
			// 자동 커밋을 false로 한다.
			conn.setAutoCommit(false);
			
			// 쿼리 생성한다.
			// 가입일의 경우 자동으로 세팅되게 하기 위해 sysdate를 사용

			/* 
			 * StringBuffer에 담긴 값을 얻으려면 toString()메서드를
			 * 이용해야 한다.
			 */
			pstmt = conn.prepareStatement(D.SQL_MEMBER_INSERT);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, gender);
			pstmt.setDate(5, stringToDate(member));
			pstmt.setString(6, member.getMail1()+"@"+member.getMail2());
			pstmt.setString(7, member.getPhone());
			pstmt.setString(8, member.getAddress());
			
			// 쿼리 실행
			cnt = pstmt.executeUpdate();
			// 완료시 커밋
			conn.commit(); 
			
		} catch (SQLException e) {
			// 오류시 롤백
			conn.rollback(); 
			throw e;
		} finally {
			close();
		}
	} // end insertMember()

	
} //end MemberDAO

