/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int variable1 = 10;
        int variable2 = 9;
        int variable3 = 20;
        int variable4 = 500;
        int variable5 = 2;
        int variable6 = 3;
        int variable7 = 200;
        int variable8 = 50;
        int variable9 = 51;
        
        boolean resultado = ((variable1 * variable2) + variable3 - 
                (variable4 / variable5) + Math.pow(variable6, 2) >= variable7) || 
                (variable8 >= variable8 - variable8 + variable9);
        
        System.out.println(resultado);
    }
    
}
