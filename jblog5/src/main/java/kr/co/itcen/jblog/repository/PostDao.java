package kr.co.itcen.jblog.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.itcen.jblog.vo.PostVo;

@Repository
public class PostDao {
	@Autowired
	private SqlSession sqlSession;

	public List<PostVo> getList(Long categoryno) {
		List<PostVo> list = sqlSession.selectList("post.getList", categoryno);
		return list;
	}

	public PostVo getPost(Long postno, Long categoryno) {
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("no", postno);
		map.put("category_no", categoryno);
		PostVo vo = sqlSession.selectOne("post.getPost", map);
		return vo;
	}

	public Boolean insert(PostVo postvo) {
		int count = sqlSession.insert("post.insert", postvo);
		return count == 1;
	}

	public int ajaxdeletePost(Long catNo) {
		return sqlSession.delete("post.ajaxdelete", catNo);

	}

}
