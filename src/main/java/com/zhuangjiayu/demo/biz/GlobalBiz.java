package com.zhuangjiayu.demo.biz;


import com.zhuangjiayu.demo.entity.Employee;

public interface GlobalBiz {
    Employee login(String sn, String password);
    void changePassword(Employee employee);
}
