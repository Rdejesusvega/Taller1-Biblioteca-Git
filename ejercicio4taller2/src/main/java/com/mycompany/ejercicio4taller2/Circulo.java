package com.mycompany.ejercicio4taller2;

class Circulo extends Figura {
    
    private final double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    } 

    @Override
    public double calcularArea() {
        return (3.1416) * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (3.1416) * radio;
    }
}

