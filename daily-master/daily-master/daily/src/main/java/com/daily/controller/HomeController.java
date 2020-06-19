package com.daily.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.daily.service.BannerService;
import com.daily.service.OrderService;
import com.daily.service.PointService;
import com.daily.service.ProductService;
import com.daily.service.QnaService;
import com.daily.service.ReviewService;
import com.daily.service.UserService;
import com.daily.vo.Banner;
import com.daily.vo.Order;
import com.daily.vo.Point;
import com.daily.vo.Product;
import com.daily.vo.Qna;
import com.daily.vo.Review;
import com.daily.vo.User;

@Controller
public class HomeController {	
	
	@Autowired
	@Qualifier("userService")
	UserService userService;
	
	@Autowired
	@Qualifier("productService")
	ProductService productService;
	
	@Autowired
	@Qualifier("orderService")
	OrderService orderService;
	
	@Autowired
	@Qualifier("reviewService")
	ReviewService reviewService;
	
	@Autowired
	@Qualifier("qnaService")
	QnaService qnaService;
	
	@Autowired
	@Qualifier("pointService")
	PointService pointService;
	
	@Autowired
	@Qualifier("bannerService")
	BannerService bannerService;
	
	@PostMapping(path = { "/login" })
	public String Dologin(User user,HttpSession session) {
		User user2 = userService.selectUserByuseridAndpwd(user);
		session.setAttribute("loginuser", user2);
		if (user2.getUactive() == '8' && user2.getUactive() == '9') {
			session.setAttribute("loginuser", user2);
		}
		return "redirect:index";		
	}
	
	@GetMapping(path = { "logout" })
	public String dologout(HttpSession session) {
		session.removeAttribute("loginuser");
		return "redirect:index";
		
	}
	
