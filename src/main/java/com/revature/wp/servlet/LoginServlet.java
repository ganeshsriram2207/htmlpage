package com.revature.wp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.revature.wp.dao.UserDAOImpl;
import com.revature.wp.exception.DBException;
import com.revature.wp.model.UserDetail;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
        String password = request.getParameter("password");
        
        String json = LoginController.login(name,password);
        PrintWriter out = response.getWriter();
        out.write(json);        
        out.flush();
	}

	
	
	}


