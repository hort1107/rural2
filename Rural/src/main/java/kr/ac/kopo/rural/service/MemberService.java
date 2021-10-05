package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Member;
import kr.ac.kopo.rural.util.Pager;

public interface MemberService {

	List<Member> list(Pager pager);

	void delete(String id);

	void add(Member item);

	Member item(String id);

	void update(Member item);

	boolean checkId(String id);

	void remove(List<String> items);
}