	@GetMapping(path = { "/", "/index" })
	public String index(Model model,Product product) {
		List<Order> orders = orderService.selectOrder1();
		model.addAttribute("orders", orders);
		
		//총 수익
		int SumSaleprice = orderService.selectSumSaleprice();
		model.addAttribute("SumSaleprice", SumSaleprice);
		//총수익을 현재날짜의 전날 기준으로 총수익 금액이 나타나는 것
		int SumSaleprice1Day = orderService.selectSumSalepriceBy1Day();
		model.addAttribute("SumSaleprice1Day", SumSaleprice1Day);
		//
		int SumSaleprice2Day = orderService.selectSumSalepriceBy2Day();
		model.addAttribute("SumSaleprice2Day", SumSaleprice2Day);
		//
		int SumSaleprice3Day = orderService.selectSumSalepriceBy3Day();
		model.addAttribute("SumSaleprice3Day", SumSaleprice3Day);
		//
		int SumSaleprice4Day = orderService.selectSumSalepriceBy4Day();
		model.addAttribute("SumSaleprice4Day", SumSaleprice4Day);
		//
		int SumSaleprice5Day = orderService.selectSumSalepriceBy5Day();
		model.addAttribute("SumSaleprice5Day", SumSaleprice5Day);
		//
		int SumSaleprice6Day = orderService.selectSumSalepriceBy6Day();
		model.addAttribute("SumSaleprice6Day", SumSaleprice6Day);
		//
		int SumSaleprice7Day = orderService.selectSumSalepriceBy7Day();
		model.addAttribute("SumSaleprice7Day", SumSaleprice7Day);
		//
		int SumSaleprice8Day = orderService.selectSumSalepriceBy8Day();
		model.addAttribute("SumSaleprice8Day", SumSaleprice8Day);
		//
		int SumSaleprice9Day = orderService.selectSumSalepriceBy9Day();
		model.addAttribute("SumSaleprice9Day", SumSaleprice9Day);
		//
		//총 평균수익
		int AvgSaleprice = orderService.selectAvgSaleprice();
		model.addAttribute("AvgSaleprice", AvgSaleprice);
		//
		int AvgSaleprice1Day = orderService.selectAvgSalepriceBy1Day();
		model.addAttribute("AvgSaleprice1Day", AvgSaleprice1Day);
		//
		int AvgSaleprice2Day = orderService.selectAvgSalepriceBy2Day();
		model.addAttribute("AvgSaleprice2Day", AvgSaleprice2Day);
		//
		int AvgSaleprice3Day = orderService.selectAvgSalepriceBy3Day();
		model.addAttribute("AvgSaleprice3Day", AvgSaleprice3Day);
		//
		int AvgSaleprice4Day = orderService.selectAvgSalepriceBy4Day();
		model.addAttribute("AvgSaleprice4Day", AvgSaleprice4Day);
		//
		int AvgSaleprice5Day = orderService.selectAvgSalepriceBy5Day();
		model.addAttribute("AvgSaleprice5Day", AvgSaleprice5Day);
		//
		int AvgSaleprice6Day = orderService.selectAvgSalepriceBy6Day();
		model.addAttribute("AvgSaleprice6Day", AvgSaleprice6Day);
		//
		int AvgSaleprice7Day = orderService.selectAvgSalepriceBy7Day();
		model.addAttribute("AvgSaleprice7Day", AvgSaleprice7Day);
		//
		int AvgSaleprice8Day = orderService.selectAvgSalepriceBy8Day();
		model.addAttribute("AvgSaleprice8Day", AvgSaleprice8Day);
		//
		int AvgSaleprice9Day = orderService.selectAvgSalepriceBy9Day();
		model.addAttribute("AvgSaleprice9Day", AvgSaleprice9Day);
		
		//총 환불금액
		int SumRefundSaleprice = orderService.selectSumRefundSaleprice();
		model.addAttribute("SumRefundSaleprice", SumRefundSaleprice);
		//
		int SumRefundSaleprice1Day = orderService.selectSumRefundSalepriceBy1Day();
		model.addAttribute("SumRefundSaleprice1Day", SumRefundSaleprice1Day);
		//
		int SumRefundSaleprice2Day = orderService.selectSumRefundSalepriceBy2Day();
		model.addAttribute("SumRefundSaleprice2Day", SumRefundSaleprice2Day);
		//
		int SumRefundSaleprice3Day = orderService.selectSumRefundSalepriceBy3Day();
		model.addAttribute("SumRefundSaleprice3Day", SumRefundSaleprice3Day);
		//
		int SumRefundSaleprice4Day = orderService.selectSumRefundSalepriceBy4Day();
		model.addAttribute("SumRefundSaleprice4Day", SumRefundSaleprice4Day);
		//
		int SumRefundSaleprice5Day = orderService.selectSumRefundSalepriceBy5Day();
		model.addAttribute("SumRefundSaleprice5Day", SumRefundSaleprice5Day);
		//
		int SumRefundSaleprice6Day = orderService.selectSumRefundSalepriceBy6Day();
		model.addAttribute("SumRefundSaleprice6Day", SumRefundSaleprice6Day);
		//
		int SumRefundSaleprice7Day = orderService.selectSumRefundSalepriceBy7Day();
		model.addAttribute("SumRefundSaleprice7Day", SumRefundSaleprice7Day);
		//
		int SumRefundSaleprice8Day = orderService.selectSumRefundSalepriceBy8Day();
		model.addAttribute("SumRefundSaleprice8Day", SumRefundSaleprice8Day);
		//
		int SumRefundSaleprice9Day = orderService.selectSumRefundSalepriceBy9Day();
		model.addAttribute("SumRefundSaleprice9Day", SumRefundSaleprice9Day);
		
		//총 평균할인금액
		int AvgSaleSaleprice = orderService.selectAvgSaleSaleprice();
		model.addAttribute("AvgSaleSaleprice", AvgSaleSaleprice);
		//
		//
		int AvgSaleSaleprice1Day = orderService.selectAvgSaleSalepriceBy1Day();
		model.addAttribute("AvgSaleSaleprice1Day", AvgSaleSaleprice1Day);
		//
		int AvgSaleSaleprice2Day = orderService.selectAvgSaleSalepriceBy2Day();
		model.addAttribute("AvgSaleSaleprice2Day", AvgSaleSaleprice2Day);
		//
		int AvgSaleSaleprice3Day = orderService.selectAvgSaleSalepriceBy3Day();
		model.addAttribute("AvgSaleSaleprice3Day", AvgSaleSaleprice3Day);
		//
		int AvgSaleSaleprice4Day = orderService.selectAvgSaleSalepriceBy4Day();
		model.addAttribute("AvgSaleSaleprice4Day", AvgSaleSaleprice4Day);
		//
		int AvgSaleSaleprice5Day = orderService.selectAvgSaleSalepriceBy5Day();
		model.addAttribute("AvgSaleSaleprice5Day", AvgSaleSaleprice5Day);
		//
		int AvgSaleSaleprice6Day = orderService.selectAvgSaleSalepriceBy6Day();
		model.addAttribute("AvgSaleSaleprice6Day", AvgSaleSaleprice6Day);
		//
		int AvgSaleSaleprice7Day = orderService.selectAvgSaleSalepriceBy7Day();
		model.addAttribute("AvgSaleSaleprice7Day", AvgSaleSaleprice7Day);
		//
		int AvgSaleSaleprice8Day = orderService.selectAvgSaleSalepriceBy8Day();
		model.addAttribute("AvgSaleSaleprice8Day", AvgSaleSaleprice8Day);
		//
		int AvgSaleSaleprice9Day = orderService.selectAvgSaleSalepriceBy9Day();
		model.addAttribute("AvgSaleSaleprice9Day", AvgSaleSaleprice9Day);
		
		int Category = 10;
		for (int Count = 0; Count < Category; Count++) {
			int CategoryCount = productService.selectCategoryCount(Count);	
			model.addAttribute("CategoryCount" + Category, CategoryCount);
		}
		//for문 작성했는데 model 객체에 잘들어왔는지 의문
		
		String Size = "4";
		product.setSize(String.valueOf(Size));	
		// product에 setSize라는 변수 고 내용은 '4'로 세팅한다. (String)
		// get html or jsp에서 input태그로 post 넘기지않아도 controller에서 값을 빼와서 작성가능
		// 사용하는예시 orderService.settingSize(product);
		
		int star = (int)product.getStar();
		//product의 getStar를 가져와서 (int)
		product.setStar(star);
		//product setStar로 값을 설정한다. 안에 집어 넣는다.
		// 사용하는예시 orderService.settingStar(product);
		
		return "index";
		
	}
	
