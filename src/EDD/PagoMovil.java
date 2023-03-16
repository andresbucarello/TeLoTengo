package EDD;

// @author andresbucarello

public class PagoMovil {
    
    private PagoMovil siguiente;
    private float monto;
    private int referencia;
    
    public PagoMovil(float monto, int referencia){
        this.siguiente = null;
        this.monto = monto;
        this.referencia = referencia;
    }

    /**
     * @return the siguiente
     */
    public PagoMovil getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(PagoMovil siguiente) {
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
     * @return the referencia
     */
    public int getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }
    
    
}
