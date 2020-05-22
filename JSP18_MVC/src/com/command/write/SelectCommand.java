package com.command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.beans.WriteDAO;

public class SelectCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int cnt = 0;

		WriteDAO dao = new WriteDAO();
		
		
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		

		
		request.setAttribute("result", cnt);


	}

}
