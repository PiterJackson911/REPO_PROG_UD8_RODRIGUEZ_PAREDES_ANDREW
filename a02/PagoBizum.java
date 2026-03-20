/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a02;

/**
 *
 * @author ALUMNO
 */
public class PagoBizum implements MetodoPago {
    @Override 
    public void procesarPago(double importe){
    System.out.println("importe final con IVA: " + importe + "€");
    }
    
    @Override
    public void logTransaccion(){
        System.out.println("Transacción con bizum registrada");
    }
}
