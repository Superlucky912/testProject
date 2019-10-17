package kr.or.nextit.memo;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;

import org.junit.Test;

public class MemoDAOTest {

	@Test
	public void test() throws Exception {
		MemoDAO dao = new MemoDAO();
		List<MemoVO> list = dao.selectMemoList();
		int size = list.size();
//		assertThat(list.size(), is(1));
		MemoVO vo = new MemoVO();
		vo.setMemoContents("두번째 메모");
		dao.insertMemo(vo);
		List<MemoVO> list2 = dao.selectMemoList();
		
		assertThat(list2.size(), is(size + 1));
		
	}

}
