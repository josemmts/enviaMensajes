package com.app.avon.ws.models.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.avon.ws.models.dao.MensajeDao;
import com.app.avon.ws.models.entity.MensajeEntity;

@Service
public class MensajeServiceImpl implements IMensajeService {

	
	@Autowired
	private MensajeDao mensajeDao;

	@Override
	@Transactional(readOnly = true)
	public List<MensajeEntity> findAll() {

		return (List<MensajeEntity>) mensajeDao.findAll();
	}

	@Override
	@Transactional
	public MensajeEntity save(MensajeEntity mensajeEntity) {
		
		
			return mensajeDao.save(mensajeEntity);

			
			
		
		}
		
		
	



	@Override
	@Transactional(readOnly = true)
	public MensajeEntity findById(Long id) {

		return mensajeDao.findById(id).orElse(null);
	}

}
