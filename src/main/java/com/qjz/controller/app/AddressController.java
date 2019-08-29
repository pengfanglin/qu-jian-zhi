package com.qjz.controller.app;

import com.fanglin.common.core.others.Ajax;
import com.qjz.model.city.ServiceCityListModel;
import com.qjz.model.user.UserLoginResultModel;
import com.qjz.service.app.AddressService;
import com.qjz.service.app.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 地址
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:36
 **/
@RestController
@RequestMapping("/app/address/")
@Api(value = "/app/address/", tags = {"APP", "地址"})
public class AddressController {

    @Autowired
    AddressService addressService;

    @ApiOperation("服务城市列表")
    @PostMapping("serviceCityList")
    public Ajax<List<ServiceCityListModel>> serviceCityList() {
        return Ajax.ok(addressService.serviceCityList());
    }
}
