package cokkiee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SecondHalf
 */
public class SecondHalf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondHalf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		String degree=request.getParameter("degree");
		String yop=request.getParameter("year");
		String univ=request.getParameter("univ");
		
		Cookie[] arr=request.getCookies();
		
		String name="",age="",mobile="";
		//===========================Using Cookies
//		for(Cookie cookie:arr)
//		{
//			switch(cookie.getName())
//			{
//			case "name":name=cookie.getValue();
//				        break;
//			case "age":age=cookie.getValue();
//				       break;
//			case "number":mobile=cookie.getValue();
//				           break;
//			}
//		}
		//==========Using HttpSession with Cookies
		HttpSession hs=request.getSession();
		name=(String) hs.getAttribute("s1");
		age=(String) hs.getAttribute("s2");
		mobile=(String) hs.getAttribute("s3");
		
		pw.println("<html><body style:'background-color:blue; color:cyan><center>");
		pw.println("<h2>Your Details Are:</h2>");
		pw.println("Name: "+name+"<br>");
		pw.println("Age: "+age+"<br>");
		pw.println("Number: "+mobile+"<br>");
		pw.println("Degree: "+degree+"<br>");
		pw.println("Year of Pass: "+yop+"<br>");
		pw.println("University: "+ univ +"<br>");
		pw.println("</center></body></html>");
		
		
		
		
		
	}

}
