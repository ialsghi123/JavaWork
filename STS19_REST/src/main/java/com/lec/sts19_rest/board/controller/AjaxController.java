package com.lec.sts19_rest.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lec.sts19_rest.board.beans.AjaxWriteList;
import com.lec.sts19_rest.board.beans.BWriteDTO;
import com.lec.sts19_restajaxcommand.DeleteCommand;
import com.lec.sts19_restajaxcommand.ListCommand;
import com.lec.sts19_restajaxcommand.UpdateCommand;
import com.lec.sts19_restajaxcommand.ViewCommand;
import com.lec.sts19_restajaxcommand.WriteCommand;


@RestController
@RequestMapping("/board/*.ajax")
public class AjaxController {
	public AjaxWriteList buildList(HttpServletRequest request) {
		
		List<BWriteDTO> list = (List<BWriteDTO>)request.getAttribute("list");
		
		AjaxWriteList result = new AjaxWriteList();
		result.setStatus((String)request.getAttribute("status"));
		result.setMessage((String)request.getAttribute("message"));
		
		if(list != null) {
			result.setCount(list.size());
			result.setList(list);
		}
		
		try {
			result.setPage((Integer)request.getAttribute("page"));
			result.setTotalPage((Integer)request.getAttribute("totalPage"));
			result.setWritePages((Integer)request.getAttribute("writePages"));
			result.setPageRows((Integer)request.getAttribute("pageRows"));
			result.setTotalCnt((Integer)request.getAttribute("totalCnt"));
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	@RequestMapping("/board/list.ajax")
	public AjaxWriteList list(HttpServletRequest request, HttpServletResponse response) {
		new ListCommand().execute(request, response);
		return buildList(request);
	}
	
	@RequestMapping("/board/view.ajax")
	public AjaxWriteList view(HttpServletRequest request, HttpServletResponse response) {
		new ViewCommand().execute(request, response);
		return buildList(request);
	}
	
	@RequestMapping(value="/board/writeOk.ajax", method=RequestMethod.POST)
	public AjaxWriteList writeOk(HttpServletRequest request, HttpServletResponse response) {
		new WriteCommand().execute(request, response);
		return buildList(request);
	}
	
	@RequestMapping(value="/board/updateOk.ajax",  method=RequestMethod.POST)
	public AjaxWriteList updateOk(HttpServletRequest request, HttpServletResponse response) {
		new UpdateCommand().execute(request, response);
		return buildList(request);
	}
	
	@RequestMapping(value="/board/deleteOk.ajax",  method=RequestMethod.POST)
	public AjaxWriteList deleteOk(HttpServletRequest request, HttpServletResponse response) {
		new DeleteCommand().execute(request, response);
		return buildList(request);
	}
	
	
	
	

	
	
}
