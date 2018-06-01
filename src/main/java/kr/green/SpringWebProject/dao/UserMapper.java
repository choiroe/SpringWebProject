package kr.green.SpringWebProject.dao;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	public String getPw(@Param("id") String id);
}
