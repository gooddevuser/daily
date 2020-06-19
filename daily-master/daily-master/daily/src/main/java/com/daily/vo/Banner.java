package com.daily.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Banner {

	public int bno;
	public int uno;
	public Date bdate;
	public String bannername;
	public String savedfilename;
	public String title;
	public String subtitle;
	public String content;
	public String contenttitle;
	public int validdate1;
	public int validdate2;
	public int filesize;
}