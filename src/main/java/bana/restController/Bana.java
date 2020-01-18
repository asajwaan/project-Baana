package bana.restController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Bana extends SpringBootServletInitializer{

	public static void main(String[] args)
	{
		SpringApplication.run(Bana.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(Bana.class);
	}


}