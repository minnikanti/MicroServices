package micorservices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcouldM1StartupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcouldM1StartupApplication.class, args);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="greeting")
	public String sayHello() {
		return "Hello from spring boot..";
	}
}
