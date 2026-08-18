package com.mycompany.ejercicio5taller2;

import java.util.ArrayList;

public class Estudiante extends Persona implements Evaluable {
    
    private final String codigo;
    private final String programa;
    private final ArrayList<String> materias;

   public Estudiante(String nombre, String cedula, int edad,
                  String codigo, String programa) {
    super(nombre, cedula, edad);
    this.codigo = codigo;
    this.programa = programa;
    this.materias = new ArrayList<>();
}

    
    @Override
    public double calcularPromedio(double[] notas) {
    double suma = 0;
    for (double nota : notas) {
        suma += nota;
    }
    return suma / notas.length;
  
}

    }
