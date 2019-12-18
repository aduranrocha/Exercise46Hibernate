package com.exercise46hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.exercise46hibernate.model.Product;

/**
 * Servlet implementation class CreateProductServlet
 */
@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8");
		PrintWriter output = response.getWriter();
		
		Product myProduct = new Product();
		myProduct.setNameProduct(request.getParameter("txtNameProduct"));
		myProduct.setPriceProduct(Double.parseDouble(request.getParameter("txtPriceProduct")));
		System.out.println(myProduct.toString());
		
		// Create the configuration  object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		// Session factory creation
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		// Open session
		Session session = sessionFactory.openSession();
		
		// Request begin
		Transaction t = session.beginTransaction();
		
		// Process of persistence
		// CRUD - C
		session.persist(myProduct);
		
		session.close();
		output.close();
		System.out.println("Se guardaron los datos");
	}

}
