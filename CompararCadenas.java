import java.util.Scanner;

public class CompararCadenas {

    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumero(String mensaje){
        int numeroTemporal;
        System.out.println(mensaje);
        numeroTemporal = scanner.nextInt();
        return numeroTemporal;
    }

    public static void main(String[]args){
        int numero = obtenerNumero("Ingresa un numero ");
        System.out.println("El numero ingresado es: " + numero);
    }
}