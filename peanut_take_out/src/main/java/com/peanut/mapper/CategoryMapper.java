package com.peanut.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peanut.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}