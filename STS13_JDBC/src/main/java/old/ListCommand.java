package old;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		WriteDAO dao = new WriteDAO(); //DAO 객체 생성
		WriteDTO [] arr = null;
		
		try {
			//트랜잭션 수행
			arr = dao.select();
			
			//"list" 란 name으로 request에 arr값 전달
			// 즉 request 에 담아서 컨트롤러에 전달되는 셈.
			request.setAttribute("list", arr);
			
			
		} catch(SQLException e) {
			//만약 CP 사용한다면
			//NamingException도 처리 해야 함.
			e.printStackTrace();
			
		}
		
		
		
		
	}

}
