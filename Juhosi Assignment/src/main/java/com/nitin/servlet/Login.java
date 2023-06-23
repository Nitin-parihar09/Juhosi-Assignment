package com.nitin.servlet;

import java.io.IOException;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nitin.DAO.UserDAO;

@WebServlet("/login")
public class Login extends HttpServlet {
	 UserDAO userdao = new UserDAO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		boolean b = userdao.login(user, pass);
		if(user.equals("customer1")  && b) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Customer1.jsp");
			dispatcher.forward(req, res);
		}
		if(user.equals("customer2")  && b) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Customer2.jsp");
			dispatcher.forward(req, res);
		}
		if(user.equals("admin")  && b) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Admin.jsp");
			dispatcher.forward(req, res);
		}
		
	}
}
