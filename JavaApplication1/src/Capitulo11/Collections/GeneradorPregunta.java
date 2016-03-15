/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;
import java.util.*;
/**
 *
 * @authorvaleria serna
 */
public class GeneradorPregunta {
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        //vamos a crear una sola pregunta con tres opciones
    Opcion O1=new Opcion("Moscu",true);
    Opcion O2=new Opcion(" Florencia",false);
    Opcion O3=new Opcion("paris",false);
    Opcion O4=new Opcion("londres",false);
    
    
    
    Opcion o1p2=new Opcion("tokio",false); 
 
    Opcion o2p2=new Opcion("bejin",true); 
    
    Opcion o3p2=new Opcion("seul",false);
    
    Opcion o4p2=new Opcion("ping",false); 
    
    
    
    
    
    
    
    
    ArrayList<Opcion> opciones=new ArrayList<Opcion>();
    opciones.add(O1);
    opciones.add(O2); 
    opciones.add(O3);
    opciones.add(O4);
    
    ArrayList<Opcion> opcionesp2=new ArrayList<Opcion>();
    opcionesp2.add(o1p2);
    opcionesp2.add(o2p2); 
    opcionesp2.add(o3p2);
    opcionesp2.add(o4p2);
    
    
    
    
   
       
   Pregunta p1=new Pregunta("capital de rusia", opciones);
   Pregunta p2=new Pregunta("capital de china", opcionesp2);
   
        
    ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
    preguntas.add(p1);
     preguntas.add(p2);
    return preguntas;
    
    }
}