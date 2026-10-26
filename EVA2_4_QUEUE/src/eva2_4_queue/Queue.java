package eva2_4_queue;

public class Queue {
    private Nodo inicio;
    private Nodo fin;
    public int longitud;

    public Queue() {
        inicio = null;
        fin = null;
        longitud = 0;
        
    }
    //Metodos conocidos
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
        if(posicion == 0) { // insertar al inicio
            nuevo.setSiguiente(inicio);
            if(inicio != null) {
                inicio.setAnterior(nuevo);
            }
            inicio = nuevo;
            if(fin == null) { 
                fin = nuevo;
            }
        } else if(posicion == longitud) {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
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
    //Nuevos: push, peek y pop
    public void push(int valor) {
        agregar(valor);
    }
    public int peek() {
        if (listaVacia()) {
            throw new IllegalStateException("Vacio");
        }
        return valorEn(0); 
    }
    public int pop() {
        if (listaVacia()) {
            throw new IllegalStateException("Vacio");
        }
        int valor = valorEn(0);
        borrarEn(0);
        return valor;
    }
}