package com.peanut.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peanut.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
