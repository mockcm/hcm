package com.mock.hcm.common;

public class TipCode {
	
	//提示编码，前三位为系统编号（800：公用，801：用户系统，802：交易系统），中间两位为具体执行的动作（从00-99），后三位为具体的提示编码（从000-999）
	
	public static final String SUCCESS_CODE = "000";
	
	public static final String COMMON_PHONE_ILLEAGE_CODE = "80000001";
	public static final String COMMON_LOGIN_OUT_CODE = "80000002";
	
	public static final String COMMON_ACCOUNT_NOT_EXIT_CODE = "80001001";
	public static final String COMMON_ACCOUNT_FREEZED_CODE = "80001002";
	public static final String COMMON_ACCOUNT_BALANCE_NOT_ENOUGH_CODE = "80001003";
	public static final String COMMON_USER_FREEZED_CODE = "80002001";
	public static final String COMMON_USER_NOT_EXIST = "80002002";
	public static final String COMMON_SERVER_ERROR_CODE = "80099000";
	public static final String COMMON_ENTER_CORRECT_AMOUNT_CODE = "80001005";
	public static final String COMMON_ILLEAGE_REQUEST_CODE = "80099001";
	public static final String COMMON_NEW_VERSION_CODE = "80003001";
	
	public static final String COMMON_NO_RESULT_CODE = "80099002";
	
	public static final String COMMON_RISK_CONTROLLER_CODE = "80004001";
	
	
	public static final String USER_REGISTE_SUCCEED_CODE = "80101000";
	public static final String USER_REGISTE_FAIL_CODE = "80101001";
	public static final String USER_NOT_REGISTE_CODE = "80101002";
	public static final String USER_REGISTE_INVITED_CODE_NOT_EXIST_CODE = "80101003";
	public static final String USER_REGISTE_INVITED_CODE_EMPTY = "80101004";
	public static final String USER_REGISTE_INVITED_CODE_NOT_BIND = "80101005";
	
	public static final String USER_LOGIN_SUCCEED_CODE = "80102000";
	public static final String USER_LOGIN_FAIL_CODE = "80102001";
	public static final String USER_VCODE_SEND_FAIL_CODE = "80103001";
	public static final String USER_VCODE_EXCEED_MAX_TIMES_CODE = "80103002";
	public static final String USER_VCODE_EXPIRED_CODE = "80103003";
	public static final String USER_VCODE_SEND_SUCCEED_CODE = "80103004";
	public static final String USER_VCODE_WRONG_CODE = "80103005";
	
	public static final String USER_RECHARGE_SUCCEED_CODE = "80104000";
	public static final String USER_RECHARGE_FAIL_CODE = "80104001";
	public static final String USER_RECHARGE_LESS_THAN_CODE = "80104002";
	public static final String USER_RECHARGE_MORE_THAN_CODE = "80104003";
	public static final String USER_RECHARGE_NOT_OPEN_CODE = "80104004";
	public static final String USER_RECHARGE_FEE_NOT_CONFIG_CODE = "80104005";
	public static final String USER_RECHARGE_INVALID_FREE_FORMAT_CODE = "80104006";
	
	public static final String USER_WITHDRAW_REQUEST_SUBMIT_CODE = "80105000";
	public static final String USER_WITHDRAW_FAIL_CODE = "80105001";
	public static final String USER_WITHDRAW_ENTER_CORRECT_BANK_CODE = "80105002";
	public static final String USER_WITHDRAW_LESS_THAN_CODE = "80105003";
	public static final String USER_WITHDRAW_MORE_THAN_CODE = "80105004";
	public static final String USER_WITHDRAW_SELECT_BANK_CODE = "80105005";
	public static final String USER_WITHDRAW_ENTER_RECEIVER_NAME_CODE = "80105006";
	
	
	public static final String USER_PAY_PASSWORD_SET_FAIL = "80107001";
	public static final String USER_PAY_PASSWORD_NOT_CORRECT = "80107002";
	public static final String USER_PAYPASSWORD_NOT_EQUAL_CONFIRM_PASSWORD = "80107003";
	public static final String USER_SET_PAY_PASSWORD_CODE = "80107004";
	public static final String USER_PAY_PASSWORD_PHONE_EXIST = "80107005";
	
	public static final String USER_FEEDBACK_FAIL_CODE = "80108001";
	public static final String USER_FEEDBACK_MAX_COUNT = "80108002";
	public static final String USER_FEEDBACK_CONTENT_TOO_LONG = "80108003";
	
	
	public static final String TRADE_ORDER_FAIL_CODE = "80201001";
	public static final String TRADE_ORDER_INVALID_CODE = "80201002";
	public static final String TRADE_ORDER_TIME_CANNOT_TRADE_CODE = "80201003";
	public static final String TRADE_ORDER_EXCEED_MAX_AMOUNT_ORDER_CODE = "80201004";
	public static final String TRADE_ORDER_PRODUCT_OFF_CODE = "80201005";
	public static final String TRADE_ORDER_EXCEED_MAX_AMOUNT = "80201006";
	public static final String TRADE_ORDER_LESS_THAN_MIN_AMOUNT = "80201007";
	public static final String TRADE_ORDER_NOT_ALLOW_FREQUENT_CODE = "80201008";
	public static final String TRADE_ORDER_EXCEED_MAX_POSITION_ORDER_CODE = "80201009";
	public static final String TRADE_ORDER_EXCEED_GUARANTEE_RATIO_CODE = "80201010";
	public static final String TRADE_ORDER_ABOUT_TO_CLOSE = "80201011";
	
	public static final String MAIL_QUERY_PARAM_FAIL = "80300001";
	public static final String MAIL_RECEIVE_FAIL = "80300002";
	
	//商城
	public static final String MALL_ORDER_FAIL = "80501001";
	public static final String MALL_ORDER_MALL_COIN_NOT_ENOUGH = "80501002";
	
}
