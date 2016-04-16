package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import entity.User;

public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String path="";

		String email=request.getParameter("email");
		String password=request.getParameter("password");

		HttpSession session=request.getSession();

		try{
			UserDAO udao = new UserDAO();
			email=new String(email.getBytes("ISO-8859-1"),"utf-8");
			password=new String(password.getBytes("ISO-8859-1"),"utf-8");
		    User user = udao.login(email);
			if(user != null && user.getPassword().equals(password)){
				request.setAttribute("user", user);

				session.setAttribute("username", user.getUsername());
				session.setAttribute("user_state","login");

				path="myIndexServlet";

			}
			else{
				request.setAttribute("user", null);
				
				path="welcomeServlet";


			}
		}catch (Exception e){
			e.printStackTrace();
		}

		request.getRequestDispatcher(path).forward(request,response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
}
