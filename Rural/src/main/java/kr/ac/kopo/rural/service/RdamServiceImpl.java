package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.RdamDao;
import kr.ac.kopo.rural.model.Rdam;
import kr.ac.kopo.rural.util.Pager;

@Service
public class RdamServiceImpl implements RdamService {

	@Autowired
	RdamDao dao;
	
	
	@Override
	public List<Rdam> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq9) {
		dao.delete(seq9);
	}

	@Override
	public void add(Rdam item) {
		dao.add(item);
	}

	@Override
	public Rdam item(int seq9) {
		return dao.item(seq9);
	}

	@Override
	public void update(Rdam item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
