package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Obasic;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class ObasicDaoImpl implements ObasicDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Obasic> list(Pager pager) {
		return sql.selectList("obasic.list", pager);
	}

	@Override
	public void delete(String cul) {
		sql.delete("obasic.delete", cul);
	}

	@Override
	public void add(Obasic item) {
		sql.insert("obasic.add", item);
	}

	@Override
	public Obasic item(String cul) {
		return sql.selectOne("obasic.item", cul);
	}

	@Override
	public void update(Obasic item) {
		sql.update("obasic.update", item);
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("obasic.total", pager);
	}

}
