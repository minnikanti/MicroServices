package microservices.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class ServiceConfig extends GlobalAuthenticationConfigurerAdapter{
	
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("mano").password("mano").roles("USER").and()
		.withUser("anil").password("anil").roles("USER", "OPERATOR");
	}

}
