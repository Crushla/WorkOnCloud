package com.crush.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.crush.server.pojo.AdminRole;
import com.crush.server.pojo.RespBean;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author crush
 * @since 2021-12-29
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    Integer addAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
