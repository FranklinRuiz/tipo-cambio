package com.cambio.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cambio.model.TipoCambio;

@Repository
public interface TipoCambioDao extends CrudRepository<TipoCambio, Long> {
	TipoCambio findByid(Long id);
}
