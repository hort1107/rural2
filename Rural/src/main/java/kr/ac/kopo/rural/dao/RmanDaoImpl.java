package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Rman;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class RmanDaoImpl implements RmanDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Rman> list(Pager pager) {
		return sql.selectList("rman.list", pager);
	}

	@Override
	public void delete(int seq7) {
		sql.delete("rman.delete", seq7);
	}

	@Override
	public void add(Rman item) {
		sql.insert("rman.add", item);
	}

	@Override
	public Rman item(int seq7) {
		return sql.selectOne("rman.item", seq7);
	}

	@Override
	public void update(Rman item) {
		sql.update("rman.update", item);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("rman.total", pager);
	}
}
