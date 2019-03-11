/* bean 설정 파일 
 * Bean 객체 설정 및 생성 후 container에 할당 */


package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import service.BookInfo;
import service.LoginUser;
import service.PostInfo;
import service.SelectUser;


@Configuration
public class AppContext {
	
	// dependency 객체 (=bean객체)
	@Bean
	public BookInfo bookInfo() {
		return new BookInfo();
	}
	
	// bean객체
	@Bean
	public PostInfo postInfo() {
		return new PostInfo();
	}
	
	////////////////////////////////////////////////////////////////////
	
	
	// dependency 객체 (=bean객체)	
	// Qualifier 로 dependency 객체를 injection 할 bean 객체를 명시	
	@Bean	
	@Qualifier("login")
	public LoginUser loginUser1() {
		return new LoginUser();
	}
	@Bean
	public LoginUser loginUser2() {
		return new LoginUser();
	}

	
	// bean객체
	@Bean	
	public SelectUser selectUser() {
		return new SelectUser();
	}	
	
	
	
} // AppContext END

