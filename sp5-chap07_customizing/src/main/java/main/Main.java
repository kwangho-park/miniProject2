package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.Print;
import bean.PrintLogin;
import config.AppCtx;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

		PrintLogin login = ctx.getBean("printLogin", PrintLogin.class);
		Print post = ctx.getBean("printPost", Print.class);

		login.print();
		post.print();

		ctx.close();
	}
}
