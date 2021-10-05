package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Cman;
import kr.ac.kopo.rural.util.Pager;

public interface CmanService {

	List<Cman> list(Pager pager);

	void delete(int seq4);

	void add(Cman item);

	Cman item(int seq4);

	void update(Cman item);

	void remove(List<Integer> items);

}
