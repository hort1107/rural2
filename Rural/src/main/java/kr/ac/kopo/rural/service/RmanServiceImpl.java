package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.RmanDao;
import kr.ac.kopo.rural.model.Rman;
import kr.ac.kopo.rural.util.Pager;

@Service
public class RmanServiceImpl implements RmanService {

	@Autowired
	RmanDao dao;
	
	
	@Override
	public List<Rman> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq7) {
		dao.delete(seq7);
	}

	@Override
	public void add(Rman item) {
		dao.add(item);
	}

	@Override
	public Rman item(int seq7) {
		return dao.item(seq7);
	}

	@Override
	public void update(Rman item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
