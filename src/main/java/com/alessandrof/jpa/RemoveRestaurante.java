package com.alessandrof.jpa;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.alessandrof.AlgafoodApiApplication;
import com.alessandrof.domain.models.Restaurante;
import com.alessandrof.domain.repository.RestaurantRepository;

public class RemoveRestaurante {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);
			
		RestaurantRepository restRepository = applicationContext.getBean(RestaurantRepository.class);
		
		Restaurante obj = restRepository.findById(1L);
		
		restRepository.remote(obj);
		
	}

}
