package com.cloudo.hj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coacher")
public class CoacherController {

	@RequestMapping("/list.hj")
	public String listInfo(Model model, HttpServletRequest request){
		
		
		return "coachlist";
	
	}
}
