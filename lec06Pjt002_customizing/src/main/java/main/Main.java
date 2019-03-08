/* 게시판 정보를 출력하는 프로그램 (도서정보, 회원정보) 
 * 
 * DI 개념 이해용
 * 
 * */

package main;

import org.springframework.context.support.GenericXmlApplicationContext;

import service.BookInfo;
import service.MemberInfo;

public class Main {
	public static void main(String[] args) {
		
	
		BookInfo bookInfo = null;
		MemberInfo memberInfo = null;
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		bookInfo = ctx.getBean("bookInfo", BookInfo.class);
		
	
		bookInfo.getBookName();
		bookInfo.getWriter();
		
		
		memberInfo = ctx.getBean("memberInfo",MemberInfo.class);
		
		memberInfo.getUserName();
		memberInfo.getUserAge();
		
		ctx.close();
		
	}
}
