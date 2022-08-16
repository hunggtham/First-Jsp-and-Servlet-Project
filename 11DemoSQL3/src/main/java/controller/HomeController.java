package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Account;
import dao.HomeDAO;
import db.DBConnection;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Connection conn = DBConnection.CreateConnection();
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		Account acc = new Account ();
		
		acc.setUname(uname);
		acc.setPass(pass);
		
//		boolean kt = HomeDAO.InsertAccount(conn, acc);
//		
//		if(kt) {
//			try {
//				request.setAttribute("msgRegister", "Register Success");
//				
//				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Register.jsp");
//				rd.forward(request, response);
//				conn.close();
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}else {
//			request.setAttribute("msgRegister", "Register Fail");
//			
//			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Register.jsp");
//			rd.forward(request, response);
//		}
	}

}
