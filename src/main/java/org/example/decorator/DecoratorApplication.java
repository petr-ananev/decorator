package org.example.decorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DecoratorApplication {

    public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DecoratorApplication.class, args);
		EntryPoint entryPoint = run.getBean(EntryPoint.class);
		entryPoint.hereWeGo();
	}

}
