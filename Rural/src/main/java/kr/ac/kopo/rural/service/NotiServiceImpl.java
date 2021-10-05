package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.NotiDao;
import kr.ac.kopo.rural.model.Noti;
import kr.ac.kopo.rural.util.Pager;

@Service
public class NotiServiceImpl implements NotiService {

	@Autowired
	NotiDao dao;
	
	
	@Override
	public List<Noti> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq13) {
		dao.delete(seq13);
	}

	@Override
	public void add(Noti item) {
		dao.add(item);
	}

	@Override
	public Noti item(int seq13) {
		return dao.item(seq13);
	}

	@Override
	public void update(Noti item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
