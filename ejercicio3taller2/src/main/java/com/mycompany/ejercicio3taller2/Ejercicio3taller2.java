package com.mycompany.ejercicio3taller2;
import java.util.ArrayList;

public class Ejercicio3taller2 {
    public static void main(String[] args) {
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new empleadoPlanta("Juan", 1, 200000));
        empleados.add(new empleadoPlanta("Sofia", 4, 250000));
        empleados.add(new Contratista("Luis", 3, 20000, 80));
        empleados.add(new Contratista("Marta", 4, 18000, 90));
        empleados.add(new Practicante("Carlos", 5, 800000));
        empleados.add(new Practicante("Pedro", 6, 900000));
        
        double nominaTotal = 0;
        
        System.out.println("NOMINA");
        
        for (Empleado e : empleados ){
            double salario = e.calcularSalario();
            nominaTotal += salario;
            System.out.println(e.getNombre() + "  ->" + salario);
        }
            System.out.println("Total nomina: " + nominaTotal);
            System.out.println("'\n Empleados con Bono (calificación >=4)");
            
            int calificacion = 4;
            
            for (Empleado e : empleados){
                if (e instanceof Bonificable){
                    double bono = ((Bonificable) e) .calcularBono(calificacion);
                    if(bono > 0){
                        System.out.println(e.getNombre() + "recibe bono: " + bono);
                    }
                }
                
            }
        
    }
}