	@GetMapping(path = { "/influencer-finder" })
	public String influencerfinder() {
		
		return "influencer-finder";
		
	}
	
	@GetMapping(path = { "/faq" })
	public String faq() {
		
		return "faq";
		
	}
	
	@GetMapping(path = { "/influencer-profile" })
	public String influencerprofile() {
		
		return "influencer-profile";
		
	}
	
	@GetMapping(path = { "/ecommerce-product" })
	public String ecommerceproduct() {
		
		return "ecommerce-product";
		
	}
	
	@GetMapping(path = { "/ecommerce-product-single" })
	public String ecommerceproductsingle() {
		
		return "ecommerce-product-single";
		
	}
	
	@GetMapping(path = { "/ecommerce-product-checkout" })
	public String ecommerceproductcheckout() {
		
		return "ecommerce-product-checkout";
		
	}
	
	@GetMapping(path = { "/dashboard-sales" })
	public String dashboardsales() {
		
		return "dashboard-sales";
		
	}
	
	@GetMapping(path = { "/dashboard-influencer" })
	public String dashboardinfluencer() {
		
		return "dashboard-influencer";
		
	}
	
	@GetMapping(path = { "/dashboard-finance" })
	public String dashboardfinance() {
		
		return "dashboard-finance";
		
	}
		
	@GetMapping(path = { "/accordions" })
	public String accordions() {
		
		return "accordions";
		
	}
	
