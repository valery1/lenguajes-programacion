/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6Threads;

/**
 *
 * @author Valery
 */
public class ProbarMisThreads {
    
    public static void main(String[] args) {
        //ciclo de vida de thread sin contar pausa 
        //1.creado 
       
        MiPrimerThread t1=new MiPrimerThread();
        //opcionalmente lo bautizamos
        t1.setName("Valery");
        
        //2 .-Inicializado
        t1.start();
        
        //3.- En ejecucion (cuando corras este ´rograma va estar en estado de ejecucion 
       //y se qctive su metodo run
        
        /// 5.-Muerte cuazndo acomplte la tarea que tiene el codigo del metodo run.
        
    
    
    
    
    }
    
    
    
    
    
    
}
