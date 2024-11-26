package egovframework.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "egovframework.example")
//@MapperScan(basePackages = "egovframework.example.dao") // DAO 패키지 경로
public class EgovBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EgovBootApplication.class, args);
		System.out.println(context.getBeanDefinitionNames());
	}

}
