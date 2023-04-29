package com.peanut.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.peanut.entity.OrderDetail;
import com.peanut.mapper.OrderDetailMapper;
import com.peanut.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}