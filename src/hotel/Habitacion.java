/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import javax.swing.JOptionPane;

/**
 *
 * @author marigabi1001
 */
public final class Habitacion {
    
    private final int nHabitaciones;
    private final TipoHabitacion tipo;
    private boolean ocupacion;
    private int nOcupantes;
    
    //constructores
    
    public Habitacion (){
        nHabitaciones=000;
        this.tipo= TipoHabitacion.DOBLE;
        ocupacion= false;
        nOcupantes=0;
    }
    
    public Habitacion (int nHabitaciones, TipoHabitacion tipo, boolean ocupacion, int nOcupantes){
        this.nHabitaciones=nHabitaciones;
        this.tipo= tipo;
        this.ocupacion= ocupacion;
        this.nOcupantes= nOcupantes;
    }
    
    public int getnHabitaciones (){
        return nHabitaciones;
    }
    
    public TipoHabitacion getTipo (){
        return tipo;
    }
    
    public boolean getOcupacion (){
        return ocupacion;
    }
    
    public boolean setOcupacion(boolean ocupacion){
       return this.ocupacion=ocupacion;
    }
    
    public int getnOcupantes (){
        return nOcupantes;
    }
    
    public int setnOcupantes(int nOcupantes){
        return this.nOcupantes=nOcupantes;
    }
    
    //metodos
    
    @Override
    public String toString(){
       String informacion= "Numero de Habitacion: " + nHabitaciones + "\n";
       informacion += "Tipo de Habitacion: " + tipo + "\n";
       informacion += "Ocupacion de la Habitacion "+ ocupacion +"\n";
       informacion += "Numero de Ocupantes: " + nOcupantes;
       
          return informacion;   

       }
    
    public void Visualizacion(){
         JOptionPane.showMessageDialog(
                  null,
                 this.toString(), 
                  "informacion", 
                  JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void Reserva(int nOcupantes){
      
        if(ocupacion==true){
            
             JOptionPane.showMessageDialog(
                     null,
                     " No hay habitaciones disponibles",
                     "No se puede efectuar la reserva.",
                     JOptionPane.ERROR_MESSAGE);
             
        }else if(nOcupantes <= tipo.getCapacidad()){
            
            this.nOcupantes=nOcupantes;
            ocupacion= true;
            
            this.Visualizacion();
             
        }else {
            
            JOptionPane.showMessageDialog(
                    null,
                    "capacidad de habitacion insuficiente para cantidad de persona",
                    "No se pudo efectuar reserva",
                    JOptionPane.ERROR_MESSAGE);  
        }
    }  

      public void LiberarHab(){
          
          ocupacion= false;
          nOcupantes= 0;
          
          this.Visualizacion();
      }  
        
    
}
