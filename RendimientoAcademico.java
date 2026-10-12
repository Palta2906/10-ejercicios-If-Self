import java.util.Scanner;

public class RendimientoAcademico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la nota promedio (0 a 20): ");
        int promedioNota = entrada.nextInt();

        if (promedioNota < 11) {
            System.out.println("Condición: Desaprobado");
        } else if (promedioNota <= 14) {
            System.out.println("Condición: Regular");
        } else if (promedioNota <= 17) {
            System.out.println("Condición: Bueno");
        } else if (promedioNota <= 20) {
            System.out.println("Condición: Excelente");
        } else {
            System.out.println("Nota ingresada fuera de rango.");
        }

        entrada.close();
    }
}