import java.util.Scanner;

public class TarifaTaxi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese los kilómetros recorridos: ");
        double kilometrosRecorridos = entrada.nextDouble();

        double tarifaTotal;

        if (kilometrosRecorridos <= 3) {
            tarifaTotal = 8.0;
        } else {
            double kilometrosAdicionales = kilometrosRecorridos - 3;
            tarifaTotal = 8.0 + (kilometrosAdicionales * 2.50);
        }

        System.out.println("Total a pagar por la tarifa de taxi: S/" + tarifaTotal);
        entrada.close();
    }
}