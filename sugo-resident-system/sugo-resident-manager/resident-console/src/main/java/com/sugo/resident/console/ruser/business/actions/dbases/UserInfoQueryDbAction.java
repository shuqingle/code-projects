package com.sugo.resident.console.ruser.business.actions.dbases;

import com.sugo.resident.common.business.action.AbstractBusinessAction;
import com.sugo.resident.common.business.annot.BusiAutoWired;
import com.sugo.resident.common.business.base.BusinessBase;
import com.sugo.resident.common.business.utils.SpringContextUtil;
import com.sugo.resident.common.utils.BusinessUtil;
import com.sugo.resident.console.ruser.business.enums.UserResultCodeInfo;
import com.sugo.resident.console.ruser.dao.RUserMapper;
import com.sugo.resident.console.ruser.model.UserInfoDto;
import com.sugo.resident.console.ruser.model.UserInfoVO;

public class UserInfoQueryDbAction extends AbstractBusinessAction<UserInfoDto> {
//    @BusiAutoWired
        private RUserMapper ruserMapper = SpringContextUtil.getBean(RUserMapper.class);

    public UserInfoQueryDbAction(BusinessBase<UserInfoDto> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        UserInfoVO userInfoVO = ruserMapper.queryUserLoginInfo(this.data());
        if(userInfoVO == null){
            BusinessUtil.stopBusiProcess(UserResultCodeInfo.NOT_USER_ERROR);
        }
        this.data().setUserInfoVO(userInfoVO);
    }
}
