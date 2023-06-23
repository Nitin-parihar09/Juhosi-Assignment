package com.nitin.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nitin.DAO.UserDAO;
import com.nitin.model.Model;

@WebServlet("/insert1")
public class Insert1 extends HttpServlet {
	UserDAO userdao = new UserDAO();
	Model model;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String date = req.getParameter("order_date");
		String company = req.getParameter("company");
		String owner = req.getParameter("owner");
		String item = req.getParameter("item");
		Integer quantity = Integer.parseInt(req.getParameter("quantity"));
		Float weight = Float.parseFloat(req.getParameter("weight")) ;
		String request_for_shipment = req.getParameter("request_for_shipment");
		String tracking_id = req.getParameter("tracking_id");
		Integer box_count = Integer.parseInt(req.getParameter("box_count"));
		String specialization = req.getParameter("specialization");
		String checklist_quantity = req.getParameter("checklist_quantity");
		
		model = new Model(date, company, owner, item, quantity, weight, request_for_shipment, tracking_id, box_count, specialization, checklist_quantity);
		if(userdao.insert1(model)) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Customer1.jsp");
			dispatcher.forward(req, res);
		}
	}
}
