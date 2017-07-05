package com.beeva.banco.BancoApp;

public class Cliente {
	private String nombre;
	private String apellido; 
	private Cuenta cuenta;
	public Cliente(String Nombre, String Apellido){
		// TODO Auto-generated constructor stub
		nombre = Nombre; 
		apellido = Apellido; 
		
	}
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido; 
	}
	public Cuenta getCuenta(){
		return cuenta; 
	}
	public void setNombre(String n){
		nombre = n;
	}
	public void setCuenta(Cuenta c){
		cuenta = c; 
	}
	public void setApellido(String a){
		apellido = a; 
	}
}
