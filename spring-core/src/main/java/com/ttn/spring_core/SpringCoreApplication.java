package com.ttn.spring_core;

import com.ttn.spring_core.Q3.Restaurant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringCoreApplication.class, args);

		Restaurant restaurant = applicationContext.getBean(Restaurant.class);
		restaurant.serve();
	}

}
