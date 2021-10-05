package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Rcrop;
import kr.ac.kopo.rural.util.Pager;


@Repository
public class RcropDaoImpl implements RcropDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Rcrop> list(Pager pager) {
		return sql.selectList("rcrop.list", pager);
	}

	@Override
	public void delete(int seq8) {
		sql.delete("rcrop.delete", seq8);
	}

	@Override
	public void add(Rcrop item) {
		sql.insert("rcrop.add", item);
	}

	@Override
	public Rcrop item(int seq8) {
		return sql.selectOne("rcrop.item", seq8);
	}

	@Override
	public void update(Rcrop item) {
		sql.update("rcrop.update", item);
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("rcrop.total", pager);
	}
}
