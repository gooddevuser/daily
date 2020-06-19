package com.daily.service;

import java.util.List;

import com.daily.vo.Qna;

public interface QnaService {

	void insertQna(Qna qna);

	List<Qna> selectQna();

	Qna selectQnaByQno(int qno);

	void updateQnaByQno(Qna qna);

	List<Qna> selectFinishQna();

	List<Qna> selectQnaByuno(Qna qna);

}
