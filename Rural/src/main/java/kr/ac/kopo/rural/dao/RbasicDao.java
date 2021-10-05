package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Rbasic;
import kr.ac.kopo.rural.util.Pager;

public interface RbasicDao {

	List<Rbasic> list(Pager pager);

	void delete(String cul);

	void add(Rbasic item);

	Rbasic item(String cul);

	void update(Rbasic item);
	
	int total(Pager pager);

}
