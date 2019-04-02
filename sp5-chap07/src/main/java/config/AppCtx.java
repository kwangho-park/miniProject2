
package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.ExeTimeAspect;
import cal.Calculator;
import cal.RecCalculator;

// bean 설정 파일
@Configuration
@EnableAspectJAutoProxy
public class AppCtx {

	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	@Bean
	public Calculator calculator() {
		return new RecCalculator();
	}
	
}// AppCtx END
