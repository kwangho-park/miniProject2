// 스프링 설정파일 : spring container 에 bean 객체를 생성 //
// lec03Pjt001 에서 appContext.xml 의 역활

package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	@Bean
	public Welcome welcome() {
		return new Welcome();
	}
	

}
