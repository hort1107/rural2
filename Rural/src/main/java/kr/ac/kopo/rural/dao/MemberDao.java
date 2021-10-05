package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Member;
import kr.ac.kopo.rural.util.Pager;

public interface MemberDao {

	List<Member> list(Pager pager);

	void delete(String id);

	void add(Member item);

	Member item(String id);

	void update(Member item);

	int checkId(String id);
	
	int total(Pager pager);

}
