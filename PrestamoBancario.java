import java.util.Scanner;

public class PrestamoBancario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su sueldo: ");
        double sueldoTrabajador = entrada.nextDouble();

        double limitePrestamo;

        if (sueldoTrabajador >= 3000) {
            limitePrestamo = sueldoTrabajador * 5;
        } else {
            limitePrestamo = sueldoTrabajador * 2;
        }

        System.out.println("Monto máximo de préstamo a solicitar: S/" + limitePrestamo);
        entrada.close();
    }
}