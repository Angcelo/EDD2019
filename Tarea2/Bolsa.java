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
public class Bolsa {
    int contador=0;
    class elemento{
        Object objeto;
        elemento siguiente;
    }
    elemento fin;
   
    public boolean esVacia(){
        return fin==null;
    }
    
    public void insertar(Object e){
        if(esVacia()){
            fin=new elemento();
            fin.objeto=e;
            fin.siguiente=fin;
            contador++;
        }else{
            elemento nuevo=new elemento();
            nuevo.objeto=e;
            nuevo.siguiente=fin.siguiente;
            fin.siguiente=nuevo;
            fin=nuevo;
            contador++;
        }
    }
    
    public int cuantos(Object e){
        int contar=0;
        int noelemento=0;
        elemento temp=fin;
        while(contar<contador){
            if (temp.objeto==e) {
                noelemento++;
            }
            temp=temp.siguiente;
            contar++;
        }
        return noelemento;
    }
    
    public int cuantos(){
        return contador;
    }
}
