package com.mycompany.ejercicio4taller2;

class Triangulo extends Figura{
    
    private final  double lado1;
    private final  double lado2;
    private final  double lado3;

    public Triangulo(double lado1, double lado2, double lado3, String color) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3= lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
    @Override
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return (lado1+lado2+lado3);
    }
}
