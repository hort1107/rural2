package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Ccrop;
import kr.ac.kopo.rural.util.Pager;


@Repository
public class CcropDaoImpl implements CcropDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Ccrop> list(Pager pager) {
		return sql.selectList("ccrop.list", pager);
	}

	@Override
	public void delete(int seq5) {
		sql.delete("ccrop.delete", seq5);
	}

	@Override
	public void add(Ccrop item) {
		sql.insert("ccrop.add", item);
	}

	@Override
	public Ccrop item(int seq5) {
		return sql.selectOne("ccrop.item", seq5);
	}

	@Override
	public void update(Ccrop item) {
		sql.update("ccrop.update", item);
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("ccrop.total", pager);
	}
}
