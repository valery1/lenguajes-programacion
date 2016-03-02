/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapituloEtE;

/**
 *
 * @author T-101
 */
public class Cliente {
      private String Nombre;
      private String aPaterno;
      private String alumno;
      private int edad;
      private float sueldo;
      private Direccion  direccion;

    public Cliente(String Nombre, String aPaterno, String alumno, int edad, float sueldo, Direccion direccion) {
        this.Nombre = Nombre;
        this.aPaterno = aPaterno;
        this.alumno = alumno;
        this.edad = edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    Cliente(String ana, String lopez, int i, int i0, Direccion direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
      
    
      

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
      
    
}
