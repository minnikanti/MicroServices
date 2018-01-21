package microservices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringcloudM5ZipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM5ZipkinserverApplication.class, args);
	}
}
