package cokkiee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class FirstHalf
 */
public class FirstHalf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstHalf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String mobile=request.getParameter("number");
		//===========================Using Cookies
//		if(name!=null)
//		{
//		Cookie name1=new Cookie("name",name);
//		response.addCookie(name1);
//		}
//		if(age!=null)
//		{
//		Cookie age1=new Cookie("age",age);
//		response.addCookie(age1);
//		}
//		if(mobile!=null)
//		{
//		Cookie mobile1=new Cookie("number",mobile);
//		response.addCookie(mobile1);
//		}
		//==========Using HttpSession with Cookies
		HttpSession hs=request.getSession();
		hs.setAttribute("s1", name);
		hs.setAttribute("s2", age);
		hs.setAttribute("s3", mobile);
		
		
		
	   //response.sendRedirect("halfTwo.html");
		request.getRequestDispatcher("halfTwo.html").forward(request, response);
		
		
		
	}

}
