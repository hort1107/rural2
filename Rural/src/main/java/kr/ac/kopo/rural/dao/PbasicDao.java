package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Pbasic;
import kr.ac.kopo.rural.util.Pager;

public interface PbasicDao {

	List<Pbasic> list(Pager pager);

	void delete(String cul);

	void add(Pbasic item);

	Pbasic item(String cul);

	void update(Pbasic item);
	
	int total(Pager pager);

}
