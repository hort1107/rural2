package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.UsDao;
import kr.ac.kopo.rural.model.Us;
import kr.ac.kopo.rural.util.Pager;

@Service
public class UsServiceImpl implements UsService {

	@Autowired
	UsDao dao;
	
	
	@Override
	public List<Us> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq14) {
		dao.delete(seq14);
	}

	@Override
	public void add(Us item) {
		dao.add(item);
	}

	@Override
	public Us item(int seq14) {
		return dao.item(seq14);
	}

	@Override
	public void update(Us item) {
		dao.update(item);
	}

	@Override
	 public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
