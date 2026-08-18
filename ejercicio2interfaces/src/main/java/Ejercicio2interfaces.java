public class Ejercicio2interfaces {

    interface Empleado {
        String getNombre();
        double calcularPago();
    }

    static class EmpleadoTiempoCompleto implements Empleado {
        private String nombre;
        private double salarioBase;
        private double bonoTransporte;

        public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bonoTransporte) {
            this.nombre = nombre;
            this.salarioBase = salarioBase;
            this.bonoTransporte = bonoTransporte;
        }

        @Override
        public String getNombre() {
            return nombre;
        }

        @Override
        public double calcularPago() {
            return salarioBase + bonoTransporte;
        }
    }

    static class EmpleadoPorHoras implements Empleado {
        private String nombre;
        private int horasTrabajadas;
        private double tarifaPorHoras;

        public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHoras) {
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.tarifaPorHoras = tarifaPorHoras;
        }

        @Override
        public String getNombre() {
            return nombre;
        }

        @Override
        public double calcularPago() {
            return horasTrabajadas * tarifaPorHoras;
        }
    }

    public static void imprimirRecibo(Empleado e) {
        System.out.println("Empleado: " + e.getNombre());
        System.out.println("Pago: $" + e.calcularPago());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        Empleado[] lista = new Empleado[2];

        lista[0] = new EmpleadoTiempoCompleto("Carlos", 1200000, 150000);
        lista[1] = new EmpleadoPorHoras("Ana", 40, 20000);

        for (int i = 0; i < lista.length; i++) {
            imprimirRecibo(lista[i]);
        }
    }
}