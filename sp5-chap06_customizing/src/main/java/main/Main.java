package main;

/* 게시판 정보/유저정보를 출력하는 프로그램 (도서정보) 
 * 
 * DI : 의존 자동 주입
 * */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppContext;
import service.BookInfo;

public class Main {
	public static void main(String[] args) {
	
		BookInfo bookInfo = null;


		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		bookInfo = ctx.getBean("bookInfo", BookInfo.class);

		System.out.println("도서명 : " + bookInfo.getBookName());	

		ctx.close();
	}
}
