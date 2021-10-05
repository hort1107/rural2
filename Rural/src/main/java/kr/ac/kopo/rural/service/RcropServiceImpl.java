package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.RcropDao;
import kr.ac.kopo.rural.model.Rcrop;
import kr.ac.kopo.rural.util.Pager;

@Service
public class RcropServiceImpl implements RcropService {

	@Autowired
	RcropDao dao;
	
	
	@Override
	public List<Rcrop> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq8) {
		dao.delete(seq8);
	}

	@Override
	public void add(Rcrop item) {
		dao.add(item);
	}

	@Override
	public Rcrop item(int seq8) {
		return dao.item(seq8);
	}

	@Override
	public void update(Rcrop item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}
}
