package com.daily.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.mapper.ReviewMapper;
import com.daily.vo.Review;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	ReviewMapper reviewMapper;

	@Override
	public void insertReview(Review review) {
		reviewMapper.insertReview(review);
		
	}

	@Override
	public List<Review> selectReview() {
		return reviewMapper.selectReview();
	}

	@Override
	public void updateReviewByRno(Review review) {
		reviewMapper.updateReviewByRno(review);
		
	}

	@Override
	public Review selectReviewByRno(Review review) {
		return reviewMapper.selectReviewByRno(review);
	}

	@Override
	public List<Review> selectFinishReview() {
		return reviewMapper.selectFinishReview();
	}

	@Override
	public List<Review> selectReviewByuno(Review review) {
		return reviewMapper.selectReviewByuno(review);
	}

	@Override
	public List<Review> selectReviewByPno(int pno) {
		return reviewMapper.selectReviewByPno(pno);
	}


}