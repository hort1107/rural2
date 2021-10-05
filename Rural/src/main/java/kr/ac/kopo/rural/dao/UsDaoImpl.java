package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Us;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class UsDaoImpl implements UsDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Us> list(Pager pager) {
		return sql.selectList("us.list", pager);
	}

	@Override
	public void delete(int seq14) {
		sql.delete("us.delete", seq14);
	}

	@Override
	public void add(Us item) {
		sql.insert("us.add", item);
	}

	@Override
	public Us item(int seq14) {
		return sql.selectOne("us.item", seq14);
	}

	@Override
	public void update(Us item) {
		sql.update("us.update", item);
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("us.total", pager);
	}
}
