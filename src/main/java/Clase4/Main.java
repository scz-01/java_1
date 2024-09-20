package Clase4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int edad = 20;
        String nombre = "Mauricio";
        if(edad >= 18 ){
            System.out.println("Es mayor de edad");
            if (nombre.equals("Mauricio")){
                System.out.println("No le permitan la entrada");
            }
        }else{
            System.out.println("Es menor de edad");
        }

        // Ejemplo con if ternario
        // String mensaje =  (edad >= 18) ? "Es mayor de edad" : "Es mernor de edad";

        System.out.println("Ingrese un numero:");
        int num = scanner.nextInt();
        String mensaje2 = (num%2 == 0) ? "El numero es par" : "El numero es impar";
        System.out.println(mensaje2);

        scanner.close();

    }

}
