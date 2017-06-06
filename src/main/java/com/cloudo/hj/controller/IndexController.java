package com.cloudo.hj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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

	@RequestMapping("MP_verify_8EMKJBZ8nZaiCLG3.txt")
	@ResponseBody
	public String mainIndex(HttpServletRequest request){

		return "8EMKJBZ8nZaiCLG3";

	}

}
