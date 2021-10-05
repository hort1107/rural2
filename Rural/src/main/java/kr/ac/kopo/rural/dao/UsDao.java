package kr.ac.kopo.rural.dao;

import java.util.List;

import kr.ac.kopo.rural.model.Us;
import kr.ac.kopo.rural.util.Pager;

public interface UsDao {

	List<Us> list(Pager pager);

	void delete(int seq14);

	void add(Us item);

	Us item(int seq14);

	void update(Us item);

	int total(Pager pager);
}
