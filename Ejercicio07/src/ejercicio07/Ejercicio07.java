/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int variable1 = 81;
        int variable2 = 9;
        int variable3 = 3;
        int variable4 = 10;
        int variable5 = 1;
        int variable6 = 100;
        int variable7 = 25;
        
        System.out.println("-------Solución a problema------------------");
        
      
       
        boolean resultado = ((((Math.sqrt(variable1)) + variable2) / variable3) == 
                (variable2)) || (variable4 > variable5) && (variable6
                / variable7+(Math.sqrt(variable6))>0); /* El ejercicio estaba mal planteado, ya que la ultima
                                                       operacion era un valor entero y no booleano, por ende no
                                                       se pueden comparar */
                
        System.out.println(resultado);
    }
    
}
