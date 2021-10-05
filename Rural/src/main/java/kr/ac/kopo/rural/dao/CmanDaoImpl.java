package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Cman;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class CmanDaoImpl implements CmanDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Cman> list(Pager pager) {
		return sql.selectList("cman.list", pager);
	}

	@Override
	public void delete(int seq4) {
		sql.delete("cman.delete", seq4);
	}

	@Override
	public void add(Cman item) {
		sql.insert("cman.add", item);
	}

	@Override
	public Cman item(int seq4) {
		return sql.selectOne("cman.item", seq4);
	}

	@Override
	public void update(Cman item) {
		sql.update("cman.update", item);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("cman.total", pager);
	}
}
