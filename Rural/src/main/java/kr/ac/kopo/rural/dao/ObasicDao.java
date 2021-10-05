package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Obasic;
import kr.ac.kopo.rural.util.Pager;

public interface ObasicDao {

	List<Obasic> list(Pager pager);

	void delete(String cul);

	void add(Obasic item);

	Obasic item(String cul);

	void update(Obasic item);
	
	int total(Pager pager);

}
