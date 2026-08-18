package com.mycompany.ejercicio1taller2;

public abstract class Vehiculo {
        protected String Marca;
        protected String Modelo;
        protected double Precio;
        protected int Año;

    public Vehiculo(String Marca, String Modelo, double Precio, int Año) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
        this.Año = Año;
    }
    public abstract double calcularImpuesto() ;
    
    @Override
    public abstract String toString();
}
