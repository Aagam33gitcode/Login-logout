package mypackage;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import mypackage.dao.*;




/**
 * Servlet implementation class loginservlet
 */
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private static UserDao userDao = new UserdaoImp1();
		
	
	
 
		
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		String username=request.getParameter("username");
		String password=request.getParameter("password");

		
		if(userDao.isvalidUser(username, password)) {
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
		
			response.sendRedirect("welcome.jsp");
			
			
		}
//		if(username.equals("Aagamjain")) {
//			
//			response.sendRedirect("welcome.jsp");
//			System.out.println("not opening");
//			
//		}
//	

	else {
			response.sendRedirect("login.jsp?error=1");
			System.out.println("error");
			
		}
}}