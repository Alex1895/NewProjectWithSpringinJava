package mainHelloWorld.helloWorldApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class helloWorldApp {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(helloWorldApp.class, args);
		HelloWorld hw = (HelloWorld) ctx.getBean("helloWorld");
		hw.sayHello();
	}
}
