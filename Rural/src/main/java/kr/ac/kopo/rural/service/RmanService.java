package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Rman;
import kr.ac.kopo.rural.util.Pager;

public interface RmanService {

	List<Rman> list(Pager pager);

	void delete(int seq7);

	void add(Rman item);

	Rman item(int seq7);

	void update(Rman item);

	void remove(List<Integer> items);

}
