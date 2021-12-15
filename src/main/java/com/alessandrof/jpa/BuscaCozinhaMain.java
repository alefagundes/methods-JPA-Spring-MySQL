package com.alessandrof.jpa;


import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.alessandrof.AlgafoodApiApplication;
import com.alessandrof.domain.models.Cozinha;
import com.alessandrof.domain.repository.CozinhaRepository;

public class BuscaCozinhaMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);
			
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		List<Cozinha> list = cozinhaRepository.searchKitchen();
		
		for(Cozinha kitchen : list) {
			System.out.println(kitchen.getNome());
		}
		
		
	}

}
