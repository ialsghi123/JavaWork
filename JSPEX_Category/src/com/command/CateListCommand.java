package com.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.beans.CategoryDAO;
import com.lec.beans.CategoryDTO;

public class CateListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CategoryDTO [] dtoArr = (CategoryDTO [])request.getAttribute("mycate");
		
		CategoryDAO result = new CategoryDAO();
		
		
		
		
	}

}
