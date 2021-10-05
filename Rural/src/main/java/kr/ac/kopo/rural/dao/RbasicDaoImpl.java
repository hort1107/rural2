package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Rbasic;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class RbasicDaoImpl implements RbasicDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Rbasic> list(Pager pager) {
		return sql.selectList("rbasic.list", pager);
	}

	@Override
	public void delete(String cul) {
		sql.delete("rbasic.delete", cul);
	}

	@Override
	public void add(Rbasic item) {
		sql.insert("rbasic.add", item);
	}

	@Override
	public Rbasic item(String cul) {
		return sql.selectOne("rbasic.item", cul);
	}

	@Override
	public void update(Rbasic item) {
		sql.update("rbasic.update", item);
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("rbasic.total", pager);
	}
}
