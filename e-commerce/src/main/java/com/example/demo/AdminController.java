package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
@Autowired
AdminDao dao;

Logger log=Logger.getAnonymousLogger();
@RequestMapping("adminlogin")
public ModelAndView login(HttpServletRequest req,HttpServletResponse res) {
    String name=req.getParameter("name");
    String password=req.getParameter("password");
    
	ModelAndView mv=new ModelAndView();
	if(dao.findbynameandpassword(name, password)!=null) {
	mv.setViewName("dashboard.jsp");
	}
	else {
		mv.setViewName("adminloginerror.jsp");
	}
	return mv;	
}
@RequestMapping("changepw")
public ModelAndView updatepassword(HttpServletRequest req,HttpServletResponse res) {
	 String password=req.getParameter("password");
	 String password2=req.getParameter("password2");
	 ModelAndView mv=new ModelAndView();
	 Admin a=new Admin();
	 if(password.equals(password2)) {
		 a.setPassword(password);
		dao.update(a);
		mv.setViewName("pwsuccess.jsp");
	 }
	 else {
		 mv.setViewName("pwerror.jsp");
	 }
	return mv;
}
}
