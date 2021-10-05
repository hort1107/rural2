package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Rdam;
import kr.ac.kopo.rural.util.Pager;

public interface RdamService {

	List<Rdam> list(Pager pager);

	void delete(int seq9);

	void add(Rdam item);

	Rdam item(int seq9);

	void update(Rdam item);

	void remove(List<Integer> items);

}
