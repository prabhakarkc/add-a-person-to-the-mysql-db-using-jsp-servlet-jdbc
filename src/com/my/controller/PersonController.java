package com.my.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.dao.PersonDao;
import com.my.pojo.Address;
import com.my.pojo.Person;

/**
 * Servlet implementation class PersonController
 */
@WebServlet("/PersonController")
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PersonController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// Copying all the input parameters in to local variables
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		LocalDate dob = LocalDate.parse(request.getParameter("dob"));
		String city = request.getParameter("city");
		String state = request.getParameter("state");

		Person person = new Person();
		
		Address address = new Address(city, state);
		// Using Java Beans - An easiest way to play with group of related data
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setDob(dob);
		person.setAddress(address);

		PersonDao personDao= new PersonDao();

		// The core Logic of the application is present here
		// We are going to insert user data in to the database
		String userAdded = personDao.addUser(person);

		// On success,display message to user on Home page
		if (userAdded.equals("SUCCESS"))
		{
			request.getRequestDispatcher("/Home.jsp").forward(request, response);
		} else // On Failure, display a meaningful message to the User.
		{
			request.setAttribute("errMessage", userAdded);
			request.getRequestDispatcher("/Register.jsp").forward(request, response);
		}
	}
}
