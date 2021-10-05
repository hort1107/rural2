package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.PdamDao;
import kr.ac.kopo.rural.model.Pdam;
import kr.ac.kopo.rural.util.Pager;

@Service
public class PdamServiceImpl implements PdamService {

	@Autowired
	PdamDao dao;
	
	
	@Override
	public List<Pdam> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq12) {
		dao.delete(seq12);
	}

	@Override
	public void add(Pdam item) {
		dao.add(item);
	}

	@Override
	public Pdam item(int seq12) {
		return dao.item(seq12);
	}

	@Override
	public void update(Pdam item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
