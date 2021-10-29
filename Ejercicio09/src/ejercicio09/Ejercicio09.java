/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int variable1 = 81;
        int variable2 = 25;
        int variable3 = 10;
        int variable4 = 50;
        
        
        boolean resultado = (Math.sqrt(variable1) + Math.sqrt(variable2)
               * variable3 >= variable4); 
                
        
        System.out.println(resultado);
    }
    
}
