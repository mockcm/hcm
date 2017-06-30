package com.mock.hcm.handler.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mock.simplemvc.http.base.HttpParameter;
import com.mock.simplemvc.http.core.PostRequestHandler;

/**  
* @ClassName: LogPostRequestHandler  
* @Description: 日志后处理器，目前仅用于往文件中打印返回结果
* @author Mock(LCM)
*    
*/
public class LogPostRequestHandler extends PostRequestHandler{
	
	private static final Logger logger = LoggerFactory.getLogger(LogPostRequestHandler.class);
	@Override
	public PostRequestHandler postHandle(HttpParameter httpParameter, Object returnResult) {
		logger.info("URI:{},Result : {}",httpParameter.getUri(),returnResult);
		return next();
	}
}
