package com.peanut.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.peanut.entity.DishFlavor;
import com.peanut.mapper.DishFlavorMapper;
import com.peanut.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
