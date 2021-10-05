package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Pman;
import kr.ac.kopo.rural.util.Pager;

public interface PmanDao {

	List<Pman> list(Pager pager);

	void delete(int seq10);

	void add(Pman item);

	Pman item(int seq10);

	void update(Pman item);

	int total(Pager pager);
}
