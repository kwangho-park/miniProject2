/* 게시판 정보/유저정보를 출력하는 프로그램 (도서정보) 
 * */

package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ApplicationContext.AppContext;
import service.BookInfo;
import service.PostInfo;
import service.SelectUser;

public class Main {
	public static void main(String[] args) {
	
		BookInfo bookInfo = null;		PostInfo postInfo = null;	
		SelectUser selectUser1 = null;	SelectUser selectUser2 = null;
		
		// spring container 생성 및 bean 객체 설정 및 할당	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		
		// bean 객체 호출 (=참조값 반환)
		bookInfo = ctx.getBean("bookInfo", BookInfo.class);
		

		// bean 객체 호출 (=PostInfo객체)
		postInfo = ctx.getBean("postInfo",PostInfo.class);
		
		// PostInfo 객체에 주입되있는 객체(BookInfo)에 접근하여 셋팅
		postInfo.getBookInfo().setBookName("밀실살인게임");
		
		System.out.println("도서명 : " + bookInfo.getBookName());		// 도서명 : 밀실살인게임

		////////////////////////////////////////////////////////////
		
		
		// bean 객체의 scope : prototype ,  default : singleton
		selectUser1 = ctx.getBean("selectUser", SelectUser.class);
		selectUser2 = ctx.getBean("selectUser", SelectUser.class);  
		
		selectUser1.setPhone("010-1234-5678");
		System.out.println("phone : "+selectUser2.getPhone());		// phone : 010-xxxx-xxxx
		
		// bean객체의 method 출력
		selectUser1.printName();									// user name : 박보영
		
	}
}
