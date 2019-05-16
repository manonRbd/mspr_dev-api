package fr.mspr.dev.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

@SpringBootApplication
public class ApiApplication {
	@Configuration
	static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http ) throws Exception {
			http
					.httpBasic().disable()
					.csrf().disable();
		}
	}


	@Configuration
	public class RestConfiguration implements RepositoryRestConfigurer {

		@Autowired
		private EntityManager entityManager;

		@Override
		public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
			config.exposeIdsFor(
					entityManager.getMetamodel().getEntities().stream()
							.map(Type::getJavaType)
							.toArray(Class[]::new));
		}
	}

	public static void main( String[] args ) {
		SpringApplication.run( ApiApplication.class, args );
	}
}
