package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Cbasic;
import kr.ac.kopo.rural.util.Pager;

public interface CbasicDao {

	void delete(String item);

	void add(Cbasic item);

	Cbasic item(String cul);

	void update(Cbasic item);

	int total(Pager pager);

	List<Cbasic> list(Pager pager);




}
