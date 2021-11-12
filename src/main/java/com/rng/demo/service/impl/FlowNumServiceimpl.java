package com.rng.demo.service.impl;

import com.rng.demo.dao.impl.FlowNumDaoimpl;
import com.rng.demo.pojo.FlowNum;
import com.rng.demo.pojo.FlowNumReturnPojo;
import com.rng.demo.service.FlowNumService;

import java.util.ArrayList;
import java.util.List;

public class FlowNumServiceimpl implements FlowNumService {
    private FlowNumDaoimpl flowNumDaoimpl = new FlowNumDaoimpl();
    @Override
    public FlowNumReturnPojo getFlowNumReturn() {
        List<FlowNum> lists = flowNumDaoimpl.getList();
        ArrayList<String> dateStrList = new ArrayList<>();
        ArrayList<String> pVNumList = new ArrayList<>();
        ArrayList<String> uVNumList = new ArrayList<>();
        ArrayList<String> iPNumList = new ArrayList<>();
        ArrayList<String> newUvNumList = new ArrayList<>();
        ArrayList<String> visitNumList = new ArrayList<>();
        for(FlowNum flowNum:lists){
            dateStrList.add(flowNum.getDateStr());
            pVNumList.add(flowNum.getpVNum().toString());
            uVNumList.add(flowNum.getuVnum().toString());
            iPNumList.add(flowNum.getiPNum().toString());
            newUvNumList.add(flowNum.getNewUvNum().toString());
            visitNumList.add(flowNum.getVisitNum().toString());
        }
        FlowNumReturnPojo pojo = new FlowNumReturnPojo(dateStrList,pVNumList,uVNumList,iPNumList,newUvNumList,visitNumList);
        return pojo;


    }
}
