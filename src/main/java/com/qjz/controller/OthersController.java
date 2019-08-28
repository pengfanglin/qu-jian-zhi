package com.qjz.controller;

import com.fanglin.common.annotation.Token;
import com.fanglin.common.core.others.Ajax;
import com.fanglin.common.core.token.TokenInfo;
import com.fanglin.common.utils.UploadUtils;
import com.qjz.core.others.TokenData;
import com.qjz.enums.others.AuthCodeType;
import com.qjz.enums.others.CodeType;
import com.qjz.service.OthersService;
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

/**
 * 其他接口控制器
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
@RestController
@RequestMapping("/others/")
@Api(value = "/others/", tags = {"基本服务"})
public class OthersController {

    @Autowired
    OthersService othersService;

    @ApiOperation("上传多个文件")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "files", value = "图片文件", required = true),
        @ApiImplicitParam(name = "path", value = "保存路径", defaultValue = "/files/others")
    })
    @PostMapping("uploadFiles")
    public Ajax uploadFiles(@RequestParam("file") MultipartFile[] files, String path) {
        return UploadUtils.uploadFiles(files, false, path);
    }

    @ApiOperation("发送验证码")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "mobile", value = "手机号", required = true),
        @ApiImplicitParam(name = "type", value = "验证码类型", required = true)
    })
    @PostMapping("sendCode")
    public Ajax sendCode(@RequestParam String mobile, @RequestParam CodeType type) {
        othersService.sendCode(mobile, type.toString());
        return Ajax.ok("发送成功");
    }

    @ApiOperation("发送验证码")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "type", value = "验证码类型", required = true)
    })
    @PostMapping("sendCodeAuth")
    @Token
    public Ajax sendCode(TokenData tokenData, @RequestParam CodeType type) {
        othersService.sendCode(tokenData.getMobile(), type.toString());
        return Ajax.ok("发送成功");
    }

    @ApiOperation("发送测试验证码")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "mobile", value = "手机号", required = true),
        @ApiImplicitParam(name = "type", value = "验证码类型", required = true)
    })
    @PostMapping("sendCodeTest")
    @Token
    public Ajax sendCodeTest(@RequestParam String mobile, @RequestParam CodeType type) {
        String code = othersService.sendTestCode(mobile, type.toString());
        return Ajax.ok(code);
    }

    @ApiOperation("发送测试鉴权验证码")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "type", value = "验证码类型", required = true)
    })
    @PostMapping("sendAuthCodeTest")
    @Token
    public Ajax sendAuthCodeTest(TokenData tokenData, @RequestParam CodeType type) {
        String code = othersService.sendTestCode(tokenData.getMobile(), type.toString());
        return Ajax.ok(code);
    }
}
