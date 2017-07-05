package com.beeva.banco.BancoApp;

public class CuentaAhorro extends  {
	
		super(balance);
		// TODO Auto-generated constructor stub
	}
	public boolean Retiro(double cantidad){
		boolean bandera = false;
		if(balance < cantidad){
			balance -=cantidad; 
			bandera = true; 
		}
		
		return bandera; 
	}
 }	
}
