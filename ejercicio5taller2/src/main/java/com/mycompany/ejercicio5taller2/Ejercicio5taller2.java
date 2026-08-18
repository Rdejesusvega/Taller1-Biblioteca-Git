package com.mycompany.ejercicio5taller2;
import java.util.ArrayList;

public class Ejercicio5taller2 {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Juan", "1010", 20, "E001", "Sistemas");
        Estudiante e2 = new Estudiante("Maria", "2020", 22, "E002", "Derecho");

        // Agregar materias
        e1.agregarMateria("Programación");
        e1.agregarMateria("Matemáticas");

        e2.agregarMateria("Derecho Penal");
        e2.agregarMateria("Constitucional");

        // Crear profesores
        Profesor p1 = new Profesor("Carlos", "3030", 45, "Sistemas", "Ingeniero");
        Profesor p2 = new Profesor("Ana", "4040", 50, "Derecho", "Doctora");

        // Crear administrativos
        Administrativo a1 = new Administrativo("Luis", "5050", 35, "Secretario", "Académica");
        Administrativo a2 = new Administrativo("Sofia", "6060", 40, "Coordinadora", "Finanzas");
        Administrativo a3 = new Administrativo("Pedro", "7070", 38, "Auxiliar", "Registro");

        // Agregar todos a la lista
        personas.add(e1);
        personas.add(e2);
        personas.add(p1);
        personas.add(p2);
        personas.add(a1);
        personas.add(a2);
        personas.add(a3);

        System.out.println("=== CARNETS ===");
        for (Persona p : personas) {
            System.out.println(p.generarCarnet());
        }

        System.out.println("\n=== PROMEDIOS ESTUDIANTES ===");
        for (Persona p : personas) {
            if (p instanceof Estudiante e) {

                double[] notas = {4.0, 3.5, 4.2, 5.0, 3.8};
                double promedio = e.calcularPromedio(notas);

                System.out.println(e.getNombre() + " Promedio: " + promedio);
            }
        }

        System.out.println("\n=== PROFESORES DE SISTEMAS ===");
        for (Persona p : personas) {
            if (p instanceof Profesor prof) {

                if (prof.getDepartamento().equals("Sistemas")) {
                    System.out.println(prof.getNombre());
                }
            }
        }

        int est = 0, prof = 0, adm = 0;

        for (Persona p : personas) {
            if (p instanceof Estudiante) est++;
            else if (p instanceof Profesor) prof++;
            else if (p instanceof Administrativo) adm++;
        }

        System.out.println("\n=== CONTEO ===");
        System.out.println("Estudiantes: " + est);
        System.out.println("Profesores: " + prof);
        System.out.println("Administrativos: " + adm);
    }
}