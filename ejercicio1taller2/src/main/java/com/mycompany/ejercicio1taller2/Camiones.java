package com.mycompany.ejercicio1taller2;    

class Camiones extends Vehiculo{
    protected int capacidadToneladas;

    public Camiones(String Marca, String Modelo, int capacidadToneladas, double Precio, int Año) {
        super(Marca, Modelo, Precio, Año);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularImpuesto() {
        return Precio * 0.20;
    }

    @Override
    public String toString() {
        return "Automovil: " + Marca + " " + 
                "Modelo: " + Modelo + " " + "año: " + Año + " " +
                "Numero de puertas: " + capacidadToneladas + " " + "Precio: " + Precio;
    }
}

