/* bean 객체 
 * spring container에 생성됨
 * */

package service;

import org.springframework.beans.factory.annotation.Autowired;

public class PostInfo {

	private int number = 1;
	private String title = "인생 띵작";

	// 1. 해당 PostInfo bean을 container에 생성 (기본 constructor를 사용)
	// 2. spring container에서 type이 일치하는 Bean(dependency객체)를 찾아서 injection
	@Autowired
	private BookInfo bookInfo;
	
	
	// constructor	
	public PostInfo() {}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public BookInfo getBookInfo() {
		return bookInfo;
	}
	
	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}	
}
