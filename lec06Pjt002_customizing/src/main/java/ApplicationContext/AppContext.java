package ApplicationContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import service.BookInfo;
import service.PostInfo;
import service.SelectUser;

import service.BookInfo;

/* bean 설정 파일 
 * Bean 객체 설정 및 생성 후 container에 할당 */

@Configuration
public class AppContext {
	
	// [bean설정] setter로 dependency 객체를 injection
	// [bean생성 및 할당] bean생성 후 container로 할당
	@Bean
	public BookInfo bookInfo() {
		BookInfo bookInfo = new BookInfo();
		bookInfo.setISBN(1234567);			// dependency 객체를 injection 할 경우 constructor을 전달함
		return bookInfo;
	}
	
	// [bean설정] constructor로 dependency객체를 injection
	// [bean생성 및 할당] -------위와 동일---------------
	@Bean
	public PostInfo postInfo(BookInfo bookInfo) {
		return new PostInfo(bookInfo());
	}
	
	// [bean설정] prototype scope (defult : singleton)
	// [bean생성 및 할당] -------위와 동일---------------
	@Bean
	@Scope("prototype")
	public SelectUser selectUser() {
		return new SelectUser();
	}
} // AppContext END

