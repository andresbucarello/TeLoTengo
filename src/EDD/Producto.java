package EDD;

// @author andresbucarello

public class Producto {
    
    private Producto siguiente;
    private String nombre;
    private int precio;
    private int cantidad;
    
    public Producto(String nombre, String cantidad, String precio){
        this.siguiente = null;
        this.nombre = nombre;
        this.cantidad = Integer.parseInt(cantidad);
        this.precio = Integer.parseInt(precio);
    }
    
    /**
     * @return the siguiente
     */
    public Producto getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Producto siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}