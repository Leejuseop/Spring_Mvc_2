package hello.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);

		//요청매핑-API예시 부터 보면 됩니당. 그 전까지 한거는 그냥 @GetMapping쓸수있는 방법들 종류 알아봤음.
	}
}
