/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author angel
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaBolsas lb=new ListaBolsas();
        lb.crear("BolsaVacia");
        System.out.print(lb.esVacia("BolsaVacia")+"\n");
        lb.insertarobjeto("BolsaVacia", 12);
        System.out.print(lb.esVacia("BolsaVacia")+"\n");
        System.out.print(lb.cuantos("BolsaVacia", 2)+"\n");
    }
    
}
