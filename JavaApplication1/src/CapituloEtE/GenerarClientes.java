/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapituloEtE;

import java.util.HashSet;
import java.util.Set;

/**
 *EjercicioTipoExamen es cliente solo que le puse asi
 * @author T-101
 */
public class GenerarClientes {
   public static Cliente[] obtenerCliente(){
        
    Cliente clientes[]=new Cliente[3];
 Cliente Clientes[] = new Cliente[3];
         
        Clientes[0]=new Cliente("Ana","lopez",20,20000,new Direccion("sur 10",20,"ecatepec"));
        Clientes[1]=new Cliente("Pedro","Martinez",45,14000,new Direccion("Mexico",122,"ecatepec"));
        Clientes[2]=new Cliente("Ana","lopez",20,20000,new Direccion("sur 10",20,"ecatepec"));
      
                
                
           
    return Clientes;
    
   }  
}