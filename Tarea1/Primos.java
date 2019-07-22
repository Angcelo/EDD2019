/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Primos {
     public static void main(String[] args) {
         int Numero,i,j;         
         Scanner leer=new Scanner(System.in);
         System.out.print("Introduzca Numero\n");
         Numero=leer.nextInt();
         boolean[] primo=new boolean[Numero];
         for(i=0;i<Numero;i++){
             primo[i]=true;
         }
         for(i=2;i<Numero;i++){
             for(j=2;i*j<Numero;j++){
                 primo[i*j]=false;
             }
         }
         System.out.print("\n\n");
         for(i=2;i<Numero;i++){
            if(primo[i]){
                System.out.print(i+"|");
            }else{
                System.out.print("*|");
            }
            if(i%10==0){
                System.out.print("\n");
            }   
         }
     }
}
