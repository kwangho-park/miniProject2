package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import service.BookInfo;

@Configuration
public class AppContext {
	
	@Bean
	public BookInfo bookInfo() {
		return new BookInfo();
	}
}
