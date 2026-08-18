package com.mycompany.ejercicio4taller2;

class Esfera extends Figura implements Tridimensional{
    
    private final double radio;

    public Esfera(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    @Override
    public double calcularArea() {
       return 4*(3.1416)*(radio*radio);
    }

    @Override
    public double calcularPerimetro() {
        return 2*(3.1416)*radio;
    }

    @Override
    public double calcularVolumen() {
        return 4/3*(3.1416)*(radio*radio*radio);
    }
}
