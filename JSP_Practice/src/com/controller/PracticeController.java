package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.command.Practice.Command;
import com.command.write.ListCommand;
import com.command.write.WriteCommand;

@WebServlet("*.do")
public class PracticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public PracticeController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);

	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);

	}

	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo() 호출");

		request.setCharacterEncoding("UTF-8");
		
		String viewPage = null;
		Command command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		// 테스트 출력
		System.out.println("uri: " + uri);
		System.out.println("conPath: " + conPath);
		System.out.println("com: " + com);
		
		switch(com) {
		case "/list.do":
			command = new ListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
		case "/write.do":
			viewPage = "write.jsp";
			break;
			
		case "/writeOk.do":
			command = new WriteCommand();
			command.execute(request, response);
			viewPage = "writeOk.jsp";
			break;	
		
		
		}
		
		
		
		
		
		
		
		
	}//end actionDo
}
