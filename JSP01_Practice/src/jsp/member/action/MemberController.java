package jsp.member.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class MemberController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public MemberController() {
		super();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			doProcess(request,response);
	}  	
		
	/**
	 * POST 방식일 경우 doPost()
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			doProcess(request,response);
	}   	  	      	   
		
	/**
	 * 명령어에 따른 해당 Action을 지정해 준다.
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void doProcess(HttpServletRequest request, HttpServletResponse response) 
		 	throws ServletException, IOException {
		
		System.out.println("doProcess() 호출");
		
		String viewPage = null;
		Action action = null;
		
		// 넘어온 커맨드를 추출하는 과정
		String requestURI = request.getRequestURI();
		String conPath = request.getContextPath();
		String command = requestURI.substring(conPath.length());
		
		// URI, command 확인
		//System.out.println("requestURI : "+requestURI);
		//System.out.println("command : "+command);
		
		System.out.println("uri: " + requestURI);
		System.out.println("conPath: " + conPath);
		System.out.println("com: " + command);
		
		
		// 보여줄 화면 URL
		switch(command) {
		case "/MainForm.do":
			action = new MemberJoinAction();
			action.execute(request, response);
			viewPage = "MainForm.jsp";
			break;
			
		}
		
		if(viewPage != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
		
		// 커맨드에 해당하는 액션을 실행한다.
		
	} // end doProcess
}
