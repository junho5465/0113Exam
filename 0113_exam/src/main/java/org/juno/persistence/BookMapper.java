package org.juno.persistence;

import java.util.List;

import org.juno.domain.BookVO;

public interface BookMapper {
	public List<BookVO> getList();
	public BookVO get(int bookId);
}
