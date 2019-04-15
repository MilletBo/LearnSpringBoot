package com.millet.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.millet.model.UserDoMain;

@Mapper
public interface UserDao {

	int insert(UserDoMain record);

    List<UserDoMain> selectUsers();
}
