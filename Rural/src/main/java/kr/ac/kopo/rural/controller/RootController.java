package kr.ac.kopo.rural.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.rural.model.Member;
import kr.ac.kopo.rural.service.MemberService;

@Controller
public class RootController {
	
	 @Autowired
	 MemberService service;
	
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
		}
	@ResponseBody //jsp 찾지마
	   @RequestMapping("/checkId")
	   public String checkId(String id) {
		   if(service.checkId(id))
			   return "OK";
		   else
			   return "FAIL";
	   }
	   
	   @GetMapping("/signup")
	   public String signup() {
	      return "signup";
	   }
	   
	   @PostMapping("/signup")
	   public String signup(Member item) {
	      service.add(item);
	      
	      return "redirect:.";
	   }
	   @GetMapping("/login")
	   public String login() {
		   return "login";
	   }
	   
	   @PostMapping("/login")
	   public String login(Member item, HttpSession session) {
		   Member member = service.item(item.getId());
		   if(member != null) {
			   String id = member.getId();
			   String passwd = member.getPasswd();
				   
				   if(id.equals(item.getId()) && passwd.equals(item.getPasswd()) ) {
					   session.setAttribute("member", member);
					   
					   return "redirect:.";
				   }
				   return "redirect:login";
		   }
		   	return "redirect:login";
		   			
	   }
	   @GetMapping("/logout")
	   public String logout(HttpSession session) {
		   session.invalidate();
		   
		   return "redirect:.";
	   }
	}