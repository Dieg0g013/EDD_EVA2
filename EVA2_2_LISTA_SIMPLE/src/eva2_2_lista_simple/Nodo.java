package eva2_2_lista_simple;

public class Nodo {
    private int dato;
    private Nodo siguiente;

    public Nodo() {
        dato = 0;
        siguiente = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        siguiente = null;
    }

    public int getValor() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setValor(int dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
