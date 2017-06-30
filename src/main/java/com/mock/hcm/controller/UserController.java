package com.mock.hcm.controller;

import com.mock.hcm.common.JsonResult;
import com.mock.hcm.common.TipCode;
import com.mock.simplemvc.annotation.Controller;
import com.mock.simplemvc.annotation.NotEmpty;
import com.mock.simplemvc.annotation.ParamValidator;
import com.mock.simplemvc.http.BaseController;
import com.mock.simplemvc.http.base.HttpParameter;

@Controller
public class UserController extends BaseController {
	
	public JsonResult register() {
		return new JsonResult();
	}
	
	public JsonResult login() {
		
		return new JsonResult();
	}
	
	@ParamValidator(param="phone",rules={NotEmpty.class})
	public JsonResult vcode(HttpParameter params) {
		
		params.value("phone");
		
		//发送验证码
	
		return new JsonResult().status(TipCode.SUCCESS_CODE).show("验证码发送成功");
	}
}
