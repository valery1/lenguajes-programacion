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
public class ProbarPersistencia {
    public static void main(String[] args)throws Exception {
            
    Usuario u1=new Usuario();
    u1.setLogin("tu");
    u1.setPassword("5678");
    //ahora usaremos la clase
    PersistenciaUsuario p=new PersistenciaUsuario();
    p.guardar(u1);
    System.out.println("usuario guardado con exito");
    }




}





