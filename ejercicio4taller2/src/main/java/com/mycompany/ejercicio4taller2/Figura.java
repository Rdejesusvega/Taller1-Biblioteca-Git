package com.mycompany.ejercicio4taller2;

public abstract class Figura implements Calculable{
    
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract double calcularArea() ;

    @Override
    public abstract double calcularPerimetro();

}
