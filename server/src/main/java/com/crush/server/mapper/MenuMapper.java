package com.crush.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.crush.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author crush
 * @since 2021-12-29
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> getMenusByAdminId(Integer id);

    List<Menu> getMenusWithRole();

    List<Menu> getAllMenus();
}
