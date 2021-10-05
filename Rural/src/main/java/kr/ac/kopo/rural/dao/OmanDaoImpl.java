package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Oman;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class OmanDaoImpl implements OmanDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Oman> list(Pager pager) {
		return sql.selectList("oman.list", pager);
	}

	@Override
	public void delete(int seq) {
		sql.delete("oman.delete", seq);
	}

	@Override
	public void add(Oman item) {
		sql.insert("oman.add", item);
	}

	@Override
	public Oman item(int seq) {
		return sql.selectOne("oman.item", seq);
	}

	@Override
	public void update(Oman item) {
		sql.update("oman.update", item);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("oman.total", pager);
	}
}
