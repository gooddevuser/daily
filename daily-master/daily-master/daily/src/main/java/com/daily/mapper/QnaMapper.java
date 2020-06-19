package com.daily.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daily.vo.Qna;

@Mapper
public interface QnaMapper {

	void insertQna(Qna qna);

	List<Qna> selectQna();

	Qna selectQnaByQno(int qno);

	void updateQnaByQno(Qna qna);

	List<Qna> selectFinishQna();

	List<Qna> selectQnaByuno(Qna qna);

}
