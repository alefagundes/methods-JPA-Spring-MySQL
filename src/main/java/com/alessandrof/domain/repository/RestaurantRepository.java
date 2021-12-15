package com.alessandrof.domain.repository;

import java.util.List;

import com.alessandrof.domain.models.Restaurante;

public interface RestaurantRepository {

	List<Restaurante> findAll();
	Restaurante findById(Long id);
	Restaurante save(Restaurante obj);
	void remote(Restaurante obj);
}
