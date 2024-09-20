package Clase5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Formas de crear un arreglo

        // primera forma
        String[] arregloPalabras = new String[5];

        arregloPalabras[0]="Mauricio";
        arregloPalabras[1]="Sara";
        // Saber el tamano del arreglo
        System.out.println("El tamano de mi arreglo es: "+ arregloPalabras.length);

        // segunda forma
        String[] materias = {"Matematicas","Programacion","Calculo"};
        System.out.println(materias[0]);

        // Creacion de listas
        // Primera forma - esta lista es inmutable(no se puede modificar)
        List<String> myList = List.of("Perros calientes","arepa","carne asada");

        // Segunda forma
        List<String> myList2 = new ArrayList<>();
        myList2.add("Mango");
        myList2.add("Pera");
        myList2.add("Gaseosa");


        // Ejercicio #2
        Scanner scanner = new Scanner(System.in);

        int[] arregloNotas = new int[3];
        System.out.println("Digite el primer numero:");
        int num1 = scanner.nextInt();
        arregloNotas[0] = num1;

        System.out.println("Digite el segundo numero:");
        int num2 = scanner.nextInt();
        arregloNotas[1] = num2;

        System.out.println("Digite el tercer numero:");
        int num3 = scanner.nextInt();
        arregloNotas[2] = num3;

        float resultado;
        resultado = (float) (num1 + num2 + num3) /3;
        System.out.println("El promedio es: " + resultado );

        for (int i = 0; i < arregloNotas.length; i++){
            System.out.println("La nota en la posicion " + i + " es: " + arregloNotas[i]);
        };

        scanner.close();

    }
}
