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
public class SoloUnaCorrectaExepcion extends Exception{

    public SoloUnaCorrectaExepcion() {
        super("Solo se puede asignar una opcion correcta");
    }
    
    
    
}
