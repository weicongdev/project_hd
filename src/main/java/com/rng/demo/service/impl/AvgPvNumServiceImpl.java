package com.rng.demo.service.impl;

import com.rng.demo.dao.impl.AvgPvNumDaoImpl;
import com.rng.demo.pojo.AvgPvNum;
import com.rng.demo.pojo.AvgReturnPojo;
import com.rng.demo.service.AvgPvNumService;


import java.util.ArrayList;
import java.util.List;

public class AvgPvNumServiceImpl implements AvgPvNumService {
    private AvgPvNumDaoImpl avgPvNumDao = new AvgPvNumDaoImpl();
    @Override
    public AvgReturnPojo getAvgReturnPojo() {
        ArrayList<String> datesArrays = new ArrayList<>();
        ArrayList<String> dataArrays = new ArrayList<>();
        AvgReturnPojo avgReturnPojo = new AvgReturnPojo();
        List<AvgPvNum> lists = avgPvNumDao.getAvgPvNum();
        for(AvgPvNum avgPvNum:lists){
            datesArrays.add(avgPvNum.getDataStr());
            dataArrays.add(String.valueOf(avgPvNum.getAvgPvNum()));
        }
        avgReturnPojo.setDates(datesArrays);
        avgReturnPojo.setData(dataArrays);
        return avgReturnPojo;

    }


}
