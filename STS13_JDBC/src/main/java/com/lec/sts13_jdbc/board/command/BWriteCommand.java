package com.lec.sts13_jdbc.board.command;

import java.util.Map;

import org.springframework.ui.Model;

import com.lec.sts13_jdbc.board.beans.BWriteDAO;
import com.lec.sts13_jdbc.board.beans.BWriteDTO;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		//Model 안에 있는 값(attribute) 꺼내기
		Map<String,Object> map = model.asMap();
		BWriteDTO dto = (BWriteDTO)map.get("dto");
		BWriteDAO dao = new BWriteDAO();
		int result = dao.insert(dto);
		model.addAttribute("result",result);
	}

}
