/* bean 객체 
 * spring container에 생성됨
 * postInfo객체에 injection
 * */

package service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookInfo implements InitializingBean, DisposableBean{

	private String bookName = "미등록자";

	// constructor
	public BookInfo() {}

	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println("DB connection pool open");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("DB connection pool close ");
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
