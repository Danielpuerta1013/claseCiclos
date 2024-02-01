package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // creando ciclo
        Double costoTotal=0.0;
        Double costoAnchetaCumple=180000.0;
        Double costoAnchetaMujer=60000.0;
        Double costoAnchetaBaby=250000.0;
        Integer opcionMenu;
        System.out.println("bienvenido a la tienda de peluches");
        System.out.print("ingrese su nombre: ");
        String nombreUsuario=sc.nextLine();
        System.out.print("ingrese su cedula: ");
        String cedulaUsuario= sc.nextLine();
        System.out.println("a continuacion el menu de compra");
        System.out.println("1. comprar ancheta dia de cumpleaños ");
        System.out.println("2. comprar ancheta para el dia de las madres ");
        System.out.println("3. comprar ancheta para babys shower ");
        System.out.println("4. salir ");
        do {
            System.out.print("digite una opcion: ");
            opcionMenu= sc.nextInt();
            if (opcionMenu==1){
                System.out.print("Ingrese cuantas anchetas quiere comprar de cumpleaños: ");
                Integer opcion1= sc.nextInt();
                costoTotal+=(opcion1*costoAnchetaCumple);
            } else if (opcionMenu==2){
                System.out.print("Ingrese cuantas anchetas quiere comprar de mujer: ");
                Integer opcion2= sc.nextInt();
                costoTotal+=(opcion2*costoAnchetaMujer);
            } else if (opcionMenu==3) {
                System.out.print("Ingrese cuantas anchetas quiere comprar de baby shower: ");
                Integer opcion3= sc.nextInt();
                costoTotal+=(opcion3*costoAnchetaBaby);
            } else if (opcionMenu==4) {
                System.out.println("hasta luego");

            }else{
                System.out.println("opcion incorrecta");
            }
        }while (opcionMenu!=4);
        System.out.println("el total de su compra es de: $"+costoTotal);



    }
}