import java.util.Scanner;

public class ProduccionFabrica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de piezas producidas: ");
        int piezasProducidas = entrada.nextInt();

        double precioPorPieza = 5.0;
        double sueldoBase = piezasProducidas * precioPorPieza;
        double incentivo;

        if (piezasProducidas > 1000) {
            incentivo = sueldoBase * 0.15;
        } else {
            incentivo = sueldoBase * 0.08;
        }

        double pagoFinal = sueldoBase + incentivo;

        System.out.println("Sueldo base: S/" + sueldoBase);
        System.out.println("Incentivo: S/" + incentivo);
        System.out.println("Total a recibir: S/" + pagoFinal);
        entrada.close();
    }
}