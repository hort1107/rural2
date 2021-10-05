package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.CmanDao;
import kr.ac.kopo.rural.model.Cman;
import kr.ac.kopo.rural.util.Pager;

@Service
public class CmanServiceImpl implements CmanService {

	@Autowired
	CmanDao dao;
	
	
	@Override
	public List<Cman> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq4) {
		dao.delete(seq4);
	}

	@Override
	public void add(Cman item) {
		dao.add(item);
	}

	@Override
	public Cman item(int seq4) {
		return dao.item(seq4);
	}

	@Override
	public void update(Cman item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
