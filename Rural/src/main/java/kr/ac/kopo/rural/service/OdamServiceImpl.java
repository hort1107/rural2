package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.OdamDao;
import kr.ac.kopo.rural.model.Odam;
import kr.ac.kopo.rural.util.Pager;

@Service
public class OdamServiceImpl implements OdamService {

	@Autowired
	OdamDao dao;
	
	
	@Override
	public List<Odam> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq3) {
		dao.delete(seq3);
	}

	@Override
	public void add(Odam item) {
		dao.add(item);
	}

	@Override
	public Odam item(int seq3) {
		return dao.item(seq3);
	}

	@Override
	public void update(Odam item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
