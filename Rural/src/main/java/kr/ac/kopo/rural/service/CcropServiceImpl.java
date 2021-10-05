package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.CcropDao;
import kr.ac.kopo.rural.model.Ccrop;
import kr.ac.kopo.rural.util.Pager;

@Service
public class CcropServiceImpl implements CcropService {

	@Autowired
	CcropDao dao;
	
	
	@Override
	public List<Ccrop> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq5) {
		dao.delete(seq5);
	}

	@Override
	public void add(Ccrop item) {
		dao.add(item);
	}

	@Override
	public Ccrop item(int seq5) {
		return dao.item(seq5);
	}

	@Override
	public void update(Ccrop item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
