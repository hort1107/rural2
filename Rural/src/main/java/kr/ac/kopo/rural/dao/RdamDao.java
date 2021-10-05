package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Rdam;
import kr.ac.kopo.rural.util.Pager;

public interface RdamDao {

	List<Rdam> list(Pager pager);

	void delete(int seq9);

	void add(Rdam item);

	Rdam item(int seq9);

	void update(Rdam item);

	int total(Pager pager);
}
