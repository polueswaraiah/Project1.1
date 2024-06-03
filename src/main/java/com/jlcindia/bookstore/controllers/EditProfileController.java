package com.jlcindia.bookstore.controllers; 
 
import java.io.IOException;

import javax.servlet.http.*; 
import com.jlcindia.bookstore.to.UserTO; 
 
public class EditProfileController  extends JLCBaseController{ 
public String process(HttpServletRequest req,HttpServletResponse res)throws IOException{ 
     System.out.println("EditProfileController-process()"); 
     String page=""; 
     HttpSession session=req.getSession(false); 
     if(session==null) { 
    	 String msg="Session Expired. Login Again"; 
         req.setAttribute("LoginMsg", msg); 
         page="login.jsp"; 
         }else { 
        	 UserTO userTO=(UserTO)session.getAttribute("MyUserInfo"); 
        	 int userId=userTO.getUserId(); 
        	  UserTO myuserTO=userService.getUserByUserId(userId); 
        	  session.setAttribute("MyUserInfo", myuserTO); 
        	  page="updateProfile.jsp"; 
        	  } 
     return page; 
     }

} 
