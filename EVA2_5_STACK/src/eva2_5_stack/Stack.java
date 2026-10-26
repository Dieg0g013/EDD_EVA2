
package eva2_5_stack;

public class Stack {
    private Nodo inicio;
    private Nodo fin;
    public int longitud;

    public Stack() {
        inicio = null;
        fin = null;
        longitud = 0;
    }

    public void imprimir() {
        Nodo temp = inicio;
        while(temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    public int longitud() {
        return this.longitud;
    }

    public boolean listaVacia() {
        return inicio == null;
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        longitud = 0;
    }

    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if(listaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
        longitud++;
    }

    public void inversa() {
        Nodo temp = fin;
        while(temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getAnterior();
        }
        System.out.println("");
    }

    public int valorEn(int posicion) {
        if(posicion < 0 || posicion >= this.longitud) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else {
            Nodo temp = inicio;
            for(int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        }
    }

    public void insertarEn(int valor, int posicion) {
        if(posicion < 0 || posicion > longitud) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        Nodo nuevo = new Nodo(valor);
        if(posicion == 0) {
            nuevo.setSiguiente(inicio);
            if(inicio != null) {
                inicio.setAnterior(nuevo);
            }
            inicio = nuevo;
            if(fin == null) {
                fin = nuevo;
            }
        } else if(posicion == longitud) {
            agregar(valor);
            return;
        } else {
            Nodo temp = inicio;
            for(int i = 0; i < (posicion - 1); i++) {
                temp = temp.getSiguiente();
            }
            Nodo siguienteNodo = temp.getSiguiente();
            nuevo.setSiguiente(siguienteNodo);
            nuevo.setAnterior(temp);
            if(siguienteNodo != null) {
                siguienteNodo.setAnterior(nuevo);
            }
            temp.setSiguiente(nuevo);
        }
        longitud++;
    }

    public void borrarEn(int posicion) {
        if(posicion < 0 || posicion >= longitud) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        if(posicion == 0) {
            inicio = inicio.getSiguiente();
            if(inicio != null) {
                inicio.setAnterior(null);
            } else {
                fin = null;
            }
        } else if(posicion == (longitud - 1)) {
            fin = fin.getAnterior();
            if(fin != null) {
                fin.setSiguiente(null);
            } else {
                inicio = null;
            }
        } else {
            Nodo temp = inicio;
            for(int i = 0; i < (posicion - 1); i++) {
                temp = temp.getSiguiente();
            }
            Nodo nodoAEliminar = temp.getSiguiente();
            Nodo nodoSiguiente = nodoAEliminar.getSiguiente();
            
            temp.setSiguiente(nodoSiguiente);
            if(nodoSiguiente != null) {
                nodoSiguiente.setAnterior(temp);
            }
        }
        longitud--;
    }

    public void push(int valor) {
        agregar(valor);
    }

    public int peek() {
        if (listaVacia()) {
            throw new IllegalStateException("Vacio");
        }
        return valorEn(longitud - 1);
    }

    public int pop() {
        if (listaVacia()) {
            throw new IllegalStateException("Vacio");
        }
        int valor = valorEn(longitud - 1);
        borrarEn(longitud - 1);
        return valor;
    }
}