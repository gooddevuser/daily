package com.daily.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Qna {

	public int qno;
	public int ono;	
	public int uno;
	public Date qdate;
	public String qcategory;
	public String qtitle;
	public String qname;
	public String qna;
	public String qnapwd;
	public String qnarepwd;
	public String qanswer;
	public String qwriter;
	public int qactive;
}