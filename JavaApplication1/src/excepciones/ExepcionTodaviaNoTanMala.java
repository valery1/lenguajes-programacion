/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class ExepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        //declaramos un arreglo de enteros y lo inicializamos
        
        int x[]={1,34,6,8};
        float[]y=new float[4];
        float z;
        
        //nos inicializamos
        
    //todos los arreglos son tratados por el compilador como objetos
        
      //  System.out.println(x[4]);
      
        A Objeto=new A();
        System.out.println(Objeto.m);
        System.out.println(x[2]);
        //System.out.println(z); son tratados como objetos los arreglos
        //vamos a iterar el primer arrelogo x
        
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);

        
        }
        
        //el mismo ciclo for pero x pero mejorado
        for(int w:x){
            System.out.println(w);
            
            
        }
        
    }
    
}


class A{
    
    
    float m;
    
    
    
}
