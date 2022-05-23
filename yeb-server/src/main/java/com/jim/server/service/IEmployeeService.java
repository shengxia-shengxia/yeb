package com.jim.server.service;

import com.jim.server.pojo.Employee;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jim.server.pojo.RespPageBean;

import java.time.LocalDate;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jim
 * @since 2022-05-11
 */
public interface IEmployeeService extends IService<Employee> {

    /**
     * @Author: Jim
     * @Description: 获取所有员工（分页）
     * @Params: 
     */
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);
}
