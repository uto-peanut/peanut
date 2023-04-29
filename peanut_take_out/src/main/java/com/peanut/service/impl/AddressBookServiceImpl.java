package com.peanut.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.peanut.entity.AddressBook;
import com.peanut.mapper.AddressBookMapper;
import com.peanut.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
