package com.app.avon.ws.models.service;

import java.util.List;

import com.app.avon.ws.models.entity.MensajeEntity;

public interface IMensajeService {
	
	public List<MensajeEntity> findAll();
	
	public MensajeEntity save(MensajeEntity mensajeEntity);
	
	public MensajeEntity findById(Long id);
	
}
