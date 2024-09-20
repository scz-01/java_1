package Clase6;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        int contador=0;

        while(contador < 5){
            System.out.println("Valor contador: "+contador);
            contador++;
        }
        System.out.println("-------------------------------");
        contador = 0;

        do{
            System.out.println("Valor contador: "+contador);
            contador++;
        }while(contador < 5);

        System.out.println(" ");
        System.out.println("""
                ejemplos con ciclos
                For y ForEach
                """);
        for(int i = 1; i <= 10; i+=2){
            // para ver los numeros de 2 en 2 en este caso serias numeros pares
            System.out.println("Numero "+ i);
        }

        String[] arregloPalabras = new String[2];
        arregloPalabras[0] = "Stiven";
        arregloPalabras[1] = "Sara";

        List<String> myList= List.of("perro caliente","Arepa","carne asada");
        for (int i = 0; i < arregloPalabras.length; i++) {
            System.out.println("Valor de arreglo: " + arregloPalabras[i]);
        }
        System.out.println(" ");
        System.out.println("-------------------------------");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Valor de arreglo: " + myList.get(i));
        }

        System.out.println("Fori = for each");
        for (String comidas:myList) {
            System.out.println(comidas);
        }
    }
}
