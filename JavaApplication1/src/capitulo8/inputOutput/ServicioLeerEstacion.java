/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputOutput;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author T-101
 */
public class ServicioLeerEstacion {
    
    
    public static String generarValor(String etiqueta )throws Exception{
    
        String Valor="Sin Valor";
        
        URL url=new 
        URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        InputStream input=con.getInputStream();
        InputStreamReader isr=new InputStreamReader(input);
        BufferedReader reader=new BufferedReader(isr);
        
         String lineaActual="No ah leido nada";
        
         boolean encontrado=false;
         int miLinea=0;
         
         
         while((lineaActual=reader.readLine())!=null){
          if(encontrado && miLinea<=0){
              
              //vamos a despedazar la linea
           
              int indice=  lineaActual.indexOf(">");
              int indice2=   lineaActual.indexOf("</");
              String tempActual=lineaActual.substring(indice+1, indice2);
        
              
              Valor=tempActual;
              System.out.println(tempActual);
              miLinea++;
              
              
          }
             
             if(lineaActual.contains(etiqueta)){
              encontrado=true;
             
              System.out.println("Dato encontrado");
              
              
            
           
              
              
              
              
          }
         
            
         }
      
    
         
    
return Valor;

}
}