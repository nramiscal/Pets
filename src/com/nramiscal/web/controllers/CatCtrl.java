package com.nramiscal.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nramiscal.web.models.Cat;
import com.nramiscal.web.models.Dog;

/**
 * Servlet implementation class CatCtrl
 */
@WebServlet("/cat")
public class CatCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String catName = request.getParameter("name");
		String catBreed = request.getParameter("breed");
		// cast weight from string to double
		double catWeight = Double.parseDouble(request.getParameter("weight"));
		
		Cat c = new Cat(catName, catBreed, catWeight);
		request.setAttribute("cat", c);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Cat.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
