package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Cdam;
import kr.ac.kopo.rural.util.Pager;

public interface CdamDao {

	List<Cdam> list(Pager pager);

	void delete(int seq6);

	void add(Cdam item);

	Cdam item(int seq6);

	void update(Cdam item);

	int total(Pager pager);
}
