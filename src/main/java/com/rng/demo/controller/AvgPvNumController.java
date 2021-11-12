package com.rng.demo.controller;

import com.google.gson.Gson;
import com.rng.demo.pojo.AvgReturnPojo;
import com.rng.demo.service.impl.AvgPvNumServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AvgPvNumController",value = "/AvgPvNum")
public class AvgPvNumController extends HttpServlet {
    private AvgPvNumServiceImpl avgPvNumService = new AvgPvNumServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        AvgReturnPojo avgReturnPojo = avgPvNumService.getAvgReturnPojo();

        response.setContentType("text/json");
        response.setCharacterEncoding("UTF-8");

        Gson gson = new Gson();
        String json = gson.toJson(avgReturnPojo);
        PrintWriter writer = response.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
