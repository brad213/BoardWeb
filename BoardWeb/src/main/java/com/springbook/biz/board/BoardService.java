package com.springbook.biz.board;

import java.util.List;
//Service 인터페이스 123
public interface BoardService {

	//CRUD 기능의 메소드 구현
	//글 등록
	void insertBoard(BoardVO vo);

	//글 수정
	void updateBoard(BoardVO vo);

	//글 삭제
	void deleteBoard(BoardVO vo);

	//글 상세조회
	BoardVO getBoard(BoardVO vo);

	//글 목록 조회
	List<BoardVO> getBoardList(BoardVO vo);

}