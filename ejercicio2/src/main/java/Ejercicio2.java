public class Ejercicio2 {

    static class Empleado {
        private String nombre;
        protected double salarioBase;

        public Empleado(String nombre, double salarioBase) {
            this.nombre = nombre;
            this.salarioBase = salarioBase;
        }

        public double calcularPago() {
            return salarioBase;
        }

        public String getNombre() {
            return nombre;
        }
    }

    static class EmpleadoTiempoCompleto extends Empleado {
        private double bonoTransporte;

        public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bonoTransporte) {
            super(nombre, salarioBase);
            this.bonoTransporte = bonoTransporte;
        }

        @Override
        public double calcularPago() {
            return salarioBase + bonoTransporte;
        }
    }

    static class EmpleadoPorHoras extends Empleado {
        private int horasTrabajadas;
        private double tarifaPorHora;

        public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
            super(nombre, 0);
            this.horasTrabajadas = horasTrabajadas;
            this.tarifaPorHora = tarifaPorHora;
        }

        @Override
        public double calcularPago() {
            return horasTrabajadas * tarifaPorHora;
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