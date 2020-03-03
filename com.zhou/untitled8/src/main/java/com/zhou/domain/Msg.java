package com.zhou.domain;

import java.util.HashMap;
import java.util.Map;

public class Msg {
    private int code;

    private String msg;

    private Map<String,Object> data = new HashMap<String, Object>();

    public Msg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static Msg message(int code,String msg){
        Msg result = new Msg(code, msg);
        return result;
    }
    /**
     * 处理成功时返回的数据
     * @return
     */
    public static Msg success(){
        Msg result = new Msg(200,"操作成功");
        return result;
    }

    public static Msg success(String msg){
        Msg result = new Msg(200,msg);
        return result;
    }

    public static Msg error(){
        Msg result = new Msg(0,"操作失败");
        return result;
    }
    public static Msg error(String msg){
        Msg result = new Msg(0,msg);
        return result;
    }

    /**
     * 添加封装的数据，实现链式编程
     * @param key
     * @param value
     * @return
     */
    public Msg add(String key,Object value){
        this.data.put(key,value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

//    public void setData(Map<String, String> data) {
//        this.data = data;
//    }

    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}