package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Ocrop;
import kr.ac.kopo.rural.util.Pager;


@Repository
public class OcropDaoImpl implements OcropDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Ocrop> list(Pager pager) {
		return sql.selectList("ocrop.list", pager);
	}

	@Override
	public void delete(int seq2) {
		sql.delete("ocrop.delete", seq2);
	}

	@Override
	public void add(Ocrop item) {
		sql.insert("ocrop.add", item);
	}

	@Override
	public Ocrop item(int seq2) {
		return sql.selectOne("ocrop.item", seq2);
	}

	@Override
	public void update(Ocrop item) {
		sql.update("ocrop.update", item);
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("ocrop.total", pager);
	}
}
