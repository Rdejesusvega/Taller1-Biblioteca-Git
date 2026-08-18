package com.mycompany.ejercicio5taller2;

import java.util.ArrayList;

public class Profesor extends Persona{
    
    protected String departamento;
    protected String titulo;
    private final ArrayList<String> cursos;

    public Profesor(String nombre, String cedula, int edad,
                String departamento, String titulo) {
    super(nombre, cedula, edad);
    this.departamento = departamento;
    this.titulo = titulo;
    this.cursos = new ArrayList<>();
}

    public String getDepartamento() {
        return departamento;
    }

    }
