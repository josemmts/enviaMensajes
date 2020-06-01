package com.app.avon.ws.models.entity;

public class Mensajesdto {
	
	private String username;
	private String password;
	private String number;
    private String message;
    
	public Mensajesdto(String username, String password, String number, String message) {
		
		
		this.username = username;
		this.password = password;
		this.number = number;
		this.message = message;
	
		
		
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
