/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.udec.datos;

import java.util.Scanner;

/**
 * @author kenny & David 
 */
public class Sillas {
    private Scanner teclado;
    /**
     * Atributos de la clase
     */
    private int nroSilla;
    
    /**
     *constructor
     * @param nroSilla
     */
    public Sillas(int nroSilla){
        teclado = new Scanner(System.in);
        this.nroSilla = nroSilla;

    }
    public void datosSilla(){
        String nombre, genero, desea;
        int edad, nroDocumento;
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.next();
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.print("Ingrese su numero de documento: ");
        nroDocumento = teclado.nextInt();
        System.out.print("Ingrese su genero: ");
        genero = teclado.next();
        System.out.println("\nPelicula:TITANIC\nDirector:James Cameron\nDuracion:195min\nAño:1997");
        Persona persona = new Persona(nombre,edad,nroDocumento,genero);
        System.out.println("El precio de la boleta es de :"+persona.validarPrecio()+"");
        System.out.print("desea hacer la compra?: (si/no)");
        desea = teclado.next();
        if("si".equals(desea)){
            System.out.println("la boleta en la silla numero "+nroSilla+" ha sido comprada por "+persona.mostrar()+"");
        }
        
    }
    /*Metodos Getter and Setter*/
    public int getNroSilla() {
        return nroSilla;
    }

    public void setNroSilla(byte nroSilla) {
        this.nroSilla = nroSilla;
    }
    
}
