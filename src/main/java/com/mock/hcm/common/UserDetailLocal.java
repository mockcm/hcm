package com.mock.hcm.common;

import com.mock.base.util.VOUtil;
import com.mock.hcm.dao.UserDAO;
import com.mock.hcm.domain.User;
import com.mock.simplemvc.ioc.base.BeanContainerManager;

public class UserDetailLocal {
	
	//注意，一定要使用ThreadLocalWarpper.warpprer方式生成对应的ThreadLocal对象
	private static final ThreadLocal<UserDetail>  userDetailLocal =  new ThreadLocal<UserDetail>();
		
	public static boolean buildUserDetail(Integer userId) {
		
		if (userDetailLocal.get() != null) return true;
		
		//获取用户对象
		UserDAO userDAO = BeanContainerManager.getBean(UserDAO.class);
		User user = userDAO.findUserById(userId);
		if (null == user) return false;
		
		UserDetail userDetail = VOUtil.toVO(user, UserDetail.class);
		if (null == userDetail) return false;
		userDetailLocal.set(userDetail);
		return true;
	}
	
	public static UserDetail getUserDetail() {
		return userDetailLocal.get();
	}
	
	public static void setUserDetail(UserDetail userDetail) {
		userDetailLocal.set(userDetail);
	}

	public static ThreadLocal<UserDetail> getUserdetaillocal() {
		return userDetailLocal;
	}
}
