package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Cman;
import kr.ac.kopo.rural.util.Pager;

public interface CmanDao {

	List<Cman> list(Pager pager);

	void delete(int seq4);

	void add(Cman item);

	Cman item(int seq4);

	void update(Cman item);

	int total(Pager pager);

}
