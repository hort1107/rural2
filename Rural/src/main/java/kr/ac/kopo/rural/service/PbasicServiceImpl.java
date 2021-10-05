package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.PbasicDao;
import kr.ac.kopo.rural.model.Pbasic;
import kr.ac.kopo.rural.util.Pager;

@Service
public class PbasicServiceImpl implements PbasicService {

	@Autowired
	PbasicDao dao;
	
	
	@Override
	public List<Pbasic> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(String cul) {
		dao.delete(cul);
	}

	@Override
	public void add(Pbasic item) {
		dao.add(item);
	}

	@Override
	public Pbasic item(String cul) {
		return dao.item(cul);
	}

	@Override
	public void update(Pbasic item) {
		dao.update(item);
	}

	@Override
	public void remove(@RequestParam("items") List<String> items) {
		 for(String item :items) {
	         dao.delete(item);
	      }
	}

}
