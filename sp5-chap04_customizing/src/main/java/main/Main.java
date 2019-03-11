/* 게시판 정보/유저정보를 출력하는 프로그램 (도서정보) 
 * 
 * DI : 의존 자동 주입
 * */

package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppContext;
import service.BookInfo;
import service.PostInfo;
import service.SelectUser;

public class Main {
	public static void main(String[] args) {
	
		BookInfo bookInfo = null;		PostInfo postInfo = null;	
		SelectUser selectUser = null;
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		
		bookInfo = ctx.getBean("bookInfo", BookInfo.class);
		postInfo = ctx.getBean("postInfo",PostInfo.class);
		
		// PostInfo bean의 멤버변수(bookInfo)를 @Autowired !!
		postInfo.getBookInfo().setBookName("밀실살인게임");
		System.out.println("도서명 : " + bookInfo.getBookName());		// 도서명 : 밀실살인게임

		////////////////////////////////////////////////////////////
		
		
		
		selectUser = ctx.getBean("selectUser", SelectUser.class);
		
		System.out.println("ID : "+selectUser.getLoginUser().getId());		// ID : BoYong30
		

		ctx.close();
	}
}
