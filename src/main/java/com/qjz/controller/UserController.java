package com.qjz.controller;

import com.fanglin.common.annotation.Token;
import com.fanglin.common.core.others.Ajax;
import com.fanglin.common.core.token.TokenInfo;
import com.fanglin.common.utils.UploadUtils;
import com.qjz.enums.others.CodeType;
import com.qjz.model.user.UserLoginResultModel;
import com.qjz.service.OthersService;
import com.qjz.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
@RestController
@RequestMapping("/user/")
@Api(value = "/user/", tags = {"用户"})
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("用户登录")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "mobile", value = "手机号", required = true),
        @ApiImplicitParam(name = "password", value = "密码", required = true)
    })
    @PostMapping("userLogin")
    public Ajax<UserLoginResultModel> userLogin(HttpServletResponse response, @RequestParam String mobile, @RequestParam String password) {
        return Ajax.ok(userService.userLogin(response, mobile, password));
    }

    @ApiOperation("用户注册")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "mobile", value = "手机号", required = true),
        @ApiImplicitParam(name = "password", value = "密码", required = true),
        @ApiImplicitParam(name = "code", value = "验证码", required = true)
    })
    @PostMapping("userRegister")
    public Ajax<UserLoginResultModel> userRegister(HttpServletResponse response, @RequestParam String mobile, @RequestParam String password, @RequestParam String code) {
        return Ajax.ok(userService.userRegister(response, mobile, password, code));
    }
}
