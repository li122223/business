package com.zhuangjiayu.demo.biz;


import com.zhuangjiayu.demo.entity.Department;

import java.util.List;

public interface DepartmentBiz {
    void add(Department department);
    void edit(Department department);
    void remove(String sn);
    Department get(String sn);
    List<Department> getAll();
}
