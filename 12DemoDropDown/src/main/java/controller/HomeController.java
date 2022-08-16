package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Province;
import bean.Student;
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = DBConnection.CreateConnection();
		String studentName = request.getParameter("studentName");
		String provinceIdstr = request.getParameter("dropdownprovince");
		
		int provinceId = Integer.parseInt(provinceIdstr);
		
		Student student = new Student();
		
		student.setStudentName(studentName);
		student.setProvinceId(provinceId);
		
		boolean kt = HomeDAO.InsertStudent(conn, student);
		
		if(kt) {
			request.setAttribute("msgInsertStudent","Insert Success!");
			
			List<Province> list = HomeDAO.DisplayProvince(conn);
			
			request.setAttribute("listProvince", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("msgInsertStudent","Insert Failed!");
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Home.jsp");
			rd.forward(request, response);
		}
	}

}
