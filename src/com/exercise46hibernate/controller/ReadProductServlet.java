package com.exercise46hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exercise46hibernate.model.Product;

/**
 * Servlet implementation class ReadProductServlet
 */
@WebServlet("/ReadProductServlet")
public class ReadProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8");
		PrintWriter output = response.getWriter();
		
		Product product = new Product();
		
	}

}
