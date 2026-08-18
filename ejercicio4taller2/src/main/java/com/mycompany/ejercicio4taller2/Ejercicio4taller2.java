package com.mycompany.ejercicio4taller2;

public class Ejercicio4taller2 {
    public static void main(String[] args) {

        // Arreglo de figuras
        Figura[] figuras = new Figura[8];

        figuras[0] = new Circulo(5, "Rojo");
        figuras[1] = new Rectangulo(4, 6, "Azul");
        figuras[2] = new Triangulo(3, 4, 3,"Verde");
        figuras[3] = new Circulo(2.5, "Amarillo");
        figuras[4] = new Rectangulo(7, 3,"Negro");
        figuras[5] = new Esfera(3,"Blanco");
        figuras[6] = new Cilindro(2, 5,"Gris");
        figuras[7] = new Esfera(4, "Morado");

        // Recorrer el arreglo
        for (Figura f : figuras) {

            System.out.println("Color: " + f.getColor());
            System.out.println("Área: " + f.calcularArea());
            System.out.println("Perímetro: " + f.calcularPerimetro());

            // Si es tridimensional, calcular volumen
            if (f instanceof Tridimensional) {
                Tridimensional t = (Tridimensional) f;
                System.out.println("Volumen: " + t.calcularVolumen());
            }

            System.out.println("---------------------------");
        }

        // Encontrar figura con mayor área
        Figura mayor = figuras[0];

        for (Figura f : figuras) {
            if (f.calcularArea() > mayor.calcularArea()) {
                mayor = f;
            }
        }

        System.out.println("Figura con mayor área:");
        System.out.println("Color: " + mayor.getColor());
        System.out.println("Área: " + mayor.calcularArea());
    }
}
