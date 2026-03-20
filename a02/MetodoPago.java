/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a02;

/**
 *
 * @author ALUMNO
 */
public interface MetodoPago {
     final static double IVA = 0.21;
     
     void procesarPago(double importe);
     void logTransaccion();
     default void generarFactura(double importe){
         logTransaccion();
            double total = importe + (importe * IVA);
            System.out.println("importe final con IVA: " + total + "€");
     }
}
