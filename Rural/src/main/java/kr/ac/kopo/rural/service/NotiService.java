package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Noti;
import kr.ac.kopo.rural.util.Pager;

public interface NotiService {

	List<Noti> list(Pager pager);

	void delete(int seq13);

	void add(Noti item);

	Noti item(int seq13);

	void update(Noti item);

	void remove(List<Integer> items);

}
