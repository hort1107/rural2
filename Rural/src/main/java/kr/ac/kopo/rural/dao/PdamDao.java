package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Pdam;
import kr.ac.kopo.rural.util.Pager;

public interface PdamDao {

	List<Pdam> list(Pager pager);

	void delete(int seq12);

	void add(Pdam item);

	Pdam item(int seq12);

	void update(Pdam item);

	int total(Pager pager);
}
