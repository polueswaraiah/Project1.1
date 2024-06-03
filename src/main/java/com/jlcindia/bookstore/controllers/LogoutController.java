package com.jlcindia.bookstore.controllers; 
 
import java.io.IOException; 

 
import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession;

import com.jlcindia.bookstore.servlets.JLCBaseServlet; 
 

public class LogoutController extends JLCBaseController { 
	public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("LogoutServlet-service()"); 
        String page = "login.jsp"; 
        HttpSession session = req.getSession(false); 
        if (session != null) 
        session.invalidate(); 
 
        String logoutMsg = "You have logged out Successfully"; 
        req.setAttribute("LogoutMsg", logoutMsg); 
        return page;
}


} 

  