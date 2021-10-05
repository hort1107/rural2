package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Pcrop;
import kr.ac.kopo.rural.util.Pager;


@Repository
public class PcropDaoImpl implements PcropDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Pcrop> list(Pager pager) {
		return sql.selectList("pcrop.list", pager);
	}

	@Override
	public void delete(int seq11) {
		sql.delete("pcrop.delete", seq11);
	}

	@Override
	public void add(Pcrop item) {
		sql.insert("pcrop.add", item);
	}

	@Override
	public Pcrop item(int seq11) {
		return sql.selectOne("pcrop.item", seq11);
	}

	@Override
	public void update(Pcrop item) {
		sql.update("pcrop.update", item);
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("pcrop.total", pager);
	}
}
