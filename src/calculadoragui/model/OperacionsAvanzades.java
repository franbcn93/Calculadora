/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragui.model;

/**
 *
 * @author Eric
 */
public class OperacionsAvanzades extends Operacions{
    /**
     * Metode que calcula la potencia amb op1 i op2.
     * @param op1
     * @param op2
     * @return 
     */
    public double potencia(double op1, double op2){
        return Math.pow(op1, op2);
    }
    /**
     * Metode que busca el valor maxim entre op1 i op2.
     * @param op1
     * @param op2
     * @return 
     */
    public double max(double op1, double op2){
        double max;
        if (op1 > op2){
            max = op1;
        } else {
            max = op2;
        }
        return max;
    }
    /**
     * Metode que busca el valor minim entre op1 i op2.
     * @param op1
     * @param op2
     * @return 
     */
    public double min(double op1, double op2){
        double min;
        if (op1 < op2){
            min = op1;
        } else {
            min = op2;
        }
        return min;
    }
    /**
     * Metode que calcula el modul de op1 entre op2;
     * @param op1
     * @param op2
     * @return 
     */
    public double modul(double op1, double op2){
        return op1%op2;
    }
    
}
