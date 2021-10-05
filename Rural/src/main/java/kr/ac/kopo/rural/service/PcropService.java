package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Pcrop;
import kr.ac.kopo.rural.util.Pager;

public interface PcropService {

	List<Pcrop> list(Pager pager);

	void delete(int seq11);

	void add(Pcrop item);

	Pcrop item(int seq11);

	void update(Pcrop item);

	void remove(List<Integer> items);

}
