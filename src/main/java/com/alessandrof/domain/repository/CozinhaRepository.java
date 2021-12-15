package com.alessandrof.domain.repository;

import java.util.List;

import com.alessandrof.domain.models.Cozinha;

public interface CozinhaRepository {
	
	List<Cozinha> searchKitchen();
	Cozinha findById(Long id);
	Cozinha save(Cozinha kitchen);
	void remove(Cozinha kitchen);
	
}
