package micorservices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcouldM2ConfigserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcouldM2ConfigserverGitApplication.class, args);
	}
}
