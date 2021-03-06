package com.three.memory.service;

import com.three.memory.domain.User;
import com.three.memory.vo.ResultBean;

public interface UserService {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    ResultBean login(String username, String password);

    /**
     * 注销登录
     * @param token
     * @return
     */
    ResultBean loginout(String token);

    /**
     * 用户注册
     * @param user
     * @return
     */
    ResultBean regist(User user);

    /**
     * 判断用户名是否存在
     * @param username
     * @return
     */
    ResultBean checkUsername(String username);
}
