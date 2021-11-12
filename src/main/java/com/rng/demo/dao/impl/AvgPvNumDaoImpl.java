package com.rng.demo.dao.impl;

import com.rng.demo.Util.JDBCUtil;
import com.rng.demo.dao.AvgPvNumDao;
import com.rng.demo.pojo.AvgPvNum;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AvgPvNumDaoImpl implements AvgPvNumDao {
    @Override
    public List<AvgPvNum> getAvgPvNum() {
        List<AvgPvNum> lists = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil.getConnetion();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select  * from t_avgpv_num");
            while (resultSet.next()){
                AvgPvNum avgpvNum = new AvgPvNum();
                avgpvNum.setId(resultSet.getInt("id"));
                avgpvNum.setDataStr(resultSet.getString("dateStr"));
                avgpvNum.setAvgPvNum(resultSet.getFloat("avgPvnum"));
                lists.add(avgpvNum);
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
