package mypackage;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypackage.dao.*;

import mypackage.dao.UserdaoImp1;

import java.io.IOException;


/**
 * Servlet implementation class registerservlet
 */
public class registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao=new UserdaoImp1() ;
		
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gmail = request.getParameter("email");
        User user=new User();
        
        user.setUsername(username);
		user.setEmail(gmail);


		user.setPassword(password);

if(userDao.addUser(user)) {
	response.sendRedirect("login.jsp?registration=success");
	
}else {
	response.sendRedirect("register.jsp?error=1");
}

		

	}

}
