package com.example.demo;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderdetailsController {
	@Autowired
OrderdetailsDao dao;
	
	@RequestMapping("view orderdetails")
	public ModelAndView vieworderdetails(HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		List<Orderdetails>list=dao.getall();
		mv.setViewName("orderdetails.jsp");
		mv.addObject("list", list);
		return mv;
		
	}
}
