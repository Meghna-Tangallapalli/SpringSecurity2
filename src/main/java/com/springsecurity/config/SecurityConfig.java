package com.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests().anyRequest().authenticated(); http.formLogin();
	 * http.httpBasic(); }
	 */
	
	  @Override 
	  protected void configure(HttpSecurity http) throws Exception {	  
			http.authorizeRequests()
			.antMatchers("/statement").authenticated()
			.antMatchers("/loan").authenticated()
					.antMatchers("/balance").authenticated()
					.antMatchers("/home").permitAll()
					.antMatchers("/contact").permitAll()
					.and().formLogin()
					.and().httpBasic();
	  	  
	  }
	 		
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication()
				.withUser("shlok").password("shlok123").authorities("admin").and()
				.withUser("sai").password("sai123").authorities("read").and()
				.withUser("ravi").password("ravi123").authorities("read").and()
				.passwordEncoder(NoOpPasswordEncoder.getInstance());
		}
	
}
