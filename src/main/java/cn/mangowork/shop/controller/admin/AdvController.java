package cn.mangowork.shop.controller.admin;

import cn.mangowork.shop.constant.Types;
import cn.mangowork.shop.constant.enums.HttpStatus;
import cn.mangowork.shop.controller.BaseController;
import cn.mangowork.shop.dto.cond.MetaCond;
import cn.mangowork.shop.model.AdvDomain;
import cn.mangowork.shop.model.MetaDomain;
import cn.mangowork.shop.model.UserDomain;
import cn.mangowork.shop.service.adv.AdvServer;
import cn.mangowork.shop.service.log.LogService;
import cn.mangowork.shop.service.user.UserService;
import cn.mangowork.shop.utils.ApiResponse;
import cn.mangowork.shop.utils.ImgUtils;
import cn.mangowork.shop.utils.TaleUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

/**
 * Created by Donghua.Chen on 2018/4/30.
 */
@Api("广告管理")
@Controller("advController")
@RequestMapping(value = "/admin/shop")
public class AdvController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(AdvController.class);

    @Value("${shop.adv.img.storagePath}")
    private String storagePath;

    @Autowired
    private AdvServer advService;

    @Autowired
    private LogService logService;

    @Autowired
    private UserService userService;



    @ApiOperation("进入首页")
    @GetMapping(value = {"/adv"})
    public String index(HttpServletRequest request){
        return "admin/adv";
    }

    /**
     * 个人设置页面
     */
    @GetMapping(value = "/profile")
    public String profile() {
        return "admin/profile";
    }


    @ApiOperation("保存广告信息")
    @PostMapping(value = {"/saveAdv"})
    public String saveAdv(@RequestParam("advImg") MultipartFile file, AdvDomain advDomain, HttpServletRequest request) throws IOException {
        String path  = ImgUtils.saveImage(file, storagePath);
        UserDomain loginUser = TaleUtils.getLoginUser(request);
        advDomain.setUserId(loginUser.getUid());
        boolean b = advService.saveAdv(path, advDomain);
        return "admin/adv";
    }

    /**
     * 获取广告信息
     * @return
     */
    @RequestMapping("adv/list")
    @ResponseBody
    public List<AdvDomain> getAdvs(){
        return advService.queryAdvs();
    }

    /**
     * 获取广告信息
     * @return
     */
    @RequestMapping("adv/delete")
    @ResponseBody
    public ApiResponse getAdvs(int id){
        advService.deleteById(id);
        return ApiResponse.success();
    }

}
