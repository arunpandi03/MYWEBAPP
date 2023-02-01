package com.ap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
//@RestController
//@RequestMapping("/api")
public class Sample { 
	@GetMapping("home0")
	public  String home(HttpServletRequest req,HttpServletResponse res) {
	HttpSession session=req.getSession();
		String name = req.getParameter("name"); 
		System.out.println("hello" +name);
		session.setAttribute("name", name);
		return "home";
		
	}
	
	
	
	@GetMapping("home1")
	public ModelAndView  home(@RequestParam("name") String myName,HttpSession session) {
		//System.out.println("hello" +myName);
		//session.setAttribute("name" ,myName);
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home");
		return mv;
}
	
	

}