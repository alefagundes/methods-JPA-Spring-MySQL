package com.alessandrof.infrastruct.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alessandrof.domain.models.Cozinha;
import com.alessandrof.domain.repository.CozinhaRepository;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository{

	@PersistenceContext
	private EntityManager menager;
	
	@Override
	public List<Cozinha> searchKitchen(){
		return menager.createQuery("from Cozinha", Cozinha.class).getResultList();
	
	}
	@Override
	@Transactional //in start method infor that this is a function transactional.
	public Cozinha save(Cozinha obj) {
		return menager.merge(obj);
		
	}
	
	@Override
	public Cozinha findById(Long id) {
		return menager.find(Cozinha.class, id);
	}
	
	@Override
	@Transactional
	public void remove(Cozinha obj) {
		obj = findById(obj.getId());
		menager.remove(obj);
	}

	
}
