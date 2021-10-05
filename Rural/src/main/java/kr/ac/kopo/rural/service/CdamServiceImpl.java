package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.CdamDao;
import kr.ac.kopo.rural.model.Cdam;
import kr.ac.kopo.rural.util.Pager;

@Service
public class CdamServiceImpl implements CdamService {

	@Autowired
	CdamDao dao;
	
	
	@Override
	public List<Cdam> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq6) {
		dao.delete(seq6);
	}

	@Override
	public void add(Cdam item) {
		dao.add(item);
	}

	@Override
	public Cdam item(int seq6) {
		return dao.item(seq6);
	}

	@Override
	public void update(Cdam item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
