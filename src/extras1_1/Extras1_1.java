/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_1;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Extras1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Realizar un programa que simue un ticket de la compra.
         Para eso pedimos el nombre del establecimiento, el numero
         de unidades compradas, precio del producto, se visualiza el total,
         recibo, devuelvo y gracias por su visita.*/
        
        Scanner leer = new Scanner (System.in);
                double nUnidadesCompradas, precioProducto,precioTotal, recibo, devuelvo;
                System.out.println("Unidades compradas");
                nUnidadesCompradas = leer.nextDouble();
                System.out.println("Precio del producto");
                precioProducto = leer.nextDouble();
                precioTotal = nUnidadesCompradas*precioProducto;
                System.out.println("Total compra: "+precioTotal);
                System.out.println("Recibo:");
                recibo = leer.nextDouble();
                devuelvo= recibo-precioTotal;
                System.out.println("Devolucion:"+devuelvo);
                System.out.println("\t Ticket \n Unidades compradas = "+ nUnidadesCompradas + 
                        "\n Precio producto ="+precioProducto+ 
                        "\n Precio total a pagar = "+precioTotal+ "\n Recibo="+ recibo+
                         "\n Devuelvo="+devuelvo+" \nGracias por su visita.");
    }
    
}
