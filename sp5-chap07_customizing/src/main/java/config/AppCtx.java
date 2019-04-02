package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.TimeAspect;
import bean.PrintLogin;
import bean.PrintPost;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {

	@Bean
	public TimeAspect timeAspect() {
		return new TimeAspect();
	}

	@Bean
	public PrintLogin printLogin() {
		return new PrintLogin();
	}
	
	@Bean
	public PrintPost printPost() {
		return new PrintPost();
	}
	
}// AppCtx END
