package com.mycompany.ejercicio1taller2;

 class Motocicletas extends Vehiculo {
    protected int Cilindrada;

    public Motocicletas(String Marca, String Modelo, int Cilindrada, double Precio, int Año) {
        super(Marca, Modelo, Precio, Año);
        this.Cilindrada = Cilindrada;
    }

    @Override
    public double calcularImpuesto() {
        return Precio * 0.05;
    }

    @Override
    public String toString() {
        return "Automovil: " + Marca + " " + 
                "Modelo: " + Modelo + " " + "año: " + Año + " " +
                "Numero de puertas: " + Cilindrada + " " + "Precio: " + Precio;
    }
}
