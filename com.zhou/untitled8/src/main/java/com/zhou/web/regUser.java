package com.zhou.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.zhou.domain.User;
import com.zhou.service.UserService;
import com.zhou.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.io.IOUtils;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;



public class regUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获取数据


        String paramJson = IOUtils.toString(request.getInputStream(), StandardCharsets.UTF_8);
        Map parseObject = JSON.parseObject(paramJson, Map.class);
//        Map parseObject = request.getParameterMap();
//
        // 2. 封装对象
        User user = new User();
        try {
            BeanUtils.populate(user, parseObject);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        // 3. 调用service 注册
        UserService service = new UserServiceImpl();
        Boolean flag = service.regist(user);


        // 4. 响应数据
        if(flag){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }

        Map<String, Object> map = new HashMap();
        map.put("code", 200);
        map.put("data", null);
        map.put("msg", "操作成功");



//        ObjectMapper mapper = new ObjectMapper();
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSONObject.toJSONString(map));



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
