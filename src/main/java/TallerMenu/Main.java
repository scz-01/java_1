package TallerMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int salida = 0;
        List<String> listaPedido = new ArrayList<>();
        // List<Integer> listaPrecios = new ArrayList<>();
        int total = 0;
        Integer[] precioMenu = new Integer[6];
        precioMenu[0] = 15000;
        precioMenu [1] = 20000;
        precioMenu [2] = 15000;
        precioMenu [3] = 22000;
        precioMenu [4] = 6000;
        precioMenu [5] = 8000;

        do {

            System.out.println("------ MENU ------");
            System.out.println("1) Sandwich  $15.000");
            System.out.println("2) Hamburguesa  $20.000");
            System.out.println("3) Pizza  $15.000");
            System.out.println("4) Nuggets de pollo  $22.000");
            System.out.println("5) Jugo natural  $6.000");
            System.out.println("6) Gaseosa  $8.000");
            System.out.println("7) --- CONFIRMAR --- ");
            System.out.println(" ");
            System.out.println("Ingrese una opcion:");
            int opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Sandwich agregado");
                    listaPedido.add("Sandwich  $15.000");
                    total += precioMenu[0];
                    // listaPrecios.add("sandwich",15000);
                    break;
                case 2:
                    System.out.println("Hamburguesa agregada");
                    listaPedido.add("Hamburguesa  $20.000");
                    total += precioMenu[1];
                    break;
                case 3:
                    System.out.println("Pizza agregada");
                    listaPedido.add("Pizza  $15.000");
                    total += precioMenu[2];
                    break;
                case 4:
                    System.out.println("Nuggets agregados");
                    listaPedido.add("Nuggets de pollo  $22.000");
                    total += precioMenu[3];
                    break;
                case 5:
                    System.out.println("Jugo natural agregado");
                    listaPedido.add("Jugo natural  $6.000");
                    total += precioMenu[4];
                    break;
                case 6:
                    System.out.println("Gaseosa agregada");
                    listaPedido.add("Gaseosa  $8.000");
                    total += precioMenu[5];
                    break;
                case 7:
                    System.out.println("Orden Confirmada");
                    salida = 1;
                    break;

                default:
                    System.out.println("Error");
            }

        }while(salida == 0);{
            System.out.println("Terminando pedido");
            scanner.close();
        }

        System.out.println(" ");
        System.out.println("Tu Pedido:");
        for (String str: listaPedido) {
            System.out.println(str);
        }

        System.out.println(" ");
        System.out.println("total: " + total);
        System.out.println("Impoconsumo: " + Math.round(total*0.08) );
        System.out.println("Total a pagar: "+ Math.round(total+(total*0.08)));
    }


}
