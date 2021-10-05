package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.PmanDao;
import kr.ac.kopo.rural.model.Pman;
import kr.ac.kopo.rural.util.Pager;

@Service
public class PmanServiceImpl implements PmanService {

	@Autowired
	PmanDao dao;
	
	
	@Override
	public List<Pman> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq10) {
		dao.delete(seq10);
	}

	@Override
	public void add(Pman item) {
		dao.add(item);
	}

	@Override
	public Pman item(int seq10) {
		return dao.item(seq10);
	}

	@Override
	public void update(Pman item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
