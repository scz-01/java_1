package Clase2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        creamos objeto escanner para leer desde consola
        Scanner scanner = new Scanner(System.in);

//        Leer una cadena de texto
//        System.out.println("Digite su nombre:");
//        String nombre = scanner.next();
//        System.out.println("Nombre: "+nombre);

//        Leer un numero entero
//        System.out.println("Ingrese su edad:");
//        int edad = scanner.nextInt();
//        System.out.println("Usted tiene "+edad+" Anios");

    /*    System.out.println("Digite el primer numero:");
        int num1 = scanner.nextInt();

        System.out.println("Digite el segundo numero:");
        int num2 = scanner.nextInt();

        System.out.println("Digite el tercer numero:");
        int num3 = scanner.nextInt();

        float resultado;
        resultado = (float) (num1 + num2 + num3) /3;
        System.out.println("El promedio es: " + resultado );
    */

//        Cerrar el scanner
        scanner.close();

        Persona persona = new Persona();
        persona.setEdad(31);
        persona.setGenero("Masculino");
        persona.setNombreCompleto("Stiven");

        System.out.println("La edad de la persona es: "+persona.getEdad());
        System.out.println("Su genero es: "+persona.getGenero());
        System.out.println("Su nombre completo es: "+persona.getNombreCompleto());
    }
}
