
package vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import modelo.Jugador;



public class VentanaDeJuego extends JFrame {
    private JLabel txtNombre;
    private Jugador jugador;
    private JLabel ronda;
    private JLabel separador;
    private Container contenedorSecundario;
    
    
      public VentanaDeJuego(Jugador nuevoJugador)
    {
        setSize(1200,510);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("JUEGO");
        setResizable(false);
        jugador = nuevoJugador; 
        iniciarComponentes();   
        //SwingUtilities.updateComponentTreeUI(contenedorSecundario);
    }
      
      
      private void iniciarComponentes(){
          
        txtNombre = new JLabel("JUGADOR: "+jugador.getNombre());
        txtNombre.setFont(new Font("Serif", Font.BOLD, 19));
        txtNombre.setBounds(500,8,400,50);
        
        
        ronda = new JLabel("RONDA: "+jugador.getRonda());
        ronda.setFont(new Font("Serif", Font.BOLD, 19));
        ronda.setBounds(800,8,400,50);
        
        JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
        separator.setOpaque(false); // Hacer que el separator no sea opaco
        separator.setPreferredSize(new Dimension(10, Integer.MAX_VALUE));
        separator.setBorder(BorderFactory.createEmptyBorder(300, 60, 0, 10)); // Añadir un margen a la izquierda y derecha
        ImageIcon imagenSeparador = new ImageIcon("imagenes/negra.png");
        separador = new JLabel();
        separador.setLayout(new BorderLayout());
        separador.add(separator, BorderLayout.CENTER);
        separador.setBounds(300, -10, 100, 480);
        separador.setIcon(new ImageIcon(imagenSeparador.getImage().getScaledInstance(separador.getWidth(), separador.getHeight(), Image.SCALE_SMOOTH)));
        
        
        
        
        
        
        contenedorSecundario = getContentPane();
        contenedorSecundario.setLayout(null);
        contenedorSecundario.setBackground(new Color(255, 240, 220));
        contenedorSecundario.add(txtNombre);      
        contenedorSecundario.add(ronda);
        contenedorSecundario.add(separador);
          
      }
 

}
      
   