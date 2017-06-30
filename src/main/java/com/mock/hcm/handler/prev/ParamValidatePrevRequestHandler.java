package com.mock.hcm.handler.prev;

import com.mock.hcm.common.JsonResult;
import com.mock.hcm.common.TipCode;
import com.mock.hcm.config.TipConfig;
import com.mock.simplemvc.http.base.HttpParameter;
import com.mock.simplemvc.http.core.PrevRequestHandler;
import com.mock.simplemvc.http.core.ResponceWriter;
import com.mock.simplemvc.http.core.Validator;

/**  
* @ClassName: ParamValidatePrevRequestHandler  
* @Description: 参数校验前处理器，用于对客户端上传的参数进行合法性校验
* @author Mock(LCM)
*    
*/
public class ParamValidatePrevRequestHandler extends PrevRequestHandler {

	@Override
	public PrevRequestHandler prevHandle(HttpParameter httpParameter,ResponceWriter responceWriter) {
		
		//由底层校验器引擎进行校验，如果不通过，则会返回不通过校验规则的字段
		String illeageParam = Validator.valiate(httpParameter);
		if (null == illeageParam) return next();
		responceWriter.write(new JsonResult().status(TipCode.COMMON_ILLEAGE_REQUEST_CODE)
				.show(TipConfig.showTip(TipCode.COMMON_ILLEAGE_REQUEST_CODE)));
		return back();
	}
}
