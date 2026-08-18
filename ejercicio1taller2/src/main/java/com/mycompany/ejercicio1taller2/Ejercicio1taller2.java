package com.mycompany.ejercicio1taller2;

import java.util.Scanner;

public class Ejercicio1taller2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[6];

        for (int i = 0; i < vehiculos.length; i++) {

            System.out.println("\nVehiculo #" + (i + 1));
            System.out.println("1. Automovil");
            System.out.println("2. Motocicleta");
            System.out.println("3. Camion");
            System.out.print("Seleccione tipo: ");
            int tipo = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Año: ");
            int año = sc.nextInt();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            if (tipo == 1) {
                System.out.print("Numero de puertas: ");
                int puertas = sc.nextInt();
                vehiculos[i] = new Automoviles(marca, modelo, año, precio, puertas);

            } else if (tipo == 2) {
                System.out.print("Cilindraje: ");
                int cilindrada = sc.nextInt();
                vehiculos[i] = new Motocicletas(marca, modelo, año, precio, cilindrada);

            } else if (tipo == 3) {
                System.out.print("Capacidad en toneladas: ");
                double toneladas = sc.nextDouble();
                vehiculos[i] = new Camiones(marca, modelo, año, precio, (int) toneladas);

            } else {
                System.out.println("Tipo invalido.");
            }

            sc.nextLine(); 
        }

        System.out.println("\n--- RESULTADOS ---");

        for (Vehiculo v : vehiculos) {
            System.out.println(v);
            System.out.println("Impuesto: $" + v.calcularImpuesto());
            System.out.println("---------------------");
        }

        sc.close();
    }
}