	@GetMapping(path = { "/blank-page-header" })
	public String blankpageheader() {
		
		return "blank-page-header";
		
	}
	
	@GetMapping(path = { "/blank-page" })
	public String blankpage() {
		
		return "blank-page";
		
	}
	
	@GetMapping(path = { "/bootstrap-select" })
	public String bootstrapselect() {
		
		return "bootstrap-select";
		
	}
	
	@GetMapping(path = { "/calendar" })
	public String calendar(Model model) {
		int tcode = (int)(Math.random()*100000);
		model.addAttribute("tcode", tcode);
		return "calendar";
		
	}
	
	@GetMapping(path = { "/cards" })
	public String cards() {
		
		return "cards";
		
	}
	
	@GetMapping(path = { "/carousel" })
	public String carousel() {
		
		return "carousel";
		
	}
	
	@GetMapping(path = { "/chart-c3" })
	public String chartc3() {
		
		return "chart-c3";
		
	}
	
	@GetMapping(path = { "/chart-chartist" })
	public String chartchartist() {
		
		return "chart-chartist";
		
	}
	
	@GetMapping(path = { "/chart-charts" })
	public String chartcharts() {
		
		return "chart-charts";
		
	}
	
	@GetMapping(path = { "/chart-gauge" })
	public String chartgauge() {
		
		return "chart-gauge";
		
	}
	
	@GetMapping(path = { "/chart-morris" })
	public String chartmorris() {
		
		return "chart-morris";
		
	}
	
	@GetMapping(path = { "/chart-sparkline" })
	public String chartsparkline() {
		
		return "chart-sparkline";
		
	}
	
	@GetMapping(path = { "/color-picker" })
	public String colorpicker() {
		
		return "color-picker";
		
	}
	
	@GetMapping(path = { "/cropped" })
	public String cropped() {
		
		return "cropped";
		
	}

	@GetMapping(path = { "/cropper-image" })
	public String cropperimage() {
		
		return "cropper-image";
		
	}
	
	@GetMapping(path = { "/dattables" })
	public String datatables() {
		
		return "dattables";
		
	}
	
	@GetMapping(path = { "/datepicker" })
	public String datepicker() {
		
		return "datepicker";
		
	}
	
	@GetMapping(path = { "/email-compose" })
	public String emailcompose() {
		
		return "email-compose";
		
	}
	
	@GetMapping(path = { "/email-details" })
	public String emaildetails() {
		
		return "email-details";
		
	}
	
	@GetMapping(path = { "/forgot-password" })
	public String forgotpassword() {
		
		return "forgot-password";
		
	}
	
	@GetMapping(path = { "/form-elements" })
	public String formelements() {
		
		return "form-elements";
		
	}
	
	@GetMapping(path = { "/form-validation" })
	public String formvalidation() {
		
		return "form-validation";
		
	}
	
	@GetMapping(path = { "/general-table" })
	public String generaltable() {
		
		return "general-table";
		
	}
	
	@GetMapping(path = { "/general" })
	public String general() {
		
		return "general";
		
	}
	
	@GetMapping(path = { "/icon-flag" })
	public String iconflag() {
		
		return "icon-flag";
		
	}
	
	@GetMapping(path = { "/icon-fontawesome" })
	public String iconfontawesome() {
		
		return "icon-fontawesome";
		
	}
	
	@GetMapping(path = { "/icon-material" })
	public String iconmaterial() {
		
		return "icon-material";
		
	}
	
	@GetMapping(path = { "/icon-simple-lineicon" })
	public String iconsimplelineicon() {
		
		return "icon-simple-lineicon";
		
	}
	
	@GetMapping(path = { "/icon-themify" })
	public String iconthemify() {
		
		return "icon-themify";
		
	}
	
	@GetMapping(path = { "/icon-weather" })
	public String iconweather() {
		
		return "icon-weather";
		
	}
	
	@GetMapping(path = { "/inbox" })
	public String inbox() {
		
		return "inbox";
		
	}
	
