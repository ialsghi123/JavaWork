package com.lec.sts13_jdbc.board.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.lec.sts13_jdbc.board.C;

public class BWriteDAO {
	JdbcTemplate template;

	public BWriteDAO() {

		this.template = C.template;

	}
	
	//전체 SELECT
	
	public List<BWriteDTO> select() {
		
		//간단하진다!
		return template.query(C.SQL_WRITE_SELECT,
				new BeanPropertyRowMapper<BWriteDTO>(BWriteDTO.class));
	}
	
	public int insert(final BWriteDTO dto) {
		
		/*
		 * 
		 //1.update() + preparedStatementSetter()
		return
		template.update(C.SQL_WRITE_INSERT, new PreparedStatementSetter() {
					
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, dto.getSubject());
				ps.setString(2, dto.getContent());
				ps.setString(3, dto.getName());
				
			}
		});
		 */
		
		//2.update() + PreparedStatementCreator()
		return
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				PreparedStatement ps = con.prepareStatement(C.SQL_WRITE_INSERT);
				ps.setString(1, dto.getSubject());
				ps.setString(2, dto.getContent());
				ps.setString(3, dto.getName());
				
				return ps;
				
				
			}
		});
	}
	
//	public BWriteDTO[] readByUid(int uid) {
//		
//		return template.query(C.SQL_WRITE_INC_VIEWCNT,
//				new BeanPropertyRowMapper.(BWriteDTO)BWriteDTO.class);
//	}
//	
	
	
}





























