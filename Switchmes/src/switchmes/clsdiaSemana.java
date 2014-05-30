/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package switchmes;

/**
 *
 * @author Alvaro
 */
public class clsdiaSemana {
   
    public String diaSemana(int num){
   String msj = "";
        switch(num %7)
    {
      case 0:
          msj="Domingo";
              break;
      case 1: 
          msj="Lunes";
              break;
      case 2: 
          msj="Martes";
              break;
      case 3: 
          msj="Miercoles";
              break;
      case 4: 
          msj="Jueves";
              break;
      case 5: 
          msj="Viernes";
              break;
      case 6: 
          msj="Sabado";
              break;
    }
  
    return "El día digitado es: "+msj;
    
    
    
    
    
    
    
    
    }







}
