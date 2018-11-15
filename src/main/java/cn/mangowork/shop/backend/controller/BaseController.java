package cn.mangowork.shop.backend.controller;

import cn.mangowork.shop.constant.Types;
import cn.mangowork.shop.constant.WebConst;
import cn.mangowork.shop.backend.dto.MetaDto;
import cn.mangowork.shop.backend.dto.cond.ContentCond;
import cn.mangowork.shop.backend.model.UserDomain;
import cn.mangowork.shop.backend.service.meta.MetaService;
import cn.mangowork.shop.backend.service.site.SiteService;
import cn.mangowork.shop.utils.MapCache;
import cn.mangowork.shop.utils.TaleUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * Created by Donghua.Chen on 2018/4/30.
 */
public abstract class BaseController {

    @Autowired
    private MetaService metaService;

    @Autowired
    private SiteService siteService;


    protected MapCache cache = MapCache.single();

    public BaseController title(HttpServletRequest request, String title) {
        request.setAttribute("title", title);
        return this;
    }

    /**
     * 获取blog页面需要的公共数据
     * @param request
     * @return
     */
    public BaseController blogBaseData(HttpServletRequest request, ContentCond contentCond){
        List<MetaDto> links = metaService.getMetaList(Types.LINK.getType(), null,WebConst.MAX_POSTS);
        request.setAttribute("links", links);
        return this;
    }
    /**
     * 获取请求绑定的登录对象
     * @param request
     * @return
     */
    public UserDomain user(HttpServletRequest request) {
        return TaleUtils.getLoginUser(request);
    }

    public Integer getUid(HttpServletRequest request){
        return this.user(request).getUid();
    }

    /**
     * 数组转字符串
     *
     * @param arr
     * @return
     */
    public String join(String[] arr) {
        StringBuilder ret = new StringBuilder();
        String[] var3 = arr;
        int var4 = arr.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            String item = var3[var5];
            ret.append(',').append(item);
        }

        return ret.length() > 0 ? ret.substring(1) : ret.toString();
    }
}
