/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo6Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valery
 */
    public class ProbarMisThreads implements Runnable {
    
    public static void main(String[] args) {
        //ciclo de vida de thread sin contar pausa 
        //1.creado 
       
        MiPrimerThread t1=new MiPrimerThread();
        //OTRO THREAD
        Runnable r=new ProbarMisThreads();
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        
        //el primer thread t2 tiene que hacer que se impriman del 1 al 10 ds 5 segundos entre impresion
                
        //el thread t3 tyiene que hacer que se impriman la frase "todos vamos a morir"
        // esto lo tiene que hacer cada segundo
        
        
        
        
        
       //opcionalmente lo bautizamos
        
        
        
        t1.setName("Valery");
        t2.setName("Juana");
        t3.setName("Pedro");
        
        //2 .-Inicializado
        t1.start();
        t2.start();
        t3.start();
        
        //3.- En ejecucion (cuando corras este ´rograma va estar en estado de ejecucion 
       //y se qctive su metodo run
        
        /// 5.-Muerte cuazndo acomplte la tarea que tiene el codigo del metodo run.
        
    
    
    
    
    }

    @Override
    public void run(){
        
        //primero preguntamos si es el thread t2 y si es que imprima del 1 al 10
        
        
        if(Thread.currentThread().getName().equals("Juana")){
            int x=1;
            for(int i=0;i<30;i++){
            System.out.println(x++);}
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        }if (Thread.currentThread().getName().equals("PEDRO"));
        while(true){
            System.out.println("Todos vamos a morirrrrrrrrrrrr");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    
        
    }






    