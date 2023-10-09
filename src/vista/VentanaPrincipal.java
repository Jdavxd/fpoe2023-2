package vista;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import modelo.Jugador;
/**
 *
 * @author jose9
 */
public class VentanaPrincipal extends JFrame{
    private JLabel lblTitulo;
    private JLabel lblTitulo2;
    private JTextField cajaTexto;
    private JLabel lblHTP;
    private JLabel lblWP;
    private JLabel lblJugar;
    private JLabel nombreJugador;
    private JButton btnIniciarJuego;
    private JLabel btnInstrucciones;
    private JLabel textoInstrucciones;
    
    private Container contenedorInicial;
    public VentanaPrincipal()
    {
        iniciarComponentes();   
        setSize(750,700);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("PRINCIPAL");
        setResizable(false);
        SwingUtilities.updateComponentTreeUI(contenedorInicial);
    }
    
    private void iniciarComponentes()
    {
        lblTitulo = new JLabel("BIENVENIDO AL EJERCICIO DE",SwingConstants.CENTER);
        lblTitulo2 = new JLabel("FIGURAS GEOMETRICAS",SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Serif", Font.PLAIN, 18));
        lblTitulo.setBounds(160,50,400,50);
        lblTitulo2.setFont(new Font("Serif", Font.PLAIN, 18));
        lblTitulo2.setBounds(160,80,400,50);
        
        nombreJugador = new JLabel("INGRESA TU NOMBRE",SwingConstants.CENTER);
        nombreJugador.setFont(new Font("Serif", Font.ITALIC, 16));
        nombreJugador.setBounds(160,150,400,50);
        
        cajaTexto = new JTextField();
        cajaTexto.setBounds(160,200,400,50);
        
        btnIniciarJuego = new JButton("JUGAR");
        btnIniciarJuego.setBounds(210, 280, 300, 40);
        btnIniciarJuego.setBackground( Color.BLUE); 
        btnIniciarJuego.setForeground(Color.WHITE); 
        
       
        textoInstrucciones = new JLabel("INSTRUCCIONES");
        textoInstrucciones.setFont(new Font("Serif", Font.ITALIC, 16));
        textoInstrucciones.setBounds(580,450,400,50);
        
        
        
        ImageIcon iconoInstrucciones = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
        btnInstrucciones = new JLabel(iconoInstrucciones);
        btnInstrucciones.setBounds(600, 400, 70, 70); // Puedes ajustar las coordenadas y tamaño

        
        
        btnIniciarJuego.addMouseListener(new MouseAdapter() {
        @Override
            public void mouseClicked(MouseEvent e) {
                Jugador jugador = new Jugador(cajaTexto.getText());
                VentanaDeJuego ventanaJuego = new VentanaDeJuego(jugador);
            }
        
        });
        
                btnInstrucciones.addMouseListener(new MouseAdapter() {
        @Override
            public void mouseClicked(MouseEvent e) {
            
            JOptionPane.showMessageDialog(null, "Instrucciones Básicas para el Juego de Figuras Geométricas:\n\n"
                + "- Al iniciar el juego, se te pedirá que ingreses tu nombre.\n"
                + "- Una vez que hayas ingresado tu nombre, el juego comenzará.\n"
                + "- En cada nivel, se mostrarán figuras geométricas de diferentes tamaños y colores.\n"
                + "- Tu tarea es identificar y seleccionar la figura correcta según las instrucciones dadas.\n"
                + "- Puedes hacer clic en la figura que consideres correcta para avanzar al siguiente nivel.\n"
                + "- La aplicación registrará la cantidad de figuras mostradas, intentos y fallos.");
            }
        });
        
        /*
        class eventoInicial implements ActionListener{
            
        }
        */
        
        
        
        
        contenedorInicial = getContentPane();
        contenedorInicial.setLayout(null);  
        contenedorInicial.setBackground(new Color(240, 255, 240)); // Verde Menta 
        contenedorInicial.add(lblTitulo);        
        contenedorInicial.add(lblTitulo2);
        contenedorInicial.add(cajaTexto);
        contenedorInicial.add(nombreJugador);
        contenedorInicial.add(btnIniciarJuego);
        contenedorInicial.add(btnInstrucciones); 
        contenedorInicial.add(textoInstrucciones);
    }
    
    
    
}