	@GetMapping(path = { "/invoice" })
	public String invoice() {
		
		return "invoice";
		
	}
	
	@GetMapping(path = { "/listgroup" })
	public String listgroup() {
		
		return "listgroup";
		
	}
	
	@GetMapping(path = { "/login" })
	public String login() {
		
		return "login";
		
	}
	
	@GetMapping(path = { "/map-google" })
	public String mapgoogle() {
		
		return "map-google";
		
	}
	
	@GetMapping(path = { "/map-vector" })
	public String mapvector() {
		
		return "map-vector";
		
	}
	
	@GetMapping(path = { "/mediobject" })
	public String mediaobject() {
		
		return "mediobject";
		
	}
	
	@GetMapping(path = { "/message-chat" })
	public String messagechat() {
		
		return "message-chat";
		
	}
	
	@GetMapping(path = { "/multiselect" })
	public String multiselect() {
		
		return "multiselect";
		
	}
	
	@GetMapping(path = { "/pages-app" })
	public String pagesapp() {
		
		return "pages-app";
		
	}
	
	@GetMapping(path = { "/pages-sign-up" })
	public String pagessignup() {
		
		return "pages-sign-up";
		
	}
	
	@GetMapping(path = { "/pricing" })
	public String pricing() {
		
		return "pricing";
		
	}
	
	@GetMapping(path = { "/sign-up" })
	public String signup() {
		
		return "sign-up";
		
	}
	
	@GetMapping(path = { "/sortable-nestable-lists" })
	public String sortablenestablelists() {
		
		return "sortable-nestable-lists";
		
	}
	
	@GetMapping(path = { "/tabs" })
	public String tabs() {
		
		return "tabs";
		
	}
	
	@GetMapping(path = { "/timeline" })
	public String timeline() {
		
		return "timeline";
		
	}
	
	@GetMapping(path = { "/typography" })
	public String typography() {
		
		return "typography";
		
	}
	
	@GetMapping(path = { "/user-profile" })
	public String userprofile() {
		
		return "user-profile";
		
	}
	
	@GetMapping(path = { "/widgets" })
	public String widgets() {
		
		return "widgets";
		
	}
	
	//////////////////////////////////////////
	
	@GetMapping(path = { "/edit-order" })
	public String editorder() {
		
		return "edit-order";
		
	}
	
	@GetMapping(path = { "/edit-user" })
	public String edituser(Model model,int uno) {
		User user = userService.selectUserByUno(uno);
		model.addAttribute("user", user);
		return "edit-user";
		
	}
	
	@PostMapping(path = { "/edit-user" })
	public String Doedituser(User user) {
		userService.updateUserByUno(user);
		return "redirect:edit-user";
		
	}
	
	@GetMapping(path = { "/edit-product" })
	public String editproduct(Model model,int pno) {
		Product product = productService.selectProductByPno(pno);
		model.addAttribute("product", product);
		return "edit-product";
		
	}
	
	@PostMapping(path = { "/edit-product" })
	public String Doeditproduct(Product product) {
		productService.updateProductByPno(product);
		return "redirect:edit-product";
		
	}
		
	@GetMapping(path = { "/edit-qna-answer" })
	public String editqnaanswer() {
		
		return "edit-qna-answer";
		
	}
	@GetMapping(path = { "/edit-qna" })
	public String editqna() {
		
		return "edit-qna";
		
	}
	@GetMapping(path = { "/edit-review" })
	public String editreview() {
		
		return "edit-review";
		
	}
	
	@GetMapping(path = { "/edit-review-answer" })
	public String editreviewanswer() {
		
		return "edit-review-answer";
		
	}
	
	@GetMapping(path = { "/edit-userpoint" })
	public String edituserpoint() {
		
		return "edit-userpoint";
		
	}
	
	@GetMapping(path = { "/edit-user-noticemail" })
	public String editusernoticemail() {
		
		return "edit-user-noticemail";
		
	}
	
	@GetMapping(path = { "/edit-banner" })
	public String editbanner() {
		
		return "edit-banner";
		
	}
	
