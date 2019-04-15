package com.millet.service;

import com.github.pagehelper.PageInfo;
import com.millet.model.UserDoMain;

public interface UserService {

	int addUser(UserDoMain user);

    PageInfo<UserDoMain> findAllUser(int pageNum, int pageSize);
}
