package com.app.avon.ws.clienteRest;


import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.app.avon.ws.models.entity.MensajeEntity;
import com.app.avon.ws.models.entity.Mensajesdto;

public class RestClient {
	
	
	
	private static final String GET_ALL_MENSAJES ="http://localhost:8080/listarMensaje";
	private static final String SEND_MENSAJES ="http://localhost:8080/enviarMensaje";
	
	static RestTemplate restTempolate = new RestTemplate();
	public static void main(String[] args) {
		
		SendMensajes();
		GetAllMensajes();
		
	}
	
	
	public static void GetAllMensajes(){
		
		HttpHeaders headfers = new HttpHeaders();
		headfers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		
		HttpEntity<String> entity = new HttpEntity<>("parameters",headfers);
		
		ResponseEntity<String> respuesta = restTempolate.exchange(GET_ALL_MENSAJES, HttpMethod.GET, entity, String.class);
		
		System.out.println("MENSAJES ENVIADOS EXISTENTES:"+respuesta);
		
	}
	
	

	public static void SendMensajes(){
		
		
		Mensajesdto mensaje =new Mensajesdto("D964FCED0741B7998B1DBD8327B27397", "D38E7DC8828F983FEDA57E944130DEA4","5539749948","mi me mensaje examen AVON(JOSE MANUEL MORALES TABLAS) PRUEBA REST TEMPLATE");
		
		ResponseEntity<MensajeEntity> mns = restTempolate.postForEntity(SEND_MENSAJES, mensaje, MensajeEntity.class);
		
		
		System.out.println("MENSAJE ENVIADO:"+mns.getBody().toString());
		
	}
	
	

}
