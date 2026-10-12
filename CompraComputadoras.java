import java.util.Scanner;

public class CompraComputadoras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de computadoras: ");
        int cantidadComputadoras = entrada.nextInt();

        double precioUnitario = 2500.0;
        double importeBruto = cantidadComputadoras * precioUnitario;
        double montoDescuento;

        if (cantidadComputadoras >= 5) {
            montoDescuento = importeBruto * 0.12;
        } else {
            montoDescuento = importeBruto * 0.05;
        }

        double totalPagar = importeBruto - montoDescuento;

        System.out.println("Importe bruto: S/" + importeBruto);
        System.out.println("Descuento: S/" + montoDescuento);
        System.out.println("Total a pagar: S/" + totalPagar);
        entrada.close();
    }
}