package com.peanut.dto;


import com.peanut.entity.Setmeal;
import com.peanut.entity.SetmealDish;
import lombok.Data;

import java.util.List;


/**
 * 继承套餐属性
 */
@Data
public class SetmealDto extends Setmeal {


    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
