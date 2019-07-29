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
public class ListaBolsas {
    int contador=0;
    class bolsas{
        Object nombre;
        Bolsa elementos;
        bolsas siguiente;
        bolsas() {
            this.elementos = new Bolsa();
        }
    }
    bolsas fin;
    
    public boolean haybolsas(){
        return fin==null;
    }
    
    public boolean esVacia(Object bolsa){
        int contar=0;
        bolsas temp=fin;
        while(contar<contador){
            if(temp.nombre.equals(bolsa)){
                return temp.elementos.esVacia();
            }
        }
        return false;
    }
    
    public void crear(Object n){
        if(haybolsas()){
            fin=new bolsas();
            fin.nombre=n;
            fin.siguiente=fin;
            contador++;
        }else{
            bolsas nuevo=new bolsas();
            nuevo.nombre=n;
            nuevo.siguiente=fin.siguiente;
            fin.siguiente=nuevo;
            fin=nuevo;
            contador++;
        }
    }
    
    public void insertarobjeto(Object bolsa,Object o){
        int contar=0;
        bolsas temp=fin;
        while(contar<contador){
            if(temp.nombre.equals(bolsa)){
                temp.elementos.insertar(o);
                break;
            }
        }
    }
    
    public int cuantos(Object bolsa,Object o){
        int contar=0;
        bolsas temp=fin;
        while(contar<contador){
            if(temp.nombre.equals(bolsa)){
                return temp.elementos.cuantos(o);
            }
        }
        return 0;
    }
    
    public int cuantos(Object bolsa){
        int contar=0;
        bolsas temp=fin;
        while(contar<contador){
            if(temp.nombre.equals(bolsa)){
                return temp.elementos.cuantos();
            }
        }
        return 0;
    }
}
