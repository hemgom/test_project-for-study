package hello.postmanApiTest;

import hello.postmanApiTest.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(Config.class)
@SpringBootApplication(scanBasePackages = "hello.postmanApiTest.controller")
public class PostmanApiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostmanApiTestApplication.class, args);
	}

}
