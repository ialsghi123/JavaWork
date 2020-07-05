package com.lec.sts19_rest.board.beans;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface IAjaxDAO {

	public List<BWriteDTO> selectFromRow(
			@Param("from") int from,
			@Param("pageRows") int pageRows);
	public int countAll();
	public BWriteDTO selectByUid(int uid);
	public int incViewCnt(int uid);
	public int insert(String subject, String content, String name);
	public int update(
			@Param("uid") int uid,
			@Param("subject") String subject,
			@Param("content") String content);
	public int deleteByUid(int [] uids);
	
}
