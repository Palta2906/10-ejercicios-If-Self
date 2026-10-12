import java.util.Scanner;

public class ConsumoElectrico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese los kWh consumidos: ");
        double kwhConsumidos = entrada.nextDouble();

        double montoPagar;

        if (kwhConsumidos <= 100) {
            montoPagar = kwhConsumidos * 0.80;
        } else {
            double excesoKwh = kwhConsumidos - 100;
            montoPagar = (100 * 0.80) + (excesoKwh * 1.20);
        }

        System.out.println("El monto a pagar por consumo eléctrico es: S/" + montoPagar);
        entrada.close();
    }
}