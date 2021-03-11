package br.com.kvmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@SpringBootApplication
public class FullstackApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FullstackApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://kvmedia.com.br");
				registry.addMapping("/**").allowedOrigins("https://localhost");
				registry.addMapping("/**").allowedOrigins("http://localhost");
				registry.addMapping("/**").allowedOrigins("localhost");
			}
		};
	}
}
