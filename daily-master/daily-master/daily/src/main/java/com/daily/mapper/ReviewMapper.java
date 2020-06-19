package com.daily.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daily.vo.Review;

@Mapper
public interface ReviewMapper {

	void insertReview(Review review);

	List<Review> selectReview();

	void updateReviewByRno(Review review);

	Review selectReviewByRno(Review review);

	List<Review> selectFinishReview();

	List<Review> selectReviewByuno(Review review);

	List<Review> selectReviewByPno(int pno);

}
