package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	
@Autowired
UserDao dao;

Logger log=Logger.getAnonymousLogger();

@RequestMapping("register")
public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	log.info("recieved name,email and pw from front end");
	ModelAndView mv=new ModelAndView();
	log.info("model and view object created");
	User u =new User();
	log.info("pojo object created");
	u.setUsername(name);
	log.info("name is set to the pojo");
	u.setEmail(email);
	log.info("email is set to the pojo");
	u.setPassword(password);
	log.info("pw is set to the pojo");
	
	User us=dao.insert(u);
	log.info("insert method called successfully");
	if(us!=null) {
		log.info("sucessful user insertion");
		
		mv.setViewName("userlogin.jsp");
	}	
	return mv;	
}

@RequestMapping("displayusers")
public ModelAndView getuserlist(HttpServletRequest req,HttpServletResponse res) {
	log.info("in get all request");
	ModelAndView mv=new ModelAndView();
	log.info("created mv object");
	List<User> list=dao.getall();
	log.info("called getall method");
	mv.setViewName("displayusers.jsp");
	log.info("went to jsp");
	mv.addObject("list",list);
	log.info("sent a list to the jsp");
	return mv;
}

@RequestMapping("userlogin")
public ModelAndView login(HttpServletRequest req,HttpServletResponse res) {
    String username=req.getParameter("name");
    String password=req.getParameter("password");
    log.info("received details from front end");
   
	ModelAndView mv=new ModelAndView();
	log.info("mv object created");
	if(dao.findbynameandpassword(username, password)!=null) {
		log.info("name and pw matches");

	mv.setViewName("userloginsuccess.jsp");

	}
	else {
		log.info("no data found");
		mv.setViewName("userloginerror.jsp");
	}
	return mv;
	
}
}
