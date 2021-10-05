package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Odam;
import kr.ac.kopo.rural.util.Pager;

public interface OdamService {

	List<Odam> list(Pager pager);

	void delete(int seq3);

	void add(Odam item);

	Odam item(int seq3);

	void update(Odam item);

	void remove(List<Integer> items);

}
