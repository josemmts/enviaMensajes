package com.app.avon.ws.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mensajeJmorales")
public class MensajeEntity implements Serializable {
	
	
	
	private static final long serialVersionUID = -7089497426643376153L;
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	private String username;
	private String password;
	
	
	private String number;
    private String message;
    
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
    
    
    
    
    
    

}
