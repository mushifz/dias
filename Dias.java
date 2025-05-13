import java.util.Scanner;

public class Dias{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int diaSemana;
        System.out.println("Ingresa un numero del 1 al 7");
        diaSemana = scanner.nextInt();
        if(diaSemana==1){
            System.out.println("Lundi");
        }else if(condincion==2){
            System.out.println("Mardi");
        }else if(condincion==3){
            System.out.println("Mercredi");
        }else if(condincion==4){
            System.out.println("Jeudi");
        }else if(condincion==5){
            System.out.println("Vendredi");
        }else if(condincion==6){
            System.out.println("Samedi");
        }else if(condincion==7){
            System.out.println("Dimanche");
        }else{
            System.out.println("Numero no valido");
        }
    }
}