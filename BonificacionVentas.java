import java.util.Scanner;

public class BonificacionVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto total de ventas: ");
        double montoVentas = entrada.nextDouble();

        double bonificacion;

        if (montoVentas > 5000) {
            bonificacion = montoVentas * 0.10;
        } else {
            bonificacion = montoVentas * 0.05;
        }

        double totalRecibir = montoVentas + bonificacion;

        System.out.println("Bonificación obtenida: S/" + bonificacion);
        System.out.println("Monto total recibido: S/" + totalRecibir);
        entrada.close();
    }
}