/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMiExcepcion {
    public static void main(String[] args)  {
        try {
            Cliente c=new Cliente();
            c.setEdad(16);
            ValidarEdad valida=new ValidarEdad();
            valida.checarEdadNegativa(-19);
        } catch (ValorMenorDeEdadException ex) {
            System.out.println(ex.getMessage());
                    
           
        } catch(ValorNoNegativoException ex){
          System.out.println(ex.getMessage());
        
        } finally{
            System.out.println("Este se ejecuta se lance o no la e");
        }
    }

        
                
}
    

