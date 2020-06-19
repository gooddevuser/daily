package com.daily.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daily.mapper.BannerMapper;
import com.daily.vo.Banner;

@Service("bannerService")
public class BannerServiceImpl implements BannerService {
	
	@Autowired
	BannerMapper bannerMapper;
	
	@Override
	public void insertBanner(Banner banner) {
		bannerMapper.insertBanner(banner);
		
	}

	@Override
	public void updateBanner(Banner banner) {
		bannerMapper.updateBanner(banner);
	}
}