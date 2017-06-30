package com.mock.hcm.handler.prev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mock.simplemvc.http.base.HttpParameter;
import com.mock.simplemvc.http.core.PrevRequestHandler;
import com.mock.simplemvc.http.core.ResponceWriter;

public class LogPrevRequestHandler extends PrevRequestHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(LogPrevRequestHandler.class);
	
	@Override
	public PrevRequestHandler prevHandle(HttpParameter httpParameter, ResponceWriter responceWriter) {
		logger.info("入参：" + httpParameter.getParametersMap());
		return next();
	}
}
