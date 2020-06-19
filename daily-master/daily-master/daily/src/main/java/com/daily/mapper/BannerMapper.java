package com.daily.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.daily.vo.Banner;

@Mapper
public interface BannerMapper {
	
	void insertBanner(Banner banner);

	void updateBanner(Banner banner);
}
