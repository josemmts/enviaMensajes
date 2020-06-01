package com.app.avon.ws.controller;

import java.text.MessageFormat;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.avon.ws.models.entity.MensajeEntity;
import com.app.avon.ws.models.service.IMensajeService;

@RestController
public class MensajeController {

	@Autowired
	private IMensajeService mensajeService;

	@GetMapping("/listarMensaje")
	public List<MensajeEntity> listarMensaje() {

		return mensajeService.findAll();

	}

	@PostMapping("/enviarMensaje")
	@ResponseStatus(HttpStatus.CREATED)

	public MensajeEntity enviarSave(@RequestBody MensajeEntity mensajeEntity) {

		if (mensajeEntity.getUsername().equals("D964FCED0741B7998B1DBD8327B27397")
				&& (mensajeEntity.getPassword().equals("D38E7DC8828F983FEDA57E944130DEA4"))) {
			return mensajeService.save(mensajeEntity);

		}

		MensajeEntity userInvalid = new MensajeEntity();
		userInvalid.setUsername("{\"success\":\"false\",\"code\":201,\"descripcion\":\"Incorrect user or password\"}");

		return userInvalid;

	}

	@GetMapping("/ver{id}")
	public MensajeEntity mensajeDetalle(@PathVariable Long id) {

		MensajeEntity mensajeEntity = mensajeService.findById(id);

		return mensajeEntity;

	}

	@PutMapping("/updateMensaje/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public MensajeEntity updateMensaje(@RequestBody MensajeEntity mensajeEntity, @PathVariable Long id) {

		MensajeEntity mensajeEntityDB = mensajeService.findById(id);

		mensajeEntityDB.setMessage(mensajeEntity.getMessage());

		return mensajeService.save(mensajeEntityDB);

	}

}
