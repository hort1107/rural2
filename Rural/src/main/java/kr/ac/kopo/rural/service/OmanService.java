package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Oman;
import kr.ac.kopo.rural.util.Pager;

public interface OmanService {

	List<Oman> list(Pager pager);

	void delete(int seq);

	void add(Oman item);

	Oman item(int seq);

	void update(Oman item);

	void remove(List<Integer> items);

}
