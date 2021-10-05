package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.CamDao;
import kr.ac.kopo.rural.model.Cam;
import kr.ac.kopo.rural.util.Pager;

@Service
public class CamServiceImpl implements CamService {

	@Autowired
	CamDao dao;
	
	
	@Override
	public List<Cam> list() {
		return dao.list();
	}

	@Override
	public void delete(String dep) {
		dao.delete(dep);
	}

	@Override
	public void add(Cam item) {
		dao.add(item);
	}

	@Override
	public Cam item(String dep) {
		return dao.item(dep);
	}

	@Override
	public void update(Cam item) {
		dao.update(item);
	}

	@Override
	public List<Cam> list(Pager pager) {
		int total = dao.total(pager);
		
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void remove(@RequestParam("items") List<String> items) {
		 for(String item :items) {
	         dao.delete(item);
	      }
	}

}
