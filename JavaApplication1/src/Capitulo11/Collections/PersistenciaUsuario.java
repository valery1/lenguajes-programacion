/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.Collections;

/**
 *
 * @author valery
 * 
 */
import java.io.*;
import java.util.ArrayList;
public class PersistenciaUsuario {
      ArrayList<Usuario> usuarios;

    public PersistenciaUsuario() {
        usuarios=new ArrayList<>();
    }
    //primero buscamos el metodo para buscar todos
    ArrayList<Usuario> buscarTodos()throws Exception{
     //paso numero uno leemos el archivo donde esta guardado el Arraylist   
        
        File f=new File("archivaldo.raton");
        
        //LEEMOS EL CONTENIDO
        FileInputStream file=new FileInputStream(f);
        //descomprimimos el contenido
        
       ObjectInputStream ois=new ObjectInputStream(file);
       usuarios=(ArrayList<Usuario>) ois.readObject();
       return usuarios;
       
        
    }
    
    
    public void guardar(Usuario u)throws Exception{
        File f=new File("archivaldo.raton");
        if(f.exists())usuarios=buscarTodos();
       FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
        
        
        
    }
    
    
    
    
}
