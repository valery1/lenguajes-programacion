/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;

/**
 *
 * @author T-101
 */
public class LeerUsuarios {
    
    
    public static void main(String[] args)throws Exception{
        //creamos un objeto de la clase persistenciausuariop
        PersistenciaUsuario p=new PersistenciaUsuario();
        p.buscarTodos().size();
        System.out.println( p.buscarTodos().size());
       // for(Usuario u:p buscarTodos()){
        //System.out.println("Login:"+u.getLogin()+" pasword:  "+u.getPasword());
        
    }
        
    }
//
