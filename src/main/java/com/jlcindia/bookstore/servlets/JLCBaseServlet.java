package com.jlcindia.bookstore.servlets; 

import javax.servlet.http.HttpServlet; 



import com.jlcindia.bookstore.controllers.ChangePWController;
import com.jlcindia.bookstore.controllers.EditProfileController;
import com.jlcindia.bookstore.controllers.ForgotPWController;
import com.jlcindia.bookstore.controllers.JLCBaseController;
import com.jlcindia.bookstore.controllers.LoginController; 
import com.jlcindia.bookstore.controllers.LogoutController; 
import com.jlcindia.bookstore.controllers.RegisterController; 
import com.jlcindia.bookstore.controllers.UpdateProfileController; 

public abstract  class JLCBaseServlet extends HttpServlet { 
	  
	 static LoginController  loginController; 
	 static RegisterController  registerController; 
	 static ChangePWController  changePWController; 
	 static ForgotPWController  forgotPWController; 
	 static UpdateProfileController  updateProfileController;
	 static EditProfileController editProfileController;
	 static LogoutController  logoutController; 
	 
	 
	 static { 
	  loginController = new LoginController(); 
	  registerController = new RegisterController(); 
	  changePWController = new ChangePWController(); 
	  forgotPWController = new ForgotPWController(); 
	  updateProfileController = new UpdateProfileController(); 
	  editProfileController=new EditProfileController();
	  logoutController = new LogoutController();
	 } 
	} 