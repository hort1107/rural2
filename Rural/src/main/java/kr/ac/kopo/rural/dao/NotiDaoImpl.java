package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Noti;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class NotiDaoImpl implements NotiDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Noti> list(Pager pager) {
		return sql.selectList("noti.list", pager);
	}

	@Override
	public void delete(int seq13) {
		sql.delete("noti.delete", seq13);
	}

	@Override
	public void add(Noti item) {
		sql.insert("noti.add", item);
	}

	@Override
	public Noti item(int seq13) {
		return sql.selectOne("noti.item", seq13);
	}

	@Override
	public void update(Noti item) {
		sql.update("noti.update", item);
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("noti.total", pager);
	}
}
