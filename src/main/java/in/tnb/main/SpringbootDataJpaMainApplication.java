package in.tnb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.tnb.service.User;

@SpringBootApplication
@EntityScan(basePackages = "in.tnb.service")
public class SpringbootDataJpaMainApplication {

	public static void main(String[] args) {
	   SpringApplication.run(SpringbootDataJpaMainApplication.class, args);

		
	}

}
