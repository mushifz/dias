import java.util.Scanner;
import javax.swing.JOptionPane;

public class Estacion{

    //private static final Scanner scanner = new Scanner(System.in);

    /*public static int obtenerNumero(String mensaje){
        int numeroTemporal;
        System.out.println(mensaje);
        numeroTemporal = scanner.nextInt();
        return numeroTemporal;
    }*/

    /*public static String obtenerCadena(String mensaje){
        String cadenaTemporal;
        System.out.println(mensaje);
        //cadenaTemporal = scanner.nextLine();
        return cadenaTemporal;
    }*/

    public static void main(String[] args){
        String mes = JOptionPane.showInputDialog("Introduce un numero ");
        int numeroEntero = Integer.parseInt(mes);
        switch(numeroEntero){
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("No valido");
                break;
        }
    }
}