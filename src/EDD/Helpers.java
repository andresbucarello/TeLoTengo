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
import EDD.ListaProductos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Helpers {

    public Helpers() {
    }

    public Producto buscarProducto(String name, ListaProductos productos) {
        Producto temp = productos.getPrimero();
        for (int i = 0; i < productos.getCantidad(); i++) {
            if (temp.getNombre().equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.getSiguiente();
        }
        return null;
    }

    public int validarInt(String num) {
        try {
            int stock = Integer.parseInt(num);
            if (stock <= 0) {
                JOptionPane.showMessageDialog(null, " ERROR EL DATO INGRESADO NO ES VALIDO, DEBE SER UN NUMERO ");
                return 0;
            }
            return stock;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ERROR EL DATO INGRESADO NO ES VALIDO, DEBE SER UN NUMERO ");
            return 0;
        }
    }

    public float validarFloat(String num) {
        try {
            float stock = Float.parseFloat(num);
            if (stock <= 0) {
                JOptionPane.showMessageDialog(null, " ERROR EL MONTO INGRESADO NO ES VALIDO ");
                return 0;
            }
            return stock;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " ERROR EL MONTO INGRESADO NO ES VALIDO ");
            return 0;
        }
    }

    public boolean validacion() {
        String[] array = {" NO ", " SI "};
        int opcion = JOptionPane.showOptionDialog(null, "¿Estas seguro?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
        if (opcion == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void escribirTxt(ListaProductos productos) {
        String productosActuales = "";
        if (!productos.estaVacia()) {
            Producto temp = productos.getPrimero();
            for (int i = 0; i < productos.getCantidad(); i++) {
                productosActuales += temp.getNombre() + "," + temp.getCantidad() + "," + temp.getPrecio() + "\n";
                temp = temp.getSiguiente();
            }
            try {
                PrintWriter pw = new PrintWriter("test//Productos.txt");
                pw.print(productosActuales);
                pw.close();
                JOptionPane.showMessageDialog(null, " Guardado Exitoso ");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " ERROR DE GUARDADO ");
            }
        }
    }

    public ListaProductos leerTxt() {
        ListaProductos productos = new ListaProductos();
        String line, productosTxt, path;
        productosTxt = "";
        path = "test//Productos.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        productosTxt += line + "\n";
                    }
                }
                if (!"".equals(productosTxt)) {
                    String[] productosSplit = productosTxt.split("\n");
                    for (int i = 0; i < productosSplit.length; i++) {
                        String[] product = productosSplit[i].split(",");
                        Producto nuevo = new Producto(product[0], product[1], product[2]);
                        productos.agregar(false, nuevo);
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, " Lectura Exitosa ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error de Lectura ");
        }
        return productos;
    }

    public void escribirZelles(ListaZelle productos) {
        String productosActuales = "";
        if (!productos.estaVacia()) {
            Zelle temp = productos.getPrimero();
            for (int i = 0; i < productos.getCantidad(); i++) {
                productosActuales += temp.getMonto() + "," + temp.getNombre() + "," + temp.getCodigo() + "\n";
                temp = temp.getSiguiente();
            }
            try {
                PrintWriter pw = new PrintWriter("test//Zelles.txt");
                pw.print(productosActuales);
                pw.close();
//                JOptionPane.showMessageDialog(null, " Guardado Exitoso ");
            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, " ERROR DE GUARDADO ");
            }
        }
    }

    public ListaZelle leerZelles() {
        ListaZelle zelles = new ListaZelle();
        String line, productosTxt, path;
        productosTxt = "";
        path = "test//Zelles.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        productosTxt += line + "\n";
                    }
                }
                if (!"".equals(productosTxt)) {
                    String[] productosSplit = productosTxt.split("\n");
                    for (int i = 0; i < productosSplit.length; i++) {
                        String[] product = productosSplit[i].split(",");
                        Zelle nuevo = new Zelle(Float.parseFloat(product[0]), product[1], product[2]);
                        zelles.agregar(false, nuevo);
                    }
                }
                br.close();
//                JOptionPane.showMessageDialog(null, " Lectura Exitosa ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error de Lectura ");
        }
        return zelles;
    }

    public void escribirPagosMoviles(ListaPagoMovil productos) {
        String productosActuales = "";
        if (!productos.estaVacia()) {
            PagoMovil temp = productos.getPrimero();
            for (int i = 0; i < productos.getCantidad(); i++) {
                productosActuales += temp.getMonto() + "," + temp.getReferencia() + "\n";
                temp = temp.getSiguiente();
            }
            try {
                PrintWriter pw = new PrintWriter("test//PagosMoviles.txt");
                pw.print(productosActuales);
                pw.close();
//                JOptionPane.showMessageDialog(null, " Guardado Exitoso ");
            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, " ERROR DE GUARDADO ");
            }
        }
    }

    public ListaPagoMovil leerPagosMoviles() {
        ListaPagoMovil zelles = new ListaPagoMovil();
        String line, productosTxt, path;
        productosTxt = "";
        path = "test//PagosMoviles.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        productosTxt += line + "\n";
                    }
                }
                if (!"".equals(productosTxt)) {
                    String[] productosSplit = productosTxt.split("\n");
                    for (int i = 0; i < productosSplit.length; i++) {
                        String[] product = productosSplit[i].split(",");
                        PagoMovil nuevo = new PagoMovil(Float.parseFloat(product[0]), Integer.parseInt(product[1]));
                        zelles.agregar(false, nuevo);
                    }
                }
                br.close();
