package hello.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);

		//요청파라미터를 받는 방법 - @RequestParam, @ModelAttribute.       Http메시지 바디를 읽어 오는 방법 - @RequestBodyㄴ
		//Http요청 메시지 - JSON부터 보면됨 그니까 지금 뭐하고 있는거냐면 데이터를 받아오는 방법을 배우는중.
	}
}
