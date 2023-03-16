package EDD;

// @author andresbucarello

public class ListaPagoMovil {
    
    private PagoMovil primero;
    private PagoMovil ultimo;
    private int cantidad;

    public ListaPagoMovil() {
        this.primero = null;
        this.ultimo = null;
        this.cantidad = 0;
    }

    public boolean estaVacia() {
        return this.cantidad == 0;
    }

    public void agregar(boolean inicio, PagoMovil nuevo) {
        if (estaVacia()) {
            this.primero = this.ultimo = nuevo;
        } else {
            if (inicio) {
                nuevo.setSiguiente(this.primero);
                this.primero = nuevo;
            } else {
                this.ultimo.setSiguiente(nuevo);
                this.ultimo = nuevo;
            }
        }
        this.cantidad++;
    }

    public void print() {
        PagoMovil temp = this.getPrimero();
        String productosActuales = "";
        for (int i = 0; i < this.getCantidad(); i++) {
            productosActuales += temp.getMonto()+ "," + temp.getReferencia()+ "\n";
            temp = temp.getSiguiente();
        }
        System.out.println(productosActuales);
    }

    /**
     * @return the primero
     */
    public PagoMovil getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(PagoMovil primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public PagoMovil getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(PagoMovil ultimo) {
        this.ultimo = ultimo;
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
