package com.sugo.resident.console.ruser.business.process;


import com.sugo.resident.common.business.process.AbstractBusinessProcess;
import com.sugo.resident.console.ruser.business.actions.checks.UserTellerPassWordRightCheckAction;
import com.sugo.resident.console.ruser.business.actions.dbases.UserInfoQueryDbAction;
import com.sugo.resident.console.ruser.business.functions.LoginUserBaseInfoCheckFunction;
import com.sugo.resident.console.ruser.model.UserInfoDto;

public class UserLoginProcess extends AbstractBusinessProcess<UserInfoDto> {
    public UserLoginProcess(UserInfoDto userInfoDto) throws Exception {
        super(userInfoDto);
    }

    @Override
    public void createProcess() throws Exception {
        //用户登录信息非空检查
        this.busi = new LoginUserBaseInfoCheckFunction(this.busi);
        //查询数据库中用户是否存在
        this.busi = new UserInfoQueryDbAction(this.busi);
        //密码是否正确检查
        this.busi = new UserTellerPassWordRightCheckAction(this.busi);
        //数据生成token
    }
}
