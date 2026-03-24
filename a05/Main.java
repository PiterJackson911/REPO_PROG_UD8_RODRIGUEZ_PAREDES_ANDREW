



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args){
        
        
        
        
        
        String mensajeEmergencia = "Mantenimiento urgente del servidor";
        List<Notificable> canalesDeNotificacion = new ArrayList<>();
    
        canalesDeNotificacion.add(new NotificacionEmail());
        canalesDeNotificacion.add(new NotificacionSMS());
        canalesDeNotificacion.add(new NotificacionPush());
        System.out.println("EMERGENCIA - Enviando notificacion a todos los canales:\n");

        for (Notificable canal : canalesDeNotificacion) {
            canal.enviarNotificacion(mensajeEmergencia);
        }

        System.out.println("\n Notificacion de emergencia enviada correctamente a todos los canales.");
      
       Notificable palomaMensajera = new Notificable() {

            @Override
            public void enviarNotificacion(String mensaje) {
            System.out.println(mensaje);
            }
        };
        palomaMensajera.enviarNotificacion("Cuu cuu: El CEO os saluda");

    }
}