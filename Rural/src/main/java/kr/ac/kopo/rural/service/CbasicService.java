package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Cbasic;
import kr.ac.kopo.rural.util.Pager;

public interface CbasicService {

	List<Cbasic> list(Pager pager);

	void delete(String cul);

	void add(Cbasic item);

	Cbasic item(String cul);

	void update(Cbasic item);

	void remove(List<String> items);


}
