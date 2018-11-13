package cn.mangowork.shop.controller.admin;

import cn.mangowork.shop.constant.LogActions;
import cn.mangowork.shop.constant.WebConst;
import cn.mangowork.shop.controller.BaseController;
import cn.mangowork.shop.model.OptionsDomain;
import cn.mangowork.shop.service.log.LogService;
import cn.mangowork.shop.service.option.OptionService;
import cn.mangowork.shop.utils.ApiResponse;
import cn.mangowork.shop.utils.GsonUtils;
import cn.mangowork.shop.service.log.LogService;
import cn.mangowork.shop.service.option.OptionService;
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
 * Created by Donghua.Chen on 2018/4/30.
 */
@Api("系统设置")
@Controller
@RequestMapping("/admin/setting")
public class SettingController extends BaseController {

    @Autowired
    private OptionService optionService;

    @Autowired
    private LogService logService;


    @ApiOperation("进入设置页")
    @GetMapping(value = "")
    public String setting(HttpServletRequest request){
        List<OptionsDomain> optionsList = optionService.getOptions();
        Map<String, String> options = new HashMap<>();
        optionsList.forEach((option) -> {
            options.put(option.getName(), option.getValue());
        });
        request.setAttribute("options", options);
        return "admin/setting";
    }


    @ApiOperation("保存系统设置")
    @PostMapping(value = "")
    @ResponseBody
    public ApiResponse saveSetting(HttpServletRequest request) {
        try {
            Map<String, String[]> parameterMap = request.getParameterMap();
            Map<String, String> querys = new HashMap<>();
            parameterMap.forEach((key, value) -> {
                querys.put(key, join(value));
            });
            optionService.saveOptions(querys);
            WebConst.initConfig = querys;

            logService.addLog(LogActions.SYS_SETTING.getAction(), GsonUtils.toJsonString(querys), request.getRemoteAddr(), this.getUid(request));
            return ApiResponse.success();
        } catch (Exception e) {
            String msg = "保存设置失败";
            return ApiResponse.fail(msg);
        }
    }







}
