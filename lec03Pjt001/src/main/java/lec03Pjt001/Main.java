package lec03Pjt001;

import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
//		Welcome welcome = new Welcome();
//		welcome.print();
		
		
		// 'Xml' 파일에서 설정한 class로 bean을 생성하고 spring container에 할당
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:AppContext.xml");
	 	
		
		// spring container에 보관중인 bean을 꺼냄
		Welcome w = ctx.getBean("welcome", Welcome.class);
		w.print();
		
		// container 닫기
		ctx.close();
	}
	
}
