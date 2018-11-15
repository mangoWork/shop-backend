package cn.mangowork.shop.backend.controller.admin;

import cn.mangowork.shop.constant.LogActions;
import cn.mangowork.shop.constant.WebConst;
import cn.mangowork.shop.backend.controller.BaseController;
import cn.mangowork.shop.backend.model.OptionsDomain;
import cn.mangowork.shop.backend.service.log.LogService;
import cn.mangowork.shop.backend.service.option.OptionService;
import cn.mangowork.shop.utils.ApiResponse;
import cn.mangowork.shop.utils.GsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by
 */
@Api("系统设置")
@Controller
@RequestMapping("/admin/setting")
public class SettingController extends BaseController {

    @Autowired
    private OptionService optionService;

    @Autowired
    private LogService logService;


}
