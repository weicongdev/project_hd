package com.rng.demo.controller;

import com.google.gson.Gson;
import com.rng.demo.pojo.FlowNumReturnPojo;
import com.rng.demo.service.impl.FlowNumServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FlowNumController",value = "/flowNum")
public class FlowNumController extends HttpServlet {
    private FlowNumServiceimpl flowNumServiceimpl = new FlowNumServiceimpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FlowNumReturnPojo flowNumReturnPojo = flowNumServiceimpl.getFlowNumReturn();

        response.setContentType("text/json");
        response.setCharacterEncoding("UTF-8");

        Gson gson = new Gson();
        String json = gson.toJson(flowNumReturnPojo);

        PrintWriter writer = response.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
