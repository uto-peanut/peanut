package com.peanut.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peanut.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
