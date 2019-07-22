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
public class DiaSemana {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,M,D,M2;
        A=0;M=0;D=0;M2=0;
        Scanner leer=new Scanner(System.in);
        boolean correcto=false;
        do{
            System.out.print("Introduzca Año\n");
            A=leer.nextInt();
            System.out.print("Introduzca Mes en numeros\n");
            M=leer.nextInt();
            System.out.print("Introduzca Dia\n");
            D=leer.nextInt();  
            correcto = A<1700||M>12||D>31;
        }while(correcto==true);     
        if(A%4==0){
            switch(M){
                case 1:
                    M2=0;
                    break;
                case 2:
                    M2=3;
                    break;
                case 3:
                    M2=4;
                    break;
                case 4:
                    M2=0;
                    break;
                case 5:
                    M2=2;
                    break;
                case 6:
                    M2=5;
                    break;
                case 7:
                    M2=0;
                    break;
                case 8:
                    M2=3;
                    break;
                case 9:
                    M2=6;
                    break;
                case 10:
                    M2=1;
                    break;
                case 11:
                    M2=4;
                    break;
                case 12:
                    M2=6;
                    break;    
                default:
                    M2=0;
                    break;
            }  
        }else{
            switch(M){
                case 1:
                    M2=0;
                    break;
                case 2:
                    M2=3;
                    break;
                case 3:
                    M2=3;
                    break;
                case 4:
                    M2=6;
                    break;
                case 5:
                    M2=1;
                    break;
                case 6:
                    M2=4;
                    break;
                case 7:
                    M2=6;
                    break;
                case 8:
                    M2=2;
                    break;
                case 9:
                    M2=5;
                    break;
                case 10:
                    M2=0;
                    break;
                case 11:
                    M2=3;
                    break;
                case 12:
                    M2=5;
                    break;    
                default:
                    M2=0;
                    break;
            } 
        }
        int moduloA=(A-1)%7;
        int moduloB=((A-1)/4-(3*((A-1)/100+1)/4))%7;
        int moduloC=D%7;
        int dia=(moduloA+moduloB+moduloC+M2)%7;
        switch(dia){
            case 1:
                System.out.print("El dia es Lunes");
                break;
            case 2:
                System.out.print("El dia es Martes");
                break;
            case 3:
                System.out.print("El dia es Miercoles");
                break;
            case 4:
                System.out.print("El dia es Jueves");
                break;
            case 5:
                System.out.print("El dia es Viernes");
                break;
            case 6:
                System.out.print("El dia es Sabado");
                break;
            case 0:
                System.out.print("El dia es Domingo");
                break;
        }
    }
    
}
