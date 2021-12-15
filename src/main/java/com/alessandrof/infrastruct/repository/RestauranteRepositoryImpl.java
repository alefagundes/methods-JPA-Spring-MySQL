package com.alessandrof.infrastruct.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alessandrof.domain.models.Restaurante;
import com.alessandrof.domain.repository.RestaurantRepository;

@Component
public class RestauranteRepositoryImpl implements RestaurantRepository{
	
	@PersistenceContext
	private EntityManager menager;

	@Override
	public List<Restaurante> findAll() {
		return menager.createQuery("from Restaurante", Restaurante.class).getResultList();
	}

	@Override
	public Restaurante findById(Long id) {
		return menager.find(Restaurante.class, id);
	}

	@Override
	@Transactional
	public Restaurante save(Restaurante obj) {
		return menager.merge(obj);
	}

	@Override
	@Transactional
	public void remote(Restaurante obj) {
		obj = findById(obj.getId());
		menager.remove(obj);	
	}

}
