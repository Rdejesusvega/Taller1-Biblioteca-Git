package com.mycompany.ejercicio4taller2;

public class Cilindro extends Figura implements Tridimensional{
    
    private final double radio;
    private final double altura;

    public Cilindro(double radio, double altura, String color) {
        super(color);
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return 2*(3.1416)*radio*(radio+altura);
    }

    @Override
    public double calcularVolumen() {
        return (3.1416)*(radio*radio)*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(3.1416)*radio;
    }
}
