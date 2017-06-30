package com.mock.hcm.config;

import javax.sql.DataSource;

import com.mock.hcm.controller.UserController;
import com.mock.hcm.handler.post.LogPostRequestHandler;
import com.mock.hcm.handler.prev.LogPrevRequestHandler;
import com.mock.hcm.handler.prev.ParamValidatePrevRequestHandler;
import com.mock.simplemvc.annotation.Config;
import com.mock.simplemvc.dao.DbConfig;
import com.mock.simplemvc.dao.base.DbManager;
import com.mock.simplemvc.http.core.ConfigAdapter;
import com.mock.simplemvc.http.core.PostRequestHandlerChain;
import com.mock.simplemvc.http.core.PrevRequestHandlerChain;
import com.mock.simplemvc.http.core.Router;

@Config
public class HcmConfig extends ConfigAdapter {

	@Override
	public void afterServerStart() {
		// TODO Auto-generated method stub
		super.afterServerStart();
	}

	@Override
	public DataSource dataSourceConfig() {
		// TODO Auto-generated method stub
		return super.dataSourceConfig();
	}

	@Override
	public void afterBeanContainerInited() {
		// TODO Auto-generated method stub
		super.afterBeanContainerInited();
		
		//初始化数据库
		DbManager.init(DbConfig.build());
	}

	@Override
	public void addPrevHandler() {
		PrevRequestHandlerChain chain = new PrevRequestHandlerChain();
		chain.add(new LogPrevRequestHandler());
		chain.add(new ParamValidatePrevRequestHandler());
	}

	@Override
	public void addPostHandler() {
		PostRequestHandlerChain chain = new PostRequestHandlerChain();
		chain.add(new LogPostRequestHandler());
	}

	@Override
	public void routerConfig(Router router) {
		router.add("/user", UserController.class);
	}
}
