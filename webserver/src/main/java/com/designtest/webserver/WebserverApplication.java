package com.designtest.webserver;

import com.designtest.webserver.domain.model.Test;
import com.designtest.webserver.domain.model.Test1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserverApplication.class, args);
//		Test test = new Test(
//				new Test1("test"),
//				null
//		);
//		System.out.println("result : " + test.getTest2());
	}

}

//@SpringBootApplication
//@RestController
//public class WebserverApplication {
//
//	@RequestMapping("/")
//	public String home() {
//		return "Hello Docker World";
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(WebserverApplication.class, args);
//	}
//}