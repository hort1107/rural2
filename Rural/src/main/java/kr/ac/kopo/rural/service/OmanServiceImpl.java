package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.OmanDao;
import kr.ac.kopo.rural.model.Oman;
import kr.ac.kopo.rural.util.Pager;

@Service
public class OmanServiceImpl implements OmanService {

	@Autowired
	OmanDao dao;
	
	
	@Override
	public List<Oman> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq) {
		dao.delete(seq);
	}

	@Override
	public void add(Oman item) {
		dao.add(item);
	}

	@Override
	public Oman item(int seq) {
		return dao.item(seq);
	}

	@Override
	public void update(Oman item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
