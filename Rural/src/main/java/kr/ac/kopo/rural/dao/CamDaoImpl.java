package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Cam;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class CamDaoImpl implements CamDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Cam> list() {
		return sql.selectList("cam.list");
	}

	@Override
	public void delete(String dep) {
		sql.delete("cam.delete", dep);
	}

	@Override
	public void add(Cam item) {
		sql.insert("cam.add", item);
	}

	@Override
	public Cam item(String dep) {
		return sql.selectOne("cam.item", dep);
	}

	@Override
	public void update(Cam item) {
		sql.update("cam.update", item);
	}

	@Override
	public int total(Pager pager) {
		return sql.selectOne("cam.total", pager);
	}

	@Override
	public List<Cam> list(Pager pager) {
		return sql.selectList("cam.list", pager);
	}

}
