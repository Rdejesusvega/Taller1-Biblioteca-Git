package com.mycompany.ejercicio3taller2;

public abstract class Empleado {
    
    private final String nombre;
    private final int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public abstract double calcularSalario();
    public String getNombre() {
        return nombre;
    }
    
    public int getId() {
        return id;
    }
}

