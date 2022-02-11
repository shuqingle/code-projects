package com.sugo.resident.console.ruser.controller;

import com.sugo.resident.common.annotation.WebLog;
import com.sugo.resident.common.model.response.ObjectResponse;
import com.sugo.resident.common.utils.ResponseUtils;
import com.sugo.resident.console.ruser.dao.RUserMapper;
import com.sugo.resident.console.ruser.model.UserInfoDto;
import com.sugo.resident.console.ruser.model.UserInfoVO;
import com.sugo.resident.console.ruser.service.RUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class RUserController {
    @Autowired
    RUserService rUserService;

    @RequestMapping("/console/ruser/login")
    @ResponseBody
    @WebLog(description = "用户登录接口")
    public ObjectResponse<UserInfoVO> login(@RequestBody UserInfoDto userInfoDto) throws Exception {
        return ResponseUtils.objectSuccess(rUserService.login(userInfoDto));
    }
}
