package kr.ac.kopo.rural.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.model.Member;
import kr.ac.kopo.rural.service.MemberService;
import kr.ac.kopo.rural.util.Pager;

@Controller
@RequestMapping("/member")
public class MemberController {
final String path = "member/";
	
	@Autowired
	MemberService service;
	
	@RequestMapping({"", "/", "/list"})
	String list(Model model, Pager pager) {
		List<Member> list = service.list(pager);
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	@RequestMapping("/delete")
	String delete(String id) {
		service.delete(id);
		
		return "redirect:list";
				
	}
	 @RequestMapping("/remove")
	   public String remove(@RequestParam  List<String> items) {
	      service.remove(items);
	      
	      for(String item : items) {

	      }
	      
	      return "redirect:list";
	   }
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	String add() {
		return path + "add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	String add(Member item) {
		service.add(item);
		
		return "redirect:list";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	String update(String id, Model model) {
		Member item = service.item(id);
		
		model.addAttribute("item", item);
		
		return path + "update";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	String update(Member item) {
		service.update(item);
		
		return "redirect:list";
	}
}

