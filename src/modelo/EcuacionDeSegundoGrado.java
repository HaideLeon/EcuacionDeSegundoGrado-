/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sams
 */
public class EcuacionDeSegundoGrado {
    
    private double  a;
    private double  b;
    private double  c;
    
    public EcuacionDeSegundoGrado (double a, double b, double c){
        
        this.a = a;
        this.b = b;
        this.c = c;
    
    }
    
    
 
    public double getCoeficienteA (){
    
        return this.a;
    }
    
    
    public double getCoeficienteB (){
    
        return this.b;
    }
    
    public double getCoeficienteC (){
    
        return this.c;
    }
    
    public double getDiscriminate (){
        
        double discriminate;
        discriminate = Math.pow(this.b, 2) - 4*this.a*this.c; 
       
        return discriminate; 
    }
    
    public int getNumeroDeSoluciones (){
        
        int NRaices;
        double d = getDiscriminate ();
        if (d > 0){
          
            NRaices = 2;
        }else if (d < 0 ){
            
            NRaices = 0;
        }else {
            NRaices = 1;
        }
      
        return NRaices;
    }
    
    public double getRaiz1 (){
        
        double raiz1;
        raiz1 = (- this.b + Math.sqrt( getDiscriminate ()))/ (2*this.a);
        
        return raiz1;
    }
    
    public double getRaiz2 (){
        
        double raiz2;
        raiz2 = (- this.b - Math.sqrt( getDiscriminate ()))/ (2*this.a);
        
        return raiz2;
    }
}