import java.util.Scanner;

public class CompararCadenas {

    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumero(String mensaje){
        int numeroTemporal;
        System.out.println(mensaje);
        numeroTemporal = scanner.nextInt();
        return numeroTemporal;
    }

    public static String obtenerCadena(String mensaje){
        String cadenaTemporal;
        System.out.println(mensaje);
        cadenaTemporal = scanner.nextLine();
        return cadenaTemporal;
    }

    public static void main(String[]args){
        /*int numero = obtenerNumero("Ingresa un numero ");
        System.out.println("El numero ingresado es: " + numero);
        scanner.nextLine();
        String cadena = obtenerCadena("Ingresa un mensaje ");
        System.out.println("El mensaje ingresado es: " + cadena);*/

        String userMail = "20243rd062@utez.edu.mx";
        String userPass = "1234";
        String mailUsuario = obtenerCadena("Ingresa tu nombre ");
        String passUsuario = obtenerCadena("Ingresa tu contraseña ");
        if (userMail.equals(mailUsuario) && userPass.equals(passUsuario)){
            System.out.println("bienvenido ");
        }else{
            System.out.println("correo o contraseña incorrectos ");
        }
    }
}