package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Cdam;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class CdamDaoImpl implements CdamDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Cdam> list(Pager pager) {
		return sql.selectList("cdam.list", pager);
	}

	@Override
	public void delete(int seq6) {
		sql.delete("cdam.delete", seq6);
	}

	@Override
	public void add(Cdam item) {
		sql.insert("cdam.add", item);
	}

	@Override
	public Cdam item(int seq6) {
		return sql.selectOne("cdam.item", seq6);
	}

	@Override
	public void update(Cdam item) {
		sql.update("cdam.update", item);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("cdam.total", pager);
	}
}
