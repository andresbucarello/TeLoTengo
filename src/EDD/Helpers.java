package EDD;

// @author andresbucarello

import Gui.Checkout;
import Gui.GestionVuelto;
import Gui.GestionarInventario;
import Gui.Menu;
import Gui.Pagos;
import Gui.RegistrarCompra;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Helpers {
    
    public Helpers(){
    }
    
    public void volverMenu(JFrame frame){
        frame.setVisible(false);
        Menu menu = new Menu();
        menu.show();
    }
    
    public void irVuelto(JFrame frame){
        frame.setVisible(false);
        GestionVuelto vuelto = new GestionVuelto();
        vuelto.show();
    }
    
    public void irCheckout(JFrame frame){
        frame.setVisible(false);
        Checkout checkout = new Checkout();
        checkout.show();
    }
    
    public void registrarCompra(JFrame frame){
        frame.setVisible(false);
        RegistrarCompra opcion1 = new RegistrarCompra();
        opcion1.show();
    }
    
    public void inventario(JFrame frame){
        frame.setVisible(false);
        GestionarInventario opcion2 = new GestionarInventario();
        opcion2.show();
    }
    
    public void pagos(JFrame frame){
        frame.setVisible(false);
        Pagos opcion3 = new Pagos();
        opcion3.show();
    }
    
    public void entrarPanel(JPanel panel){
        panel.setBackground(new Color(78, 0, 142));
    }
    
    public void salirPanel(JPanel panel){
        panel.setBackground(new Color(195, 70, 176));
    }
    
    public void entrarBoton(JLabel text, JPanel panel){
        panel.setBackground(new Color(195, 70, 176));
        text.setForeground(Color.white);
    }
    
    public void salirBoton(JLabel text, JPanel panel){
        panel.setBackground(Color.white);
        text.setForeground(Color.black);
    }
    
    public void entrarRetroceder(JLabel text,JPanel panel){
        text.setForeground(Color.white);
        panel.setBackground(Color.red);
    }
    
    public void salirRetroceder(JLabel text, JPanel panel){
        text.setForeground(Color.black);
        panel.setBackground(Color.white);
    }
}
