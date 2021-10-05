package kr.ac.kopo.rural.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.rural.model.Member;
import kr.ac.kopo.rural.util.Pager;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Member> list(Pager pager) {
		return sql.selectList("member.list", pager);
	}

	@Override
	public void delete(String id) {
		sql.delete("member.delete", id);
	}

	@Override
	public void add(Member item) {
		sql.insert("member.add", item);
	}

	@Override
	public Member item(String id) {
		return sql.selectOne("member.item", id);
	}

	@Override
	public void update(Member item) {
		sql.update("member.update", item);
	}
	 @Override
	   public int checkId(String id) {
	      return sql.selectOne("member.checkId", id);
	   }
	 @Override
		public int total(Pager pager) {
			return sql.selectOne("member.total", pager);
		}
}
