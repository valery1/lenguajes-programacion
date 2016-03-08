/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

/**
 *
 * @author T-101
 */
public class TestPregunta {
    
    public static void main(String[] args)throws Exception {
        opcion opc1=new opcion("paris",false);
        opcion opc2=new opcion("florencia",false);
        opcion opc3=new opcion("londres",false);
        opcion opc4=new opcion("moscu",true);
       
        opcion opciones[]=new opcion[4];
        opciones[0]=opc1;
        opciones[1]=opc2;
        opciones[2]=opc3;
        opciones[3]=opc4;
        ValidarOpcion  validar=new ValidarOpcion();
        validar.validar(opciones);
        
        Pregunta p=new Pregunta("capital de rusia",opciones);
                
        
    }
    
}
