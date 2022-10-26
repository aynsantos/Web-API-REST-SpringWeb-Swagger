package dio.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class MyWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebApiApplication.class, args);
	}

}
