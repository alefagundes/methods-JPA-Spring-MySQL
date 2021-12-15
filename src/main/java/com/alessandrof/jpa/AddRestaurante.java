package com.alessandrof.jpa;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.alessandrof.AlgafoodApiApplication;
import com.alessandrof.domain.models.Restaurante;
import com.alessandrof.domain.repository.RestaurantRepository;

public class AddRestaurante {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);
			
		RestaurantRepository restRepository = applicationContext.getBean(RestaurantRepository.class);
		
		Restaurante r1 = new Restaurante(null, "maxican", null);
		
		Restaurante r2 = new Restaurante(null, "japonese", null);
		
		restRepository.save(r1);
		restRepository.save(r2);
		
	}

}
