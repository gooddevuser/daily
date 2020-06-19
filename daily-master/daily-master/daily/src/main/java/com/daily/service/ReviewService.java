package com.daily.service;

import java.util.List;

import com.daily.vo.Review;

public interface ReviewService {

	void insertReview(Review review);

	List<Review> selectReview();

	void updateReviewByRno(Review review);

	Review selectReviewByRno(Review review);

	List<Review> selectFinishReview();

	List<Review> selectReviewByuno(Review review);

	List<Review> selectReviewByPno(int pno);
	
}
