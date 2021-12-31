package com.crush.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.crush.server.pojo.Admin;
import com.crush.server.pojo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author crush
 * @since 2021-12-29
 */
public interface AdminMapper extends BaseMapper<Admin> {

    List<Admin> getAllAdmins(@Param("id") Integer id, @Param("keywords") String keywords);
}
