package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Rdam;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class RdamDaoImpl implements RdamDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Rdam> list(Pager pager) {
		return sql.selectList("rdam.list", pager);
	}

	@Override
	public void delete(int seq9) {
		sql.delete("rdam.delete", seq9);
	}

	@Override
	public void add(Rdam item) {
		sql.insert("rdam.add", item);
	}

	@Override
	public Rdam item(int seq9) {
		return sql.selectOne("rdam.item", seq9);
	}

	@Override
	public void update(Rdam item) {
		sql.update("rdam.update", item);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("rdam.total", pager);
	}
}
