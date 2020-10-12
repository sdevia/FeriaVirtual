/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtual.negocio;

import cl.duoc.pty.feriavirtual.dto.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author s1mu2
 */
public class AccionLogin implements ActionListener{

    String identificador = "";
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        ActionEvent x = e;
        JOptionPane.showMessageDialog(null, identificador);
    }
    
    //Crear metodo para recibir un objeto login
    public void muestraUsuarioLogeado(Login login){
       
        if(login.getRut() == null){
            JOptionPane.showMessageDialog(null, "Esta nulo el valor");
            
        }
       identificador = login.getRut();
    }
    
   
    
}