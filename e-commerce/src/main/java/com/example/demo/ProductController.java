package com.example.demo;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ProductController {
@Autowired 
ProductDao dao;
Logger log=Logger.getAnonymousLogger();
//Add product
@RequestMapping("addproduct")
public ModelAndView insert(HttpServletRequest req,HttpServletResponse res) {
	String name=req.getParameter("name");
	String size=req.getParameter("size");
	
	String category=req.getParameter("category");
	String price=req.getParameter("price");
	ModelAndView mv=new ModelAndView();
	Product p=new Product();
	p.setName(name);
	p.setSize(size);
	p.setCategory(category);
	p.setPrice(price);
	Product pr=dao.insert(p);
	if(pr!=null) {
		mv.setViewName("addproductsuccess.jsp");
	}
	return mv;
}

//Display products
@RequestMapping("displayproduct")
public ModelAndView getall(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	List<Product>list=dao.getall();
	mv.setViewName("displayproduct.jsp");
	mv.addObject("list", list);
	return mv;
}

//Display products
@RequestMapping("displayproductuser")
public ModelAndView getallproducts(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	List<Product>list=dao.getall();
	mv.setViewName("displayproductuser.jsp");
	mv.addObject("list", list);
	return mv;
}

//Search product by name
@RequestMapping("searchproduct")
public ModelAndView findbyname(HttpServletRequest req,HttpServletResponse res) {
	String name=req.getParameter("name");
	ModelAndView mv=new ModelAndView();
	List<Product>list=dao.getByName(name);
	if(list!=null) {
	mv.setViewName("displayproductbyname.jsp");
	mv.addObject("list", list);
	}
	return mv;
}	
//search by category
@RequestMapping("findbycategory")
public ModelAndView findbycategory(HttpServletRequest req,HttpServletResponse res) {
	String category=req.getParameter("category");
	ModelAndView mv=new ModelAndView();
	List<Product>list=dao.getByName(category);
	if(list!=null) {
	mv.setViewName("showcategory.jsp");
	mv.addObject("list", list);
	}
	return mv;
}	
//delete product by id
@DeleteMapping
public ModelAndView deletebyid(HttpServletRequest req,HttpServletResponse res) {	
	ModelAndView mv=new ModelAndView();
	Product p=new Product();
	dao.deleteByid(p.getCode());
	mv.setViewName("displayproduct.jsp");
	return mv;
}

}