package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Rcrop;
import kr.ac.kopo.rural.util.Pager;

public interface RcropDao {

	List<Rcrop> list(Pager pager);

	void delete(int seq8);

	void add(Rcrop item);

	Rcrop item(int seq8);

	void update(Rcrop item);
	
	int total(Pager pager);

}
