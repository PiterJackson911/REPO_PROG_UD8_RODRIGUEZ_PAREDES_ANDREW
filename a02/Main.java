/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a02;

/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main (String[] args){
        
     PagoTarjeta tarjeta = new PagoTarjeta();
        PagoBizum bizum = new PagoBizum();

        System.out.println("--- Pago con Tarjeta ---");
        tarjeta.procesarPago(150.0);
        tarjeta.logTransaccion();
        tarjeta.generarFactura(150.0);

        System.out.println("------");
        System.out.println();
        System.out.println("------");

        System.out.println("--- Pago con Bizum ---");
        bizum.procesarPago(50.0);
        bizum.logTransaccion();
        bizum.generarFactura(50.0);
    }
}
