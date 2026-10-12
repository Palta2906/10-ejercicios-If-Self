import java.util.Scanner;

public class ComparacionTresNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int primerNumero = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = entrada.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int tercerNumero = entrada.nextInt();

        int numeroMayor;
        int numeroMenor;

        // Determinar el número mayor
        if (primerNumero >= segundoNumero && primerNumero >= tercerNumero) {
            numeroMayor = primerNumero;
        } else if (segundoNumero >= primerNumero && segundoNumero >= tercerNumero) {
            numeroMayor = segundoNumero;
        } else {
            numeroMayor = tercerNumero;
        }

        // Determinar el número menor
        if (primerNumero <= segundoNumero && primerNumero <= tercerNumero) {
            numeroMenor = primerNumero;
        } else if (segundoNumero <= primerNumero && segundoNumero <= tercerNumero) {
            numeroMenor = segundoNumero;
        } else {
            numeroMenor = tercerNumero;
        }

        int diferencia = numeroMayor - numeroMenor;

        System.out.println("Número mayor: " + numeroMayor);
        System.out.println("Número menor: " + numeroMenor);
        System.out.println("Diferencia entre ambos: " + diferencia);
        entrada.close();
    }
}