package com.sugo.resident.console.ruser.business.actions.checks;


import com.sugo.resident.common.business.action.AbstractBusinessAction;
import com.sugo.resident.common.business.base.BusinessBase;
import com.sugo.resident.common.enumInfo.ResultCodeInfo;
import com.sugo.resident.common.utils.BusinessUtil;
import com.sugo.resident.console.ruser.business.enums.UserResultCodeInfo;
import com.sugo.resident.console.ruser.model.UserInfoDto;
import org.springframework.util.StringUtils;

public class UserTellerNoNotNullCheckAction extends AbstractBusinessAction<UserInfoDto> {
    public UserTellerNoNotNullCheckAction(BusinessBase<UserInfoDto> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        if(StringUtils.isEmpty(this.data().getTellerNo())){
            BusinessUtil.stopBusiProcess(UserResultCodeInfo.USER_NO_PASS_EMPTY_ERROR);
        }
    }
}
