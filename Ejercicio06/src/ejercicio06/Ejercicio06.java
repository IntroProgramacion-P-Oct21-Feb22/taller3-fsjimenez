/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio06 {

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
        
        System.out.println("-------Solución a problema------------------");
        
        boolean resultado = (((Math.sqrt(variable1)) + variable2) / variable3 ==
                variable2) && (variable4 > variable5);
        
        System.out.println(resultado);
    }
    
}
