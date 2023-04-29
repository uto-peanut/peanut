package com.peanut.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.peanut.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
