package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Ccrop;
import kr.ac.kopo.rural.util.Pager;

public interface CcropDao {

	List<Ccrop> list(Pager pager);

	void delete(int seq5);

	void add(Ccrop item);

	Ccrop item(int seq5);

	void update(Ccrop item);
	
	int total(Pager pager);

}
