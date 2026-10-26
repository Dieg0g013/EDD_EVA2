
package eva2_4_queue;
public class Nodo {
    private int valor;
    private Nodo siguiente;
    private Nodo anterior; 

    public Nodo() {
        siguiente = null; //fin
        anterior = null; //inicio
    }
    public Nodo(int valor) { //valor guardado
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }
}