	@GetMapping(path = { "/user-detail" })
	public String userdetail(Model model,int uno) {
		User user = userService.selectUserByUno(uno);
		model.addAttribute("user", user);	
		return "user-detail";
		
	}
		
	@GetMapping(path = { "/add-order" })
	public String addorder(Order order,Model model) {
		List<Order> orders2 = orderService.selectOrderByUno(order);
		model.addAttribute("orders",orders2); 
		//리스트에서 특정 컬럼값 뽑는 방법 문의 할것
		//Product product2 = productService.selectProductByTotalPrice(product);
		int uno = (int)(order.getUno());
		
		int sum = orderService.selectOrderByTotalPrice(uno);
		
		if ( sum > 0 ){
			model.addAttribute("totalprice", sum); 	
			int finalsum = sum + 3000;
			model.addAttribute("finalprice", finalsum); 
			
		} else {
			return "redirect:index";
		}
				
		return "add-order";
		
	}
	
	@GetMapping(path = { "/delete-order" })
	public String deleteorder(int ono) {
		orderService.deleteOrderByOno(ono);
		return "index";
	}
	
	@PostMapping(path = { "/add-order" })
	public String Doaddorder(Order order) {	
		orderService.updateOrderByUno(order);
		return "redirect:index";
		
	}
	
	
	@GetMapping(path = { "/add-user" })
	public String adduser(Model model) {
		long number = (long) (Math.random() * 1000000000) + 11111;
		model.addAttribute("number",number);	
		return "add-user";
		
	}
	
	@PostMapping(path = { "/add-user" })
	public String Doadduser(User user) {
		userService.insertUser(user);
			
		return "redirect:index";
		
	}
	
	@GetMapping(path = { "/add-product" })
	public String addproduct() {
		
		
		return "add-product";
		
	}
	
	@PostMapping(path = { "/add-product" })
	public String Doaddproduct(Product product) {
		productService.insertProduct(product);
		return "redirect:all-product";
		
	}
		
	@GetMapping(path = { "/add-qna-answer" })
	public String addqnaanswer(Model model,int qno) {
		Qna qna = qnaService.selectQnaByQno(qno);
		model.addAttribute("qna", qna);
		return "add-qna-answer";
		
	}
	
	@PostMapping(path = { "/add-qna-answer" })
	public String addqnaanswer(Qna qna) {		
		qnaService.updateQnaByQno(qna);
		return "add-qna-answer";
		
	}
	
	@GetMapping(path = { "/add-qna" })
	public String addqna(Order order, Model model) {
		List<Order> orders = orderService.selectFinishOrderByUno(order);
		model.addAttribute("orders",orders); 
		return "add-qna";
		
	}
	
	@PostMapping(path = { "/add-qna" })
	public String Doaddqna(Qna qna) {
		qnaService.insertQna(qna);
		return "all-qna";
		
	}
	
	@GetMapping(path = { "/add-review" })
	public String addreview(Order order, Model model) {
		List<Order> orders = orderService.selectFinishOrderByUno(order);
		model.addAttribute("orders",orders); 
		return "add-review";
		
	}
	
	@PostMapping(path = { "/add-review" })
	public String Doaddreview(Review review) {
		reviewService.insertReview(review);
		return "all-review";
		
	}
	
	@GetMapping(path = { "/add-review-answer" })
	public String addreviewanswer(Model model,Review review) {
		Review review2 = reviewService.selectReviewByRno(review);
		model.addAttribute("review", review2);
		return "add-review-answer";
		
	}
	
	@PostMapping(path = { "/add-review-answer" })
	public String Doaddreviewanswer(Review review) {		
		reviewService.updateReviewByRno(review);
		return "add-review-answer";
		
	}
	
	@GetMapping(path = { "/add-userpoint" })
	public String adduserpoint(Model model) {
		List<User> users = userService.selectUser();
		model.addAttribute("users", users);
		int tcode = (int)(Math.random()*100000);
		model.addAttribute("tcode", tcode);
		return "add-userpoint";
		
	}
	
