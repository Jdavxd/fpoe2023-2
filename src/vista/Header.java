/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
class Header extends JPanel{
    ImageIcon imagen;
    String nombre;
    
    public Header(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void paint(Graphics g){
        Dimension tamano = getSize();
        System.out.println("dfmlñs");
        imagen = new ImageIcon(getClass().getResource(nombre));
        g.drawImage(imagen.getImage(), 0, 0, null);
        setOpaque(false);
        super.paint(g);
    }
}
