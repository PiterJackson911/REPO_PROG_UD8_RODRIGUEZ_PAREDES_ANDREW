/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05;

/**
 *
 * @author ALUMNO
 */
public class NotificacionPush  implements Notificable {
    @Override 
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando por PUSH: " + mensaje);
}
}