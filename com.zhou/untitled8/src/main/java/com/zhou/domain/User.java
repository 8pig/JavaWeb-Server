package com.zhou.domain;

public class User {
    private String userName;
    private String add;
    private String pwd;
    private int id;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", add='" + add + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
