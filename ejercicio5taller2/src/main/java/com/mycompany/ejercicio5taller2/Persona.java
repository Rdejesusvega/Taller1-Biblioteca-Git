package com.mycompany.ejercicio5taller2;

public abstract class Persona implements Identificable{
    
    protected String nombre;
    protected String cedula;
    protected int edad;

    public Persona(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }
    
    @Override
    public String generarCarnet(){
        return "nombre "+nombre+" Cedula "+" edad: "+edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }    
}
