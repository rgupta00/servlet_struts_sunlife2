package com.bookapp.cotroller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.BookService;

@WebServlet("/SelectBook")
public class SelectBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService bookService=new BookService();
		String topic=request.getParameter("topic");
		//list of books
		List<String> books=bookService.getAllBooks(topic);
		
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		request.setAttribute("books", books);
		rd.forward(request, response);
		
	}

}











