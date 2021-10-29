/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int variable1 = 10;
        int variable2 = 16;
        int variable3 = 20;
        int variable4 = 1;
        int variable5 = 11;
        
        System.out.println("-------Solución a problema------------------");
        
        double resultado = ((Math.pow(variable1, 2)) + (Math.sqrt(variable2)) +
                variable3 / (variable4 + variable5));
        
        System.out.println(resultado);
    }
    
}
