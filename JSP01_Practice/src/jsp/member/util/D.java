package jsp.member.util;

public class D {
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String USERID = "scott9302";
	public static final String USERPW = "tiger9302";
	
	public static final String SQL_MEMBER_INSERT = "INSERT INTO jsp_member VALUES" +
			"(?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
	
	
}
