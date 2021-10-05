package kr.ac.kopo.rural.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.ac.kopo.rural.model.Ocrop;
import kr.ac.kopo.rural.service.OcropService;
import kr.ac.kopo.rural.util.Pager;



@Controller
@RequestMapping("/ocrop")
public class OcropController {
final String path = "ocrop/";
final private String uploadpath = "d://upload/";

	@Autowired
	OcropService service;
	
	@RequestMapping("/list")
	String list(Model model, Pager pager) {
		List<Ocrop> list = service.list(pager);
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
	@RequestMapping("/delete")
	String delete(int seq2) {
		service.delete(seq2);
		
		return "redirect:list";
				
	}
	@RequestMapping("/remove")
	   public String remove(@RequestParam List<Integer> items) {
	      service.remove(items);
	      
	      for(Integer item : items) {
	      }
	      
	      return "redirect:list";
	   }
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	String add() {
		return path + "add";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	String add(Ocrop item) {
		if(upload(item.getUploadFile())) {
	         item.setImage(item.getUploadFile().getOriginalFilename());
	         service.add(item);
	      }
		return "redirect:list";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	String update(int seq2, Model model) {
		Ocrop item = service.item(seq2);
		
		model.addAttribute("item", item);
		
		return path + "update";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	String update(Ocrop item) {
		if (upload(item.getUploadFile())) {
	         item.setImage(item.getUploadFile().getOriginalFilename());
	         service.update(item);
	  } 
	      return "redirect:list";
}
	private boolean upload(MultipartFile file) {
	      if (file != null && !file.isEmpty()) {

	         String filename = file.getOriginalFilename();

	         try {
	            file.transferTo(new File(uploadpath + filename));
	            
	            return true;
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }

	      return false;
	   }
}

