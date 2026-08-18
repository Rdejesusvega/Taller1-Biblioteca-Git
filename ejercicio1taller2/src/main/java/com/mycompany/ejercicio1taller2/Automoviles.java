package com.mycompany.ejercicio1taller2;

class Automoviles extends Vehiculo{
    private final int numeroPuertas;

    public Automoviles(String Marca, String Modelo, int numeroPuertas, double Precio, int Año) {
        super(Marca, Modelo, Precio, Año);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public double calcularImpuesto() {
        return Precio * 0.10;
    }

    @Override
    public String toString() {
        return  "Automovil: " + Marca + " " + 
                "Modelo: " + Modelo + " " + "año: " + Año + " " +
                "Numero de puertas: " +numeroPuertas + " " + "Precio: " + Precio;
    }
}
