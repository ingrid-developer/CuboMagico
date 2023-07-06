
package dibujo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Actores.*;
import Ambientes.*;
import cubos.Main;
import java.io.File;
/**
 *
 * @author fredd
 */
public class JPanelDibujo extends JPanel{
    
  
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Image paisaje = new ImageIcon(Main.ambiente.getImagen()).getImage();
        g.drawImage(paisaje, Main.ambiente.getX(), Main.ambiente.getY(), this);

        Image cubor = new ImageIcon(Main.cubor.getImagen()).getImage();
        g.drawImage(cubor, Main.cubor.getX(), Main.cubor.getY(), this);
        
        Image cuboa = new ImageIcon(Main.cuboa.getImagen()).getImage();
        g.drawImage(cuboa, Main.cuboa.getX(), Main.cuboa.getY(), this);
        
        Image cubov = new ImageIcon(Main.cubov.getImagen()).getImage();
        g.drawImage(cubov, Main.cubov.getX(), Main.cubov.getY(), this);
     
        
     
     
    } 
}
