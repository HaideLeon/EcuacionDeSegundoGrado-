/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciondesegundogrado;

import modelo.EcuacionDeSegundoGrado;

/**
 *
 * @author sams
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EcuacionDeSegundoGrado ecu1 = new EcuacionDeSegundoGrado(1,-2,18);
      

       
            System.out.println("Valos de Discriminante: " + ecu1.getDiscriminate());
            System.out.println("Numero de Raices: " + ecu1.getNumeroDeSoluciones());
            System.out.println("X1: " + ecu1.getRaiz1());
            System.out.println("X2: " + ecu1.getRaiz2());

        EcuacionDeSegundoGrado ecu2 = new EcuacionDeSegundoGrado(1,-9,18);
           
            System.out.println("Valos de Discriminante: " + ecu2.getDiscriminate());
            System.out.println("Numero de Raices: " + ecu2.getNumeroDeSoluciones());
            System.out.println("X1: " + ecu2.getRaiz1());
            System.out.println("X2: " + ecu2.getRaiz2());
        
       EcuacionDeSegundoGrado ecu3 = new EcuacionDeSegundoGrado(1,6,9); 
       
            System.out.println("Valos de Discriminante: " + ecu3.getDiscriminate());
            System.out.println("Numero de Raices: " + ecu3.getNumeroDeSoluciones());
            System.out.println("X1: " + ecu3.getRaiz1());
            System.out.println("X2: " + ecu3.getRaiz2());    
            
    }
    
}
