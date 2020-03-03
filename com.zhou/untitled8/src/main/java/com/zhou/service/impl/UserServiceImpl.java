package com.zhou.service.impl;

import com.zhou.domain.User;
import com.zhou.service.UserService;

public class UserServiceImpl implements UserService {

    /*
    *  注册用户接口
    * */
    @Override
    public Boolean regist(User user) {
        // 根据用户名查找用户对象

        // 保存用户信息

        String userName = user.getUserName();
        String pwd = user.getPwd();


        if(true){
            return  true;
        }else {
            return false;
        }
    }
}
