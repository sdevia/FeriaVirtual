/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtual.forms;

import cl.duoc.pty.feriavirtual.dto.Login;
import cl.duoc.pty.feriavirtual.negocio.AccionLogin;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author s1mu2
 */
public class VistaLogin {
    
    public static void main(String[] args) {
		JFrame frame = new JFrame("Demo application");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		
                //Crear un objeto login vacio
                Login login = new Login ();
                //Pasarselo al metodo setearComponentes                
                setearComponenetes(panel, login);
                
                
		frame.setVisible(true);
                
                
                
                
	}
    
    private static void setearComponenetes(JPanel panel, Login login) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("Identificador");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);
                login.setRut(userText.getSelectedText());

		JLabel passwordLabel = new JLabel("Clave");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);
                login.setClave(passwordText.getSelectedText());

		JButton botonLogin = new JButton("Ingresar");
		botonLogin.setBounds(10, 80, 80, 25);
		panel.add(botonLogin);
		
		JButton registerButton = new JButton("Cerrar");
		registerButton.setBounds(180, 80, 80, 25);
		panel.add(registerButton);
                
                AccionLogin al = new AccionLogin();
               // al.muestraUsuarioLogeado(login);
                
                 ActionListener botonIngresar = new AccionLogin();
		botonLogin.addActionListener(botonIngresar);
                   
                
              
                //Pasar el login a metodo en clase ActionLogin
                
	}
    
}
