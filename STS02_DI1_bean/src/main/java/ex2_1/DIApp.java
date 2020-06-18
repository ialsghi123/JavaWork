package ex2_1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DIApp {

	public static void main(String[] args) {
		System.out.println("Main 시작");
		
		GenericXmlApplicationContext ctx
			= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("--컨테이너 생성--");
			
		
	}

}
