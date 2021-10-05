package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Pbasic;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class PbasicDaoImpl implements PbasicDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Pbasic> list(Pager pager) {
		return sql.selectList("pbasic.list", pager);
	}

	@Override
	public void delete(String cul) {
		sql.delete("pbasic.delete", cul);
	}

	@Override
	public void add(Pbasic item) {
		sql.insert("pbasic.add", item);
	}

	@Override
	public Pbasic item(String cul) {
		return sql.selectOne("pbasic.item", cul);
	}

	@Override
	public void update(Pbasic item) {
		sql.update("pbasic.update", item);
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("pbasic.total", pager);
	}

}
