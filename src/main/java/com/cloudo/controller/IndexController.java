package com.cloudo.controller;

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
	
	@RequestMapping("coach.hj")
	public String getCoachInfo(Model model, HttpServletRequest request){
		
		return "index-coach";
	
	}
	
	@RequestMapping("customeDetail.hj")
	public String getCustomeDetailPage(Model model, HttpServletRequest request){
		
		return "index-mydetailinfo";
	
	}
	
	@RequestMapping("custome.hj")
	public String getCustomePage(Model model, HttpServletRequest request){
		
		return "index-myinfo";
	
	}
	
	@RequestMapping("reservation.hj")
	public String getCustomeResverPage(Model model, HttpServletRequest request){
		
		return "index-reservation";
	
	}
	
	
}
