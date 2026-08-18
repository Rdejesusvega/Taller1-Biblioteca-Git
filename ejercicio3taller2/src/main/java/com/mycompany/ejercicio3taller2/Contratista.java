package com.mycompany.ejercicio3taller2;

public class Contratista extends Empleado{
    
    private final double valorHora;
    private final int horasTrabajadas;

    public Contratista(String nombre, int id, double valorHora, int horasTrabajadas) {
        super(nombre, id);
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSalario(){
        return valorHora * horasTrabajadas;
    }  
}
