/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int variable1 = 20;
        int variable2 = 1;
        int variable3 = 3;
        int variable4 = 2;
      
        
        System.out.println("-------Solución a problema------------------");
        
        boolean resultado = (variable1 / (variable2 + variable3)) + variable4
                >= variable3;
        
        System.out.println(resultado);
    }
    
}
