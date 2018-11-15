package cn.mangowork.shop.api;

import cn.mangowork.shop.constant.enums.HttpStatus;
import cn.mangowork.shop.utils.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author dailiming
 * @version v1
 * 商品分类
 * @create 2018-11-15 16:59
 **/
@Controller
@RequestMapping("/api")
@Api("网站首页和关于页面")
public class API {

    @GetMapping(value = {"/", "/index"})
    @ResponseBody
    @ApiOperation("测试接口")
    public ApiResponse index(){
        return ApiResponse.widthSuccess(new Date());
    }

}
