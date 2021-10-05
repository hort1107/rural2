package kr.ac.kopo.rural.service;

import java.util.List;

import kr.ac.kopo.rural.model.Cam;
import kr.ac.kopo.rural.util.Pager;

public interface CamService {

	List<Cam> list();

	void delete(String dep);

	void add(Cam item);

	Cam item(String dep);

	void update(Cam item);

	List<Cam> list(Pager pager);

	void remove(List<String> items);

}
