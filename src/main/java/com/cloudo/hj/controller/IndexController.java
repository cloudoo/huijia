package com.cloudo.hj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

	
	@RequestMapping("/")
	public String index(Model model, HttpServletRequest request) {
	
		return "redirect:/index.hj";
	}
	
	@RequestMapping("index.hj")
	public String mainIndex(Model model, HttpServletRequest request){
		
		return "index";
	
	}

}
