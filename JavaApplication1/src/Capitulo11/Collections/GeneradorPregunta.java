/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;
import java.util.*;
/**
 *
 * @author T-101
 */
public class GeneradorPregunta {
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        //vamos a crear una sola pregunta con tres opciones
    Opcion O1=new Opcion("Moscu",true);
    Opcion O2=new Opcion(" Florencia",false);
    Opcion O3=new Opcion("paris",false);
    ArrayList<Opcion> opciones=new ArrayList<Opcion>();
    opciones.add(O1);
    opciones.add(O2); 
    opciones.add(O3);
   
       
   Pregunta p1=new Pregunta("capital de rusia", opciones);
        
    ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
    preguntas.add(p1);
    return preguntas;
    
    }
}