package com.jdr.manage.modular.system.dao;

import com.jdr.manage.core.common.node.MenuNode;
import com.jdr.manage.core.common.node.ZTreeNode;
import com.jdr.manage.modular.system.model.Category;

import java.util.List;
import java.util.Map;

public interface CategoryMapper extends BaseDao<Category> {

    List<Category> getCatogry(Map map);

    List<MenuNode> getCatogryNode(Map map);

    /**
     * 获取ztree的节点列表
     */
    List<ZTreeNode> tree();
}