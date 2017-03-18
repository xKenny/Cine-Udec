/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.udec.datos;

/**
 *
 * @author user
 */
public class Persona {
    /*atributos de la clase*/
    private String nombre;
    private int edad;
    private int nroDocumento;
    private String genero;
    
    /**
     * constructor
     * @param nombre
     * @param edad
     * @param nroDocumento
     * @param genero 
     */
    public Persona(String nombre, int edad, int nroDocumento, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.nroDocumento = nroDocumento;
        this.genero = genero;
    }
    public String mostrar(){
        return ""+nombre+" de "+edad+" años de edad, identificado con el documento "+nroDocumento+" de genero "+genero+"";
    }
     public double validarPrecio(){
       if(edad<12){
           return 5000;
       }else{
           return 8000;
       }
    }
    /*metodos getter and setter*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
