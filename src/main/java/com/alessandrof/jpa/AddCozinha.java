package com.alessandrof.jpa;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.alessandrof.AlgafoodApiApplication;
import com.alessandrof.domain.models.Cozinha;
import com.alessandrof.domain.repository.CozinhaRepository;

public class AddCozinha {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);
			
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha kitchen1 = new Cozinha(null, "maxican");
		
		Cozinha kitchen2 = new Cozinha(null, "japonese");
		
		cozinhaRepository.save(kitchen1);
		cozinhaRepository.save(kitchen2);
		
	}

}
