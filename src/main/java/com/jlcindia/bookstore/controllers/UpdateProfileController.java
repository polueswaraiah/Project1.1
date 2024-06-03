package com.jlcindia.bookstore.controllers; 
 
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.*; 

import com.jlcindia.bookstore.to.UserTO; 

public class UpdateProfileController  extends JLCBaseController{ 
public String process(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{ 
	System.out.println("UpdateProfileController-process()"); 
 String page=""; 
  
 String userId=req.getParameter("userId"); 
 String fullName=req.getParameter("fullName"); 
 String email=req.getParameter("email"); 
 String phone=req.getParameter("phone"); 
 String username=req.getParameter("username"); 
 String password=req.getParameter("password");
 
 UserTO userTO=new UserTO(); 
 userTO.setUserId(Integer.parseInt(userId)); 
 userTO.setFullName(fullName); 
 userTO.setEmail(email); 
 userTO.setPhone(Long.parseLong(phone)); 
 userTO.setUsername(username); 
  
  int updateStatus = userService.updateProfile(userTO); 
   
  if(updateStatus==1) { 
   page="updateProfileStatus.jsp"; 
   String upMsg="Your Profile is updated Successfully"; 
   req.setAttribute("UpdateMsg", upMsg); 
  }else { 
   page="updateProfile.jsp"; 
   String upMsg="Something Wrong, Try again"; 
   req.setAttribute("UpdateMsg", upMsg); 
  } 
 return page; 
}  
}