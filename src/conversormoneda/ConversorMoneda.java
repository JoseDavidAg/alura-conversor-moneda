/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversormoneda;

/**
 *
 * @author ambro
 */

import conversormoneda.Convertir;
import com.google.gson.Gson;

import java.util.Scanner;

public class ConversorMoneda{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Convertir convertir = new Convertir();
        int seleccion;
        boolean condicion=true;
        float base;
        String b="", c="";

        System.out.println("Sea bienvenido/a al conversor de moneda");
        while(condicion){
            System.out.println("1) Dólar ==> Peso argentino");
            System.out.println("2) Peso argentino ==> Dólar");
            System.out.println("3) Dólar ==> Real brazileño");
            System.out.println("4) Real brasileño ==> Dolar");
            System.out.println("5) Dólar ==> Peso colombiano");
            System.out.println("6) Peso colombiano ==> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
                seleccion = sc.nextInt();
            
            switch (seleccion) {
                case 1:
                    b="USD"; c="ARS";
                    break;
                case 2:
                    b="ARS"; c="USD";
                    break;
                case 3:
                    b="USD"; c="BRL";
                    break;
                case 4:
                    b="BRL"; c="USD";
                    break;
                case 5:
                    b="USD"; c="COP";
                    break;
                case 6:
                    b="COP"; c="USD";
                    break;
                case 7:
                    System.exit(1);
                    default:
                        throw new AssertionError();
            }

            System.out.println("Ingrese el valor que desea convertir:");
                base= sc.nextFloat();
            
            convertir.buscarAPI(b, c, base);
           

        }

        
        

    }
}