package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Odam;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class OdamDaoImpl implements OdamDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Odam> list(Pager pager) {
		return sql.selectList("odam.list", pager);
	}

	@Override
	public void delete(int seq3) {
		sql.delete("odam.delete", seq3);
	}

	@Override
	public void add(Odam item) {
		sql.insert("odam.add", item);
	}

	@Override
	public Odam item(int seq3) {
		return sql.selectOne("odam.item", seq3);
	}

	@Override
	public void update(Odam item) {
		sql.update("odam.update", item);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("odam.total", pager);
	}
}
