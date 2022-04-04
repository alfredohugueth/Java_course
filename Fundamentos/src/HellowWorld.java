// My class in Java

import java.util.Scanner;

public class HellowWorld {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Proporciona el numero 1: ");
        int numero1 = Integer.parseInt(console.nextLine());

        System.out.println("Proporciona el numero 2");
        int numero2 = Integer.parseInt(console.nextLine());

        int answer = Math.max(numero1, numero2);
        System.out.println("El numero mayor es: \n" + answer);


    }


}
