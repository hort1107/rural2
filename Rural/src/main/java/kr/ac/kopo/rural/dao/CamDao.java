package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Cam;
import kr.ac.kopo.rural.util.Pager;

public interface CamDao {

	List<Cam> list();

	void delete(String dep);

	void add(Cam item);

	Cam item(String dep);

	void update(Cam item);

	int total(Pager pager);

	List<Cam> list(Pager pager);

}
