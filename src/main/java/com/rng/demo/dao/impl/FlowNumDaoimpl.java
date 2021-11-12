package com.rng.demo.dao.impl;

import com.rng.demo.Util.JDBCUtil;
import com.rng.demo.dao.FlowNumDao;
import com.rng.demo.pojo.FlowNum;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FlowNumDaoimpl implements FlowNumDao {
    @Override
    public List<FlowNum> getList() {
        List<FlowNum> lists = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil.getConnetion();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from t_flow_num");
            while (resultSet.next()){
                FlowNum flowNum = new FlowNum();
                flowNum.setId(resultSet.getInt("id"));
                flowNum.setDateStr(resultSet.getString("dateStr"));
                flowNum.setpVNum(resultSet.getInt("pVNum"));
                flowNum.setuVnum(resultSet.getInt("uVNum"));
                flowNum.setiPNum(resultSet.getInt("iPNum"));
                flowNum.setNewUvNum(resultSet.getInt("newUvNum"));
                flowNum.setVisitNum(resultSet.getInt("visitNum"));
                lists.add(flowNum);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.close(connection,statement,resultSet);
            return lists;
        }
    }
}
