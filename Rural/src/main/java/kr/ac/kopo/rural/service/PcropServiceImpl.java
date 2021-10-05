package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.PcropDao;
import kr.ac.kopo.rural.model.Pcrop;
import kr.ac.kopo.rural.util.Pager;

@Service
public class PcropServiceImpl implements PcropService {

	@Autowired
	PcropDao dao;
	
	
	@Override
	public List<Pcrop> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(int seq11) {
		dao.delete(seq11);
	}

	@Override
	public void add(Pcrop item) {
		dao.add(item);
	}

	@Override
	public Pcrop item(int seq11) {
		return dao.item(seq11);
	}

	@Override
	public void update(Pcrop item) {
		dao.update(item);
	}

	@Override
	   public void remove(@RequestParam("items") List<Integer> items) {
	      for(Integer item :items) {
	         dao.delete(item);
	      }
	}

}
