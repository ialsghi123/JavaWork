package common;

public class S {
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String USERID = "scott0316";
	public static final String USERPW = "tiger0316";

	public static final String SQL_PRACTICE_SELECT =
			"SELECT * FROM test_practice ORDER BY pr_uid DESC";
	
	public static final String SQL_PRACTICE_INSERT = "INSERT INTO test_practice"+
			"pr_uid,pr_subject,pr_content,pr_name" +
			"VALUES(test_practice_seq.nextval,?, ?, ?)";
			
	public static final String SQL_PRACTICE_VIEWCNT =
			"UPDATE test_practice SET pr_viewCnt = wr_viewCnt + 1 WHERE wr_uid =?";
	
	public static final String SQL_PRACTICE_BY_UID =
			"SELECT * FROM test_practice WHERE pr_uid =?";
	
	public static final String SQL_PRACTICE_UPDATE =
			"UPDATE test_practice SET pr_subject=?, pr_content=? WHERE pr_uid=?";
	public static final String SQL_PRACTICE_DELETE_BY_UID =
			"DELETE FROM test_practice WHERE pr_uid = ?";

			
			
}
