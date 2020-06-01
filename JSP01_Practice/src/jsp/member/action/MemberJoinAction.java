package jsp.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsp.member.model.MemberBean;
import jsp.member.model.MemberDAO;

/** 
 *  회원가입을 처리하는 Action 클래스<br>
 *  JoinForm.jsp에서 넘겨받은 정보를 이용하여
 *  회원가입을 처리한다.
 */
public class MemberJoinAction implements Action
{

	@Override
	public void execute(HttpServletRequest request,
			HttpServletResponse response) {
		
		
		int cnt = 0;
		
		MemberDAO dao = new MemberDAO();
		
		// 입력된 정보를 자바빈에 세팅한다
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String birthyy = request.getParameter("birthyy");
		String birthmm = request.getParameterValues("birthmm")[0];
		String birthdd = request.getParameter("birthdd");
		String mail1 = request.getParameter("mail1");
		String mail2 = request.getParameterValues("mail2")[0];
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		if(id!=null && password!=null &&
				id.trim().length() >0 && password.trim().length() >0) {
			
			try {
				cnt= dao.insertMember(id,password);
			}
		}
			
		
		// 회원가입 실행
		dao.insertMember(member);
		
		// 가입성공
		
		
   		// 가입성공 메시지를 세션에 담는다.
   		request.getSession().setAttribute("msg", "1");
   		
		
	}
}
