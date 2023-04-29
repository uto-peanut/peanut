package com.peanut.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peanut.entity.SetmealDish;
import com.peanut.mapper.SetmealDishMapper;
import com.peanut.service.SetmealDishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
