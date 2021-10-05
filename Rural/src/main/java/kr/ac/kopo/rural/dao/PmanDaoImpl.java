package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Pman;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class PmanDaoImpl implements PmanDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Pman> list(Pager pager) {
		return sql.selectList("pman.list", pager);
	}

	@Override
	public void delete(int seq10) {
		sql.delete("pman.delete", seq10);
	}

	@Override
	public void add(Pman item) {
		sql.insert("pman.add", item);
	}

	@Override
	public Pman item(int seq10) {
		return sql.selectOne("pman.item", seq10);
	}

	@Override
	public void update(Pman item) {
		sql.update("pman.update", item);
	}
	
	@Override
	public int total(Pager pager) {
		return sql.selectOne("pman.total", pager);
	}

}
