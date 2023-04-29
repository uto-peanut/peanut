package com.peanut.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peanut.entity.ShoppingCart;
import com.peanut.mapper.ShoppingCartMapper;
import com.peanut.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
