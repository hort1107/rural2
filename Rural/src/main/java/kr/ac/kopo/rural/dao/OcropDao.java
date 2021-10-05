package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Ocrop;
import kr.ac.kopo.rural.util.Pager;

public interface OcropDao {

	List<Ocrop> list(Pager pager);

	void delete(int seq2);

	void add(Ocrop item);

	Ocrop item(int seq2);

	void update(Ocrop item);
	
	int total(Pager pager);

}
