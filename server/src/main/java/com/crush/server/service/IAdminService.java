package com.crush.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.crush.server.pojo.Admin;
import com.crush.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author crush
 * @since 2021-12-29
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param code
     * @param request
     * @return
     */
    RespBean login(String username, String password, String code, HttpServletRequest request);

    /**
     * 根据用户名获得用户
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);
}
