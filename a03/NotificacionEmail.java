/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a03;

/**
 *
 * @author ALUMNO
 */
public class NotificacionEmail implements Notificable {
    @Override 
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
}
}