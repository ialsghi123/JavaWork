package com.lec.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.S;

public class PracticeDAO {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public PracticeDAO() {
		
		try {
			Class.forName(S.DRIVER);
			conn=DriverManager.getConnection(S.URL, S.USERID, S.USERPW);
			System.out.println("PracticeDAO 생성,데이터 베이스 연결!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // 생성자
	
	public void close() throws SQLException {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	} // end close()
	
	public int insert(PracticeDTO dto) throws SQLException {
		String subject = dto.getSubject();
		String content = dto.getContent();
		String name = dto.getName();
		
		int cnt = this.insert(subject, content, name);
		return cnt;
	}

	private int insert(String subject, String content, String name) throws SQLException {
		int cnt=0;
		
		try {
			pstmt = conn.prepareStatement(S.SQL_PRACTICE_INSERT);
			pstmt.setString(1, subject);
			pstmt.setString(2, content);
			pstmt.setString(3, name);
			
			cnt=pstmt.executeUpdate();
		} finally {
			close();
		}
		
		return cnt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
