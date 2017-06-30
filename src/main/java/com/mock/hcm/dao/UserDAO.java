package com.mock.hcm.dao;

import com.mock.hcm.domain.User;
import com.mock.simplemvc.annotation.Instance;
import com.mock.simplemvc.dao.base.BaseDAO;

@Instance
public class UserDAO extends BaseDAO {
	
	public User findUserById(Integer id) {
		return queryById(id, "user", User.class);
	}
}
