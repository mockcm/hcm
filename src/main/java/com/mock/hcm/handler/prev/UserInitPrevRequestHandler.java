package com.mock.hcm.handler.prev;

import com.mock.hcm.common.JsonResult;
import com.mock.hcm.common.TipCode;
import com.mock.hcm.common.UserDetailLocal;
import com.mock.hcm.config.TipConfig;
import com.mock.simplemvc.http.base.HttpParameter;
import com.mock.simplemvc.http.core.PrevRequestHandler;
import com.mock.simplemvc.http.core.ResponceWriter;

public class UserInitPrevRequestHandler extends PrevRequestHandler {

	@Override
	public PrevRequestHandler prevHandle(HttpParameter httpParameter, ResponceWriter responceWriter) {
		
		if(UserDetailLocal.buildUserDetail(httpParameter.integerValue("userId"))) return last();
		
		//无法构建UserDetail对象
		responceWriter.write(new JsonResult().status(TipCode.COMMON_USER_NOT_EXIST)
				.show(TipConfig.showTip(TipCode.COMMON_USER_NOT_EXIST)));
		return back();
	}
}