	@PostMapping(path = { "/add-userpoint" })
	public String Doadduserpoint(Point point) {
		
		int point2 = (int)point.getUno();
		int point3 = 99999;
		
		pointService.insertPointAllUser(point);

		userService.updatePointAllUser(point);
		
		pointService.insertPoint(point);
		
		userService.updatePointByUno(point);
		
		return "all-userpoint";
		
	}
	
	@GetMapping(path = { "/add-user-noticemail" })
	public String addusernoticemail() {
		
		return "add-user-noticemail";
		
	}
	
	@GetMapping(path = { "/add-banner" })
	public String addbanner() {
		
		return "add-banner";
		
	}
	
	@PostMapping(path = { "/add-banner" })
	public String addbanner(Banner banner) {
		System.out.println(banner);
		bannerService.insertBanner(banner);			
		return "add-banner";
		
	}
	
	//bannerService.updateBanner(banner);
	
	@GetMapping(path = { "/main" })
	public String addmain() {
		
		return "main";
		
	}
	
	@GetMapping(path = { "/banner" })
	public String banner() {
		
		return "banner";
		
	}
	
	@GetMapping(path = { "/all-order" })
	public String allorder(Model model) {
		List<Order> orders = orderService.selectOrder();
		model.addAttribute("orders", orders);
		return "all-order";
		
	}
	
