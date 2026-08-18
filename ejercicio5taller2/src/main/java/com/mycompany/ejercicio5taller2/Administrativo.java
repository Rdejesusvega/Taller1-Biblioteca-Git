package com.mycompany.ejercicio5taller2;

public class Administrativo extends Persona{
    
    protected String cargo;
    protected String area;

    public Administrativo(String cargo, String area, int edad, String nombre, String cedula) {
        super(nombre, cedula, edad);
        this.cargo = cargo;
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public String getArea() {
        return area;
    }
}
