package fr.mspr.dev.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ApiApplication {

	@Configuration
	static class GlobalSecurityConfig extends GlobalAuthenticationConfigurerAdapter {
		@Override
		public void init( AuthenticationManagerBuilder auth ) throws Exception {
			PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
			auth.inMemoryAuthentication()
					.withUser( "app" ).password( encoder.encode( "9v9uf68k" ) ).roles( "USER" );
		}
	}

	@Configuration
	static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(HttpSecurity http ) throws Exception {
			http
					.httpBasic().disable()
					.csrf().disable();
		}
	}

	public static void main( String[] args ) {
		SpringApplication.run( ApiApplication.class, args );
	}
}
