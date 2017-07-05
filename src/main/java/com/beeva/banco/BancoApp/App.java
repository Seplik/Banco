package com.beeva.banco.BancoApp;

import com.beeva.app.calculadora.Operaciones;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Operaciones op = new Operaciones();
        System.out.println("Operaciones : " + op.suma(30, 5)); 
        
    }
}
