package com.daily.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Review {

	public int rno;
	public int uno;
	public int pno;
	public int rstar;
	public Date rdate;
	public String title;	
	public String review;
	public String reviewpwd;
	public String reviewrepwd;
	public String ranswer;
	public String rwriter;
	public int ractive;
}