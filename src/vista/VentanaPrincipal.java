/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;


<<<<<<< HEAD
=======
import modelo.Jugador;
import vista.VentanaDeJuego;
>>>>>>> genaroV-2241850

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
<<<<<<< HEAD
=======
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
>>>>>>> genaroV-2241850
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 *
 * @author julian rengifo
 */
public final class VentanaPrincipal extends javax.swing.JFrame {
    
    private JLabel jlMensaje;
    private JPanel jpContenido;
    private JLabel jlNombre;
    private Header jpHeader;
    private JTextField txtNombre;
    private javax.swing.JButton btnIngresar;
    private JTextField campoNombre;
    private JFrame ventana;
    private JPanel panel;
    
    
    
    public VentanaPrincipal(){
       iniciarComponentes();
    }
    /*
    void(new ActionListener() {
            @Override
            private void actionPerformed(ActionEvent e) {
                // Crear e inicializar la nueva ventana
                JFrame nuevaVentana = new JFrame("Nueva Ventana");
                nuevaVentana.setSize(200, 150);

                // Puedes personalizar y agregar componentes a esta nueva ventana según tus necesidades

                // Hacer visible la nueva ventana
                nuevaVentana.setVisible(true);
                        
                        }
    });
    */
    
        private void iniciarComponentes(){
        campoNombre = new JTextField();
        ventana = new JFrame();
        panel = new JPanel();
        panel.setLayout(null);
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
        
        // escucha de el boton de iniciar juego
        
    }
        
        private void boton(java.awt.event.ActionEvent evt){
            
        }
    
}
