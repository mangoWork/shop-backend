package cn.mangowork.shop.controller.admin;

import cn.mangowork.shop.service.user.UserService;
import cn.mangowork.shop.utils.ApiResponse;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Donghua.Chen on 2018/4/20.
 */
@Api("用户管理类")
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/docker")
    @ResponseBody
    public ApiResponse<String> dockerTest(){
        return ApiResponse.success((Object) "hello docker");
    }
    
}
