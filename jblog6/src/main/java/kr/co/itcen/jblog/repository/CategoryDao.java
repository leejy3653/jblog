package kr.co.itcen.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.itcen.jblog.vo.CategoryVo;

@Repository
public class CategoryDao {
	@Autowired
	private SqlSession sqlSession;

	public Boolean insert(String id) {
		int count = sqlSession.insert("category.insert", id);
		return count == 1;
	}

	public List<CategoryVo> getList(String id) {
		List<CategoryVo> list = sqlSession.selectList("category.getlist", id);
		return list;
	}

	public List<CategoryVo> getCategoryList(String id) {
		List<CategoryVo> list = sqlSession.selectList("category.list", id);
		return list;
	}

	public List<CategoryVo> getCategorytitle(String id) { // category 제목
		List<CategoryVo> list = sqlSession.selectList("category.titlelist", id);
		return list;
	}

	public int ajaxdeleteCategory(Long catNo) {
		return sqlSession.delete("category.ajaxdelete", catNo);
	}

	public Long ajaxinsertCategory(CategoryVo catVo) {
		Long catNo = (long) sqlSession.insert("category.ajaxinsert", catVo);
		return catNo;
	}

}
