/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtual.dto;

/**
 *
 * @author s1mu2
 */
public class Login {
    
    private String rut; 
    private String clave; 
    public int tipoPerfil;

    public Login(String rut, String clave, int tipoPerfil) {
        this.rut = rut;
        this.clave = clave;
        this.tipoPerfil = tipoPerfil;
    }


// Constructor sin parametros 
    public Login() {
    }

// Getters y Setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTipoPerfil() {
        return tipoPerfil;
    }

    public void setTipoPerfil(int tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }
    
    
    
    
}
