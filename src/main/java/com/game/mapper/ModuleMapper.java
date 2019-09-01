package com.game.mapper;

import com.game.core.page.Page;
import com.game.entity.role.ModuleEntity;
import com.game.model.role.model.ModuleListModel;
import com.game.model.role.model.ModuleTreeModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 系统模块
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/3 16:44
 **/
public interface ModuleMapper extends Mapper<ModuleEntity> {
    /**
     * 系统模块列表
     *
     * @param parentId 父节点id
     * @param page
     * @return
     */
    @Select("select * from module where parent_id=#{parentId} order by sort desc,id")
    List<ModuleListModel> moduleList(@Param("parentId") Integer parentId, Page page);

    /**
     * 系统账号左侧菜单树
     *
     * @param accountId 账号id
     * @return
     */
    List<ModuleTreeModel> moduleTree(@Param("accountId") Integer accountId);
}
