package com.daily.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.mapper.QnaMapper;
import com.daily.vo.Qna;

@Service("qnaService")
public class QnaServiceImpl implements QnaService {
	
	@Autowired
	QnaMapper qnaMapper;

	@Override
	public void insertQna(Qna qna) {
		qnaMapper.insertQna(qna);		
	}

	@Override
	public List<Qna> selectQna() {
		List<Qna> qnas2 = qnaMapper.selectQna();
		return qnas2;
	}

	@Override
	public Qna selectQnaByQno(int qno) {
		 
		return qnaMapper.selectQnaByQno(qno);
	}

	@Override
	public void updateQnaByQno(Qna qna) {
		qnaMapper.updateQnaByQno(qna);
		
	}

	@Override
	public List<Qna> selectFinishQna() {
		return qnaMapper.selectFinishQna();
	}

	@Override
	public List<Qna> selectQnaByuno(Qna qna) {
		return qnaMapper.selectQnaByuno(qna);
	}

}