package microservices.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;

@SpringBootApplication
public class SpringcloudM4SecurecliApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM4SecurecliApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Starting CRON job..");
		
		ResourceOwnerPasswordResourceDetails resourceDetails = new ResourceOwnerPasswordResourceDetails();
		resourceDetails.setAuthenticationScheme(AuthenticationScheme.header);
		resourceDetails.setAccessTokenUri("http://localhost:9000/services/oauth/token");
		
		resourceDetails.setScope(Arrays.asList("toll_read"));
		
		resourceDetails.setClientId("minnikanti");
		resourceDetails.setClientSecret("minnikanti");
		
		resourceDetails.setUsername("anil");
		resourceDetails.setPassword("anil");
		
		OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resourceDetails);
		String token = restTemplate.getAccessToken().toString();
		System.out.println("CLI Token:" + token);
		
		String s = restTemplate.getForObject("http://localhost:9001/services/tolldata", String.class);
		System.out.println("CLI Result:" + s);
		
	}
	
}
