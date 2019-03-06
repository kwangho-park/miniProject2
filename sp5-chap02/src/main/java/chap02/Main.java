package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// spring container에 AppContext class에 정의된 Bean객체를 생성 및 할당
		AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext(AppContext.class);
		
		// container에서 Bean객체의 참조값을 반환
		Welcome w = ctx.getBean("welcome", Welcome.class);
		w.print();
		
		// container 닫기
		ctx.close();

	}
}
