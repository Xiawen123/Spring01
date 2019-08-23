package com.service;

import com.bean.Toursinfo;
import com.dao.IToursDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by pc on 2019/7/13.
 */

public class ToursServiceImpl implements ITousService {

    //3
    @Autowired
    IToursDao dao ;

    public IToursDao getDao() {
        return dao;
    }

    public void setDao(IToursDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(Toursinfo tours){
          dao.add(tours);
    }
}
