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
public class OrdersController {
@Autowired
OrdersDao dao;
Logger log=Logger.getAnonymousLogger();
@RequestMapping("addorder")
public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
	String addressline1=req.getParameter("addline1");
	String addressline2=req.getParameter("addline2");
	String city=req.getParameter("city");
	String pincode=req.getParameter("pincode");
	String phoneno=req.getParameter("phoneno");
	log.info("recieved details from front end");
	ModelAndView mv=new ModelAndView();
	log.info("mv object created");
	Orders o=new Orders();
	o.setAddressline1(addressline1);
	o.setAddressline2(addressline2);
	o.setCity(city);
	o.setPhoneno(phoneno);
	o.setPincode(pincode);
	log.info("details are set to the pojo");
	Orders od=dao.insert(o);
	log.info("insert method successfully called");
	if(od!=null) {
		log.info("successfull insertion");
		mv.setViewName("addsuccess.jsp");
	}
	return mv;	
}

@RequestMapping("getallorders")
public ModelAndView vieworders(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	log.info("mv object created");
	List<Orders> list=dao.getall();
	log.info("getall method called");
	mv.setViewName("vieworders.jsp");
	log.info("went to jsp");
	mv.addObject("list", list);
	log.info("sent a list to the jsp");
	return mv;
}


}
