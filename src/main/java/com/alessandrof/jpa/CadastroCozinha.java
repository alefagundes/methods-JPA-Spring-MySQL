package com.alessandrof.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alessandrof.domain.models.Cozinha;

@Component
public class CadastroCozinha {
	
	@PersistenceContext
	private EntityManager menager;
	
	public List<Cozinha> searchKitchen(){
		return menager.createQuery("from Cozinha", Cozinha.class).getResultList();
	
	}
	
	@Transactional //in start method infor that this is a function transactional.
	public Cozinha save(Cozinha obj) {
		return menager.merge(obj);
		
	}
	
	public Cozinha findById(Long id) {
		return menager.find(Cozinha.class, id);
	}
	
	@Transactional
	public void remove(Cozinha obj) {
		obj = findById(obj.getId());
		menager.remove(obj);
	}

}
