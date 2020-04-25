package com.jdr.manage.modular.system.service.impl;

import com.jdr.manage.core.util.Pager;
import com.jdr.manage.modular.system.dao.SiteMapper;
import com.jdr.manage.modular.system.model.Site;
import com.jdr.manage.modular.system.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author jsnjfz
 * @Date 2019/7/21 15:17
 * 分类相关业务接口实现类
 */
@Service
public class SiteServiceImpl extends BaseService<Site> {

    @Autowired
    private SiteMapper siteMapper;

    public static Pager<Site> pager = null;

    /**
     * 分页处理
     */
    public Pager<Site> getPage(Map<String, Object> map, Integer pageNo, Integer size) {
        if (map == null) {
            if (pager != null) {
                return pager;
            }
            map = new HashMap<>();
        }
        int total = siteMapper.getTotalCount(map);
        Pager<Site> page = new Pager<>(total, pageNo, size);
        map.put("offset", pageNo);
        map.put("size", size);
        page.setList(siteMapper.getList(map));
        if (pager == null) {
            pager = page;
        }
        return page;
    }

}
