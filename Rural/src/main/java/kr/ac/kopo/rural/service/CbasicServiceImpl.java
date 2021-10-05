package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.CbasicDao;
import kr.ac.kopo.rural.model.Cbasic;
import kr.ac.kopo.rural.util.Pager;

@Service
public class CbasicServiceImpl implements CbasicService {

	@Autowired
	CbasicDao dao;
	
	
	@Override
	public List<Cbasic> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(String cul) {
		dao.delete(cul);
	}

	@Override
	public void add(Cbasic item) {
		dao.add(item);
	}

	@Override
	public Cbasic item(String cul) {
		return dao.item(cul);
	}

	@Override
	public void update(Cbasic item) {
		dao.update(item);
	}

	@Override
	public void remove(@RequestParam("items") List<String> items) {
		 for(String item :items) {
	         dao.delete(item);
	      }
	}


}
