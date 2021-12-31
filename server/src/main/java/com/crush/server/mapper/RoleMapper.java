package com.crush.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.crush.server.pojo.Role;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author crush
 * @since 2021-12-29
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> getRoles(Integer adminId);
}
