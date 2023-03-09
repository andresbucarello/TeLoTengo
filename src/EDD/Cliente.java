package EDD;

// @author andresbucarello

public class Cliente {
    
    private String nombre;
    private String apellido;
    private int cedula;
    private ListaCompras compras;

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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the compras
     */
    public ListaCompras getCompras() {
        return compras;
    }

    /**
     * @param compras the compras to set
     */
    public void setCompras(ListaCompras compras) {
        this.compras = compras;
    }

}
