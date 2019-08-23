package com.dao;

import com.bean.Toursinfo;

/**
 * Created by pc on 2019/7/13.
 */
public class ToursDaoImpl implements IToursDao {

    @Override
    public void add(Toursinfo tours) {
        System.out.println("新增模拟实现");
        System.out.println(tours);
    }
}
