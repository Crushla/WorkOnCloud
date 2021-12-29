package com.crush.server.service.impl;

import com.crush.server.pojo.Role;
import com.crush.server.mapper.RoleMapper;
import com.crush.server.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author crush
 * @since 2021-12-29
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
