package com.mycompany.ejercicio3taller2;

public  class Practicante extends Empleado{
    
    private final double auxilio;

    public Practicante(String nombre, int id, double auxilio) {
        super(nombre, id);
        this.auxilio = auxilio;
    }

    @Override
    public double calcularSalario() {
        return auxilio;
    }
}
