package EDD;

// @author andresbucarello

public class Zelle {
    
    private Zelle siguiente;
    private float monto;
    private String nombre;
    private String codigo;
    
    public Zelle(float monto, String nombre, String codigo){
        this.siguiente = null;
        this.monto = monto;
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    /**
     * @return the siguiente
     */
    public Zelle getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Zelle siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the monto
     */
    public float getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(float monto) {
        this.monto = monto;
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
