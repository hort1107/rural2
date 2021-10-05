package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Pdam;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class PdamDaoImpl implements PdamDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Pdam> list(Pager pager) {
		return sql.selectList("pdam.list", pager);
	}

	@Override
	public void delete(int seq12) {
		sql.delete("pdam.delete", seq12);
	}

	@Override
	public void add(Pdam item) {
		sql.insert("pdam.add", item);
	}

	@Override
	public Pdam item(int seq12) {
		return sql.selectOne("pdam.item", seq12);
	}

	@Override
	public void update(Pdam item) {
		sql.update("pdam.update", item);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("pdam.total", pager);
	}
}
