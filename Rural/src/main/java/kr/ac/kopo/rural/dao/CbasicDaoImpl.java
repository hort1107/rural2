package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Cbasic;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class CbasicDaoImpl implements CbasicDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Cbasic> list(Pager pager) {
		return sql.selectList("cbasic.list", pager);
	}

	@Override
	public void delete(String cul) {
		sql.delete("cbasic.delete", cul);
	}

	@Override
	public void add(Cbasic item) {
		sql.insert("cbasic.add", item);
	}

	@Override
	public Cbasic item(String cul) {
		return sql.selectOne("cbasic.item", cul);
	}

	@Override
	public void update(Cbasic item) {
		sql.update("cbasic.update", item);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("cbasic.total", pager);
	}


}
