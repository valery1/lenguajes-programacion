/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class Cliente {
    private String email;
    private int edad;

    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
    }

   

    

    /**
     *  Este metodo nos regresa el email ya previamente en que se debio haber proporcionado por el metodo correspondiente
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * EEste metodo  necesita que propocionar un String que proporciones de un string que va a ser el email que le va asignar al cliente
     * @param email the email to set  aqui deber de poner el string correspondiente al email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     * @throws excepciones.ValorNoNegativoException
     */
    public void setEdad(int edad) throws ValorNoNegativoException, ValorMenorDeEdadException {
       
     
        int Edad;
        
        ValidarEdad.checarEdadNegativa(edad);
        ValidarEdad.checarMenorEdad(edad);
        
        this.edad = edad;
    }
    
    
}
