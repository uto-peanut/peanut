package com.peanut.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.peanut.entity.User;
import com.peanut.mapper.UserMapper;
import com.peanut.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
