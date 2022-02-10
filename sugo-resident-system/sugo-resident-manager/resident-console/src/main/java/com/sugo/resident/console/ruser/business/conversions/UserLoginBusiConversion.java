package com.sugo.resident.console.ruser.business.conversions;

import com.sugo.resident.common.business.conversion.BusinessConversion;
import com.sugo.resident.console.ruser.model.UserInfoDto;

public class UserLoginBusiConversion extends BusinessConversion<UserInfoDto> {
    public UserLoginBusiConversion(UserInfoDto userInfoDto) {
        super(userInfoDto);
    }
}
