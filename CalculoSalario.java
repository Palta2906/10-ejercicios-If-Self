import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();

        double pagoPorHora = 20.0;
        double salarioTotal;

        if (horasTrabajadas <= 40) {
            salarioTotal = horasTrabajadas * pagoPorHora;
        } else {
            int horasExtras = horasTrabajadas - 40;
            salarioTotal = (40 * pagoPorHora) + (horasExtras * (pagoPorHora * 2));
        }

        System.out.println("El salario total es: S/" + salarioTotal);
        entrada.close();
    }
}