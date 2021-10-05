package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.OcropDao;
import kr.ac.kopo.rural.model.Ocrop;
import kr.ac.kopo.rural.util.Pager;

@Service
public class OcropServiceImpl implements OcropService {

	@Autowired
	OcropDao dao;
	
	
	@Override
	public List<Ocrop> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq2) {
		dao.delete(seq2);
	}

	@Override
	public void add(Ocrop item) {
		dao.add(item);
	}

	@Override
	public Ocrop item(int seq2) {
		return dao.item(seq2);
	}

	@Override
	public void update(Ocrop item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
