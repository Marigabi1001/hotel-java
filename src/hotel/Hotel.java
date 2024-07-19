/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import hotel.TipoHabitacion;
/**
 *
 * @author Alumno
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      ArrayList<Habitacion> habitaciones = new ArrayList <Habitacion>();
      habitaciones.add(new Habitacion());
      habitaciones.add(new Habitacion(1,TipoHabitacion.INDIVIDUAL, false, 0));
      habitaciones.add(new Habitacion(2,TipoHabitacion.DOBLE, false, 0)); 
      habitaciones.add(new Habitacion(3,TipoHabitacion.TRIPLE, false, 0));
      habitaciones.add(new Habitacion(4,TipoHabitacion.SUITEJUNIOR, false, 0));
      habitaciones.add(new Habitacion(5,TipoHabitacion.SUITE, false, 0));
    
         JOptionPane.showMessageDialog(
              null,
              "numero de habitaciones: " + habitaciones.size(),
              "Hotel Aladin",
              JOptionPane.INFORMATION_MESSAGE);
      
        for ( int i=0; i<habitaciones.size(); i++ ){
            habitaciones.get(i).Visualizacion();
        }

        habitaciones.get(3).Reserva(3);
        //habitaciones.get(3).Reserva(4);
        //habitaciones.get(2).Reserva(4);
       
        
        habitaciones.get(3).LiberarHab();
        
      
    }
    
}
