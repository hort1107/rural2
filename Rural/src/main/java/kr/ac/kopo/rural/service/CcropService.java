package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Ccrop;
import kr.ac.kopo.rural.util.Pager;

public interface CcropService {

	List<Ccrop> list(Pager pager);

	void delete(int seq5);

	void add(Ccrop item);

	Ccrop item(int seq5);

	void update(Ccrop item);

	void remove(List<Integer> items);

}
