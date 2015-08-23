package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoimp.DaoImp;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		if (username == null || password == null) {
			rd = request.getRequestDispatcher("/login.html");
			rd.forward(request, response);
		}else{
			DaoImp di = new DaoImp();
			String lastName = di.selectFirstName(username);
			if(lastName==(null)){
				rd = request.getRequestDispatcher("/login.html");
				rd.forward(request, response);
				
			}else{
				request.getSession().setAttribute("flag", "login_success");
				rd = request.getRequestDispatcher("/index.jsp");
				rd.forward(request, response);
			}
		}
	}

}
