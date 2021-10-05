package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Pman;
import kr.ac.kopo.rural.util.Pager;

public interface PmanService {

	List<Pman> list(Pager pager);

	void delete(int seq10);

	void add(Pman item);

	Pman item(int seq10);

	void update(Pman item);

	void remove(List<Integer> items);

}
