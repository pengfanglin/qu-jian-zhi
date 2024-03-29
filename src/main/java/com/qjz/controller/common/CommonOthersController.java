package com.qjz.controller.common;

import com.fanglin.common.annotation.Token;
import com.fanglin.common.core.others.Ajax;
import com.fanglin.common.utils.UploadUtils;
import com.qjz.core.others.TokenData;
import com.qjz.enums.others.AuthCodeTypeEnum;
import com.qjz.enums.others.CodeTypeEnum;
import com.qjz.service.common.CommonOthersService;
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
@RequestMapping("/common/others/")
@Api(value = "/common/others/", tags = {"公共", "其他"})
public class CommonOthersController {

    @Autowired
    CommonOthersService commonOthersService;

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
    public Ajax sendCode(@RequestParam String mobile, @RequestParam CodeTypeEnum type) {
        commonOthersService.sendCode(mobile, type.toString());
        return Ajax.ok("发送成功");
    }

    @ApiOperation("发送鉴权验证码")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "type", value = "验证码类型", required = true)
    })
    @Token("admin")
    @PostMapping("sendAuthCode")
    public Ajax sendCode(TokenData tokenData, @RequestParam AuthCodeTypeEnum type) {
        commonOthersService.sendCode(tokenData.getMobile(), type.toString());
        return Ajax.ok("发送成功");
    }

    @ApiOperation("发送测试验证码")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "mobile", value = "手机号", required = true),
        @ApiImplicitParam(name = "type", value = "验证码类型", required = true)
    })
    @PostMapping("sendCodeTest")
    public Ajax sendCodeTest(@RequestParam String mobile, @RequestParam CodeTypeEnum type) {
        String code = commonOthersService.sendTestCode(mobile, type.toString());
        return Ajax.ok(code);
    }

    @ApiOperation("发送测试鉴权验证码")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "type", value = "验证码类型", required = true)
    })
    @Token("admin")
    @PostMapping("sendAuthCodeTest")
    public Ajax sendAuthCodeTest(TokenData tokenData, @RequestParam AuthCodeTypeEnum type) {
        String code = commonOthersService.sendTestCode(tokenData.getMobile(), type.toString());
        return Ajax.ok(code);
    }
}
