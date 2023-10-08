/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;


import modelo.Jugador;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 *
 * @author julian rengifo
 */
public final class VentanaPrincipal extends JFrame {
    
    private JLabel jlMensaje;
    private JPanel jpContenido;
    private JLabel jlNombre;
    private Header jpHeader;
    private JTextField txtNombre;
    private JButton btnIngresar;
    
    
    public VentanaPrincipal(){
       iniciarComponentes();
    }
    
        private void iniciarComponentes(){
        //Configuración de la ventana
        setTitle("Figuras Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,550);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        
        //Configuración del Encabezado
        jlMensaje = new JLabel("BIENVENIDO AL EJERCICIO DE TU MEMORIA",SwingConstants.CENTER);
        jlNombre = new JLabel("Ingresa tu nombre",SwingConstants.CENTER );
        
        jpContenido = new JPanel();
        jpHeader = new Header("/imagenes/fig3.png");
        
        
        jpContenido.setSize(650,500);        
        jpContenido.setBounds(0,110, 800, 800);
        jpContenido.setLayout(null);
        
        add(jpHeader);
        add(jpContenido);
        
        jlMensaje.setBounds(0,20, 519,20);
        //jlMensaje.setForeground(Color.GRAY);
        jlNombre.setForeground(new Color(0,87,193));
        jlMensaje.setFont(new Font("arial", Font.BOLD, 18));  
        
        
        jlNombre.setBounds(0,130, 519,35);
        jlNombre.setForeground(new Color(0,87,193));
        jlNombre.setFont(new Font("arial", Font.BOLD, 20)); 
        
        jpHeader.setSize(1200,550);
        
                
        btnIngresar = new JButton("Iniciar Juego");
        btnIngresar.setBounds(180,270, 150,35);
        
        
        jpContenido.add(jlMensaje);
        jpContenido.add(jlNombre);
        jpContenido.add(btnIngresar);
                
        txtNombre = new JTextField("");
        txtNombre.setHorizontalAlignment(JTextField.CENTER);
        txtNombre.setForeground(Color.GRAY);
        txtNombre.setFont(new Font("arial", Font.BOLD, 20)); 
        
        jpContenido.add(txtNombre);
        
        txtNombre.setBounds(53,190,410, 40);
        
        //ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        //btnIngresar.addActionListener(manejadorEventos);
        //txtNombre.addKeyListener(manejadorEventos);
        
        txtNombre.requestFocusInWindow();
        
        Image miIcono = miPantalla.getImage("src/imagenes/icono.png");
	setIconImage(miIcono);
               
    }
    
    
}
