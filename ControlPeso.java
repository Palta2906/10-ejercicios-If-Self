import java.util.Scanner;

public class ControlPeso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete (kg): ");
        double pesoPaquete = entrada.nextDouble();

        double limitePeso = 50.0;

        if (pesoPaquete <= limitePeso) {
            System.out.println("El paquete cumple con el límite permitido.");
        } else {
            double kilosExcedidos = pesoPaquete - limitePeso;
            System.out.println("El paquete sobrepasa el límite por: " + kilosExcedidos + " kg.");
        }

        entrada.close();
    }
}