//                JOptionPane.showMessageDialog(null, " Lectura Exitosa ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error de Lectura ");
        }
        return zelles;
    }

    public void escribirEfectivoBs(EfectivoBs productos) {
        String productosActuales = "";
        EfectivoBs temp = productos;
        productosActuales += temp.getMonto();
        try {
            PrintWriter pw = new PrintWriter("test//EfectivoBs.txt");
            pw.print(productosActuales);
            pw.close();
//                JOptionPane.showMessageDialog(null, " Guardado Exitoso ");
        } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, " ERROR DE GUARDADO ");
        }

    }

    public EfectivoBs leerEfectivoBs() {
        EfectivoBs montto = new EfectivoBs();
        String line, productosTxt, path;
        productosTxt = "";
        path = "test//EfectivoBs.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        productosTxt += line + "\n";
                    }
                }
                if (!"".equals(productosTxt)) {
                    float monto = Float.parseFloat(productosTxt);
                    montto.setMonto(monto);
                }
                br.close();
//                JOptionPane.showMessageDialog(null, " Lectura Exitosa ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error de Lectura ");
        }
        return montto;
    }
    
    public void escribirEfectivoUSD(EfectivoUSD productos) {
        String productosActuales = "";
        EfectivoUSD temp = productos;
        productosActuales += temp.getMonto();
        try {
            PrintWriter pw = new PrintWriter("test//EfectivoUSD.txt");
            pw.print(productosActuales);
            pw.close();
//                JOptionPane.showMessageDialog(null, " Guardado Exitoso ");
        } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, " ERROR DE GUARDADO ");
        }

    }
    
    public EfectivoUSD leerEfectivoUSD() {
        EfectivoUSD montto = new EfectivoUSD();
        String line, productosTxt, path;
        productosTxt = "";
        path = "test//EfectivoUSD.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        productosTxt += line + "\n";
                    }
                }
                if (!"".equals(productosTxt)) {
                    float monto = Float.parseFloat(productosTxt);
                    montto.setMonto(monto);
                }
                br.close();
//                JOptionPane.showMessageDialog(null, " Lectura Exitosa ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error de Lectura ");
        }
        return montto;
    }
    
    public void escribirPunto(Punto productos) {
        String productosActuales = "";
        Punto temp = productos;
        productosActuales += temp.getMonto();
        try {
            PrintWriter pw = new PrintWriter("test//Punto.txt");
            pw.print(productosActuales);
            pw.close();
//                JOptionPane.showMessageDialog(null, " Guardado Exitoso ");
        } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, " ERROR DE GUARDADO ");
        }

    }
    
    public Punto leerPunto() {
        Punto montto = new Punto();
        String line, productosTxt, path;
        productosTxt = "";
        path = "test//Punto.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        productosTxt += line + "\n";
                    }
                }
                if (!"".equals(productosTxt)) {
                    float monto = Float.parseFloat(productosTxt);
                    montto.setMonto(monto);
                }
                br.close();
//                JOptionPane.showMessageDialog(null, " Lectura Exitosa ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Error de Lectura ");
        }
        return montto;
    }

    public void irCheckout(JFrame frame, float ttlBs, float ttlUSD, float tasa, ListaZelle listaZelle, ListaPagoMovil listaPagoMovil, Punto montoPunto, EfectivoUSD montoEfectivoUSD, EfectivoBs montoEfectivoBs, ListaProductos lista) {
        frame.setVisible(false);
        Checkout checkout = new Checkout(frame, ttlBs, ttlUSD, tasa, listaZelle, listaPagoMovil, montoPunto, montoEfectivoUSD, montoEfectivoBs, lista);
        checkout.show();
    }

    // VERIFICADO
    public void registrarCompra(JFrame frame, ListaProductos lista_productos, ListaZelle listaZelle, ListaPagoMovil listaPagoMovil, Punto montoPunto, EfectivoUSD montoEfectivoUSD, EfectivoBs montoEfectivoBs) {
        //frame.setVisible(false);
        RegistrarCompra opcion1 = new RegistrarCompra(frame, lista_productos, listaZelle, listaPagoMovil, montoPunto, montoEfectivoUSD, montoEfectivoBs);
        opcion1.show();
    }

    public void inventario(JFrame frame, ListaProductos productos) {
        frame.setVisible(false);
        GestionarInventario opcion2 = new GestionarInventario(frame, productos);
        opcion2.show();
    }

    public void pagos(JFrame frame, ListaZelle listaZelle, ListaPagoMovil listaPagoMovil, Punto montoPunto, EfectivoUSD montoEfectivoUSD, EfectivoBs montoEfectivoBs) {
        frame.setVisible(false);
        Pagos opcion3 = new Pagos(frame, listaZelle, listaPagoMovil, montoPunto, montoEfectivoUSD, montoEfectivoBs);
        opcion3.show();
    }

    public void entrarPanel(JPanel panel) {
        panel.setBackground(new Color(78, 0, 142));
    }

    public void salirPanel(JPanel panel) {
        panel.setBackground(new Color(195, 70, 176));
    }

    public void entrarBoton(JLabel text, JPanel panel) {
        panel.setBackground(new Color(195, 70, 176));
        text.setForeground(Color.white);
    }

    public void salirBoton(JLabel text, JPanel panel) {
        panel.setBackground(Color.white);
        text.setForeground(Color.black);
    }

    public void entrarRetroceder(JLabel text, JPanel panel) {
        text.setForeground(Color.white);
        panel.setBackground(Color.red);
    }

    public void salirRetroceder(JLabel text, JPanel panel) {
        text.setForeground(Color.black);
        panel.setBackground(Color.white);
    }
}
