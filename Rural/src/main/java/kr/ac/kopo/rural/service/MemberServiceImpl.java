package kr.ac.kopo.rural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.kopo.rural.dao.MemberDao;
import kr.ac.kopo.rural.model.Member;
import kr.ac.kopo.rural.util.Pager;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao dao;
	
	
	@Override
	public List<Member> list(Pager pager) {
		int total = dao.total(pager);
		   
		pager.setTotal((float) total);
		
		return dao.list(pager);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);
	}

	@Override
	public void add(Member item) {
		dao.add(item);
	}

	@Override
	public Member item(String id) {
		return dao.item(id);
	}

	@Override
	public void update(Member item) {
		dao.update(item);
	}

	@Override
	public boolean checkId(String id) {
		if (dao.checkId(id) > 0) // 0보다 크다는 건 입력이 됐다는 것
			return false;
		else
			return true;
	}

	@Override
	public void remove(@RequestParam("items") List<String> items) {
		 for(String item :items) {
	         dao.delete(item);
	      }
	}

}
