package com.mock.hcm.dao;

import java.util.List;

import com.mock.hcm.domain.SystemTip;
import com.mock.simplemvc.annotation.Instance;
import com.mock.simplemvc.dao.base.BaseDAO;

@Instance
public class SystemTipDAO extends BaseDAO {
	
	/**
	 * 获取所有有效的提示语
	 * @param langCode 国际化langCode
	 * @return
	 */
	public List<SystemTip> findSysetmTipListByLangCode(String langCode) {
		String sql = "select * from system_tip where lang_code = ?";
		return queryList(sql, SystemTip.class, langCode);
	}
}
