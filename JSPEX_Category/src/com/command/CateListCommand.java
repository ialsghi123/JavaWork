package com.command;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lec.beans.AjaxCategoryList;
import com.lec.beans.CategoryDAO;
import com.lec.beans.CategoryDTO;


public class CateListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		CategoryDAO dao = new CategoryDAO();
		CategoryDTO [] arr = null;
		
		StringBuffer message =new StringBuffer();
		String status = "FAIL";
		
		
	}

}
