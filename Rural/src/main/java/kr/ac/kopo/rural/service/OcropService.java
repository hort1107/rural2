package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Ocrop;
import kr.ac.kopo.rural.util.Pager;

public interface OcropService {

	List<Ocrop> list(Pager pager);

	void delete(int seq2);

	void add(Ocrop item);

	Ocrop item(int seq2);

	void update(Ocrop item);

	void remove(List<Integer> items);

}
