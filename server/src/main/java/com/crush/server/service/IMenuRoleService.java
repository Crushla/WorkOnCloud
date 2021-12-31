package com.crush.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.crush.server.pojo.MenuRole;
import com.crush.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author crush
 * @since 2021-12-29
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
