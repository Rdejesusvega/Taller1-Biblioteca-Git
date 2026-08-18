package com.mycompany.ejercicio3taller2;

public class empleadoPlanta extends Empleado implements Bonificable {
    
    private final double salarioBase;

    public empleadoPlanta(String nombre, int id, double salarioBase) {
        super(nombre, id);
        this.salarioBase = salarioBase;
    }


    @Override
    public double calcularSalario(){
        return salarioBase + 0.30;
    }
    
    @Override
    public double calcularBono(int calificacion){
        if (calificacion >=4){
            return calcularSalario() * 0.10; 
        }else{
            return 0;
        }
    }
}