	@GetMapping(path = { "/all-order1" })
	public String allorder1(Order order) {
		orderService.updateOrderByOno1(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order2" })
	public String allorder2(Order order) {
		orderService.updateOrderByOno2(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order3" })
	public String allorder3(Order order) {
		orderService.updateOrderByOno3(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order4" })
	public String allorder4(Order order) {
		orderService.updateOrderByOno4(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order5" })
	public String allorder5(Order order) {
		orderService.updateOrderByOno5(order);
		orderService.updateRefundByOno(order); 
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order6" })
	public String allorder6(Order order) {
		orderService.updateOrderByOno6(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order7" })
	public String allorder7(Order order) {
		orderService.updateOrderByOno7(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order8" })
	public String allorder8(Order order) {
		orderService.updateOrderByOno8(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order9" })
	public String allorder9(Order order) {
		orderService.updateOrderByOno9(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order10" })
	public String allorder10(Order order) {
		orderService.updateOrderByOno10(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order11" })
	public String allorder11(Order order) {
		orderService.updateOrderByOno11(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order12" })
	public String allorder12(Order order) {
		orderService.updateOrderByOno12(order);
		return "redirect:all-order";
		
	}
	
	@GetMapping(path = { "/all-order-user1" })
	public String allorderuser1(Order order,Model model) {
		List<Order> orders = orderService.selectOrderByOactive1(order);
		model.addAttribute("orders", orders);
		return "all-order-user1";
		
	}
	
	@GetMapping(path = { "/all-order-user2" })
	public String allorderuser2(Order order,Model model) {
		List<Order> orders = orderService.selectOrderByOactive2(order);
		model.addAttribute("orders", orders);
		return "all-order-user2";
		
	}
	
	@GetMapping(path = { "/all-user" })
	public String alluser(Model model) {
		List<User> users = userService.selectUser();
		model.addAttribute("users", users);
		return "all-user";
		
	}
	
	@GetMapping(path = { "/all-user1" })
	public String alluser1(User user) {
		userService.updateUser1(user);
		return "redirect:all-user";
		
	}
	
	@GetMapping(path = { "/all-user2" })
	public String alluser2(User user) {
		userService.updateUser2(user);
		return "redirect:all-user";
		
	}
	
	@GetMapping(path = { "/all-user3" })
	public String alluser3(User user) {
		userService.updateUser3(user);
		return "redirect:all-user";
		
	}
	
	@GetMapping(path = { "/all-user4" })
	public String alluser4(User user) {
		userService.updateUser4(user);
		return "redirect:all-user";
		
	}
	
	@GetMapping(path = { "/all-product" })
	public String allproduct(Model model,Product product) {
		
		List<Product> products = productService.selectProductByCategory(product);
		model.addAttribute("products",products);
			
		return "all-product";
		
	}
	
	@GetMapping(path = { "/all-product1" })
	public String allproduct1(Product product) {		
		productService.updateProduct1(product);			
		return "redirect:all-product";
		
	}
	
	@GetMapping(path = { "/all-products" })
	public String allproducts(Model model) {
		List<Product> products = productService.selectProduct();
		model.addAttribute("products", products);	
			
		return "all-products";
		
	}
	
	@PostMapping(path = { "/all-products" })
	public String Doallproducts(Model model) {
			
		return "all-products";
		
	}
	
	@GetMapping(path = { "/all-products-admin" })
	public String allproductsadmin(Model model) {
		List<Product> products = productService.selectProductByAdmin();
		model.addAttribute("products", products);	
			
		return "all-products-admin";
		
	}
	
	@GetMapping(path = { "/all-qna-answer" })
	public String allqnaanswer(Model model) {
		List<Qna> qnas = qnaService.selectFinishQna();
		model.addAttribute("qnas",qnas); 		
		return "all-qna-answer";
		
	}
	
	@GetMapping(path = { "/all-qna" })
	public String allqna(Model model) {
		List<Qna> qnas = qnaService.selectQna();
		model.addAttribute("qnas",qnas); 
		return "all-qna";
		
	}
	
	@GetMapping(path = { "/all-qna-user" })
	public String allqnauser(Model model,Qna qna) {
		
		List<Qna> qnas = qnaService.selectQnaByuno(qna);
		System.out.println(qnas);
		model.addAttribute("qnas",qnas); 
		return "all-qna-user";
		
	}
	
	@GetMapping(path = { "/all-review" })
	public String allreview(Model model) {
		List<Review> reviews = reviewService.selectReview();
		model.addAttribute("reviews",reviews); 
		return "all-review";
		
	}
	
	@GetMapping(path = { "/all-review-user" })
	public String allreviewuser(Model model,Review review) {
		List<Review> reviews = reviewService.selectReviewByuno(review);
		model.addAttribute("reviews",reviews); 
		return "all-review-user";
		
	}
	
	@GetMapping(path = { "/all-review-answer" })
	public String allreviewanswer(Model model) {
		List<Review> reviews = reviewService.selectFinishReview();
		model.addAttribute("reviews",reviews); 
		return "all-review-answer";
		
	}
	
	@GetMapping(path = { "/all-userpoint" })
	public String alluserpoint(Model model) {
		List<Point> points = pointService.selectUserPoint();
		model.addAttribute("points",points); 
		return "all-userpoint";
		
	}
	
	@GetMapping(path = { "/all-userpoint-user" })
	public String alluserpointuser(Model model,Point point) {
		List<Point> points = pointService.selectUserPointByUno(point);
		model.addAttribute("points",points); 
		return "all-userpoint-user";
		
	}
	
	@GetMapping(path = { "/all-user-noticemail" })
	public String allusernoticemail() {
		
		return "all-user-noticemail";
		
	}
	
	@GetMapping(path = { "/all-banner" })
	public String allbanner() {
		
		return "all-banner";
		
	}
	
	@GetMapping(path = { "/detail-product" })
	public String detailproduct(Model model,int pno) {
		Product product = productService.selectProductByPno(pno);
		model.addAttribute("product", product);
		List<Review> reviews = reviewService.selectReviewByPno(pno);
		model.addAttribute("reviews",reviews); 
		int category1 = (int)product.getCategory1();
		List<Product> products = productService.selectProductsByCategory1(category1);
		model.addAttribute("products",products); 
		return "detail-product";
		
	}
	
	@PostMapping(path = { "/detail-product" })
	public String DoCart(Order order) {
		orderService.insertOrderByPnoAndUnoAndOno(order);
		return "redirect:add-order";
		
	}
	
}
