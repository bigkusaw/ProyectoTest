/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author admin
 */
public class Paciente {
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String genero;

    public Paciente(String identificacion, String nombres, String apellidos, String fecha_nacimiento, String genero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public String getIdentificacion() {
        return identificacion;
    }

    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

   
    public String getNombres() {
        return nombres;
    }

    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    
    public String getApellidos() {
        return apellidos;
    }

    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

   
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getgenero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
