package com.daily.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Order {

	public int ono;
	public int pno;	
	public int uno;
	public Date odate;
	public String content;
	public String cardnumber;
	public String cardname;
	public String carddate;
	public int oactive;
	private User user;
	private Product product;
	
	public String uname;
	public String id;
	public String nickname;
	public String gender;
	public int age;
	public String address1;
	public String address2;
	public String email;
	public String url;
	public String interest;
	public String pname;
	public String content1;
	public String category1;
	public String category2;
	public String content2;
	public String size;
	public String color;
	public String pcode;
	public int zip;
	public int tel;
	public int price;
	public int quantity;
	public int star;
	public int saleprice;
	public int discount;
	public int refund;
}