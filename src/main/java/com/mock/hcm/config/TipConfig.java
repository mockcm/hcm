package com.mock.hcm.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mock.base.constants.Constants;
import com.mock.base.util.CollectionUtil;
import com.mock.base.util.StringUtil;
import com.mock.hcm.common.UserDetailLocal;
import com.mock.hcm.dao.SystemTipDAO;
import com.mock.hcm.domain.SystemTip;
import com.mock.simplemvc.annotation.Init;
import com.mock.simplemvc.ioc.base.BeanContainerManager;

public class TipConfig {
	
	private static Map<String,String> tipMap = new HashMap<String,String> ();
	
	private static final Logger logger = LoggerFactory.getLogger(TipConfig.class);
	
	public static String showTip(String code,String ... defaultTip) {
		String lang = "001";
		if (null != UserDetailLocal.getUserDetail()) lang = UserDetailLocal.getUserDetail().getLang();
		code =  lang + ":" + code;
		String tip = tipMap.get(code);
		if (StringUtil.isNotEmpty(tip)) return tip;
		return (defaultTip != null && defaultTip.length > 0) ? defaultTip[0] : "抱歉,操作失败,请重试。";
	}
	
	public static String showTip(String code,String lang) {
		code =  lang + ":" + code;
		return tipMap.get(code);
	}
	
	public static void setTip(String code,String langCode,String tip) {
		String key = langCode + ":" + code;
		tipMap.put(key, tip);
	}
	
	@Init
	public static void init() {
		
		SystemTipDAO tipDAO = BeanContainerManager.getBean(SystemTipDAO.class);
		if (null == tipDAO) {
			throw new RuntimeException("server init error for tipDAO is null");
		}
		
		List<SystemTip> tipList = tipDAO.findSysetmTipListByLangCode(Constants.LANG_ZH);
		if (CollectionUtil.isEmpty(tipList)) {
			throw new RuntimeException("server init error for tipList is null");
		}
		
		for (SystemTip tip : tipList) {
			String key = tip.getLangCode() + ":" + tip.getCode();
			tipMap.put(key, tip.getTip());
		}
		
		logger.info("TipConfig初始化成功！");
	}
}
