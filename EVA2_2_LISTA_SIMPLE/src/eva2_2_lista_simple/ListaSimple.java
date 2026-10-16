package eva2_2_lista_simple;

public class ListaSimple {

    private Nodo inicio;
    private Nodo fin;
    private int tama;

    public ListaSimple() {
        inicio = null;//Al hacer una lista se crea vacia
        fin = null;
    }

    //Siempre se agrega al final de la lista
    //Version1: O(N) se agrega al final y se recorren todos
    //Version mejorada: O(N) O(1)
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);//Creo el nodo para el valor a insertar
        if (inicio == null) {//Si mi lista esta vacia, en este caso si
            inicio = nuevo;//Nuevo es el primer nodo de la lista
            fin = nuevo;
        } else {//Lista con nodos
           //Movernos al final
           /*Nodo temp = inicio;
           while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
           }
           temp.setSiguiente(nuevo);//Conecto nuevo al final de la lista
           */
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }

        tama++;
    }

    // Imprimir lista normal O(N)
    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println();
    }

    // Imprimir lista inversa
    public void imprimirInv() {
        int tama = longitud();
        for (int i = tama - 1 ; i >= 0; i--) {
            System.out.print("[" + valorEn(i) + "]");
        }
        System.out.println("");
    }

    private void imprimirInverso(Nodo temp) {
        if (temp == null) {
            return;
        }

        imprimirInverso(temp.getSiguiente());
        System.out.print("[" + temp.getValor() + "]");
    }

    // Obtener longitud O(1)
    public int longitud() {
        return tama;
        /*int cont = 0;
        Nodo temp = inicio;
        while(temp != null){
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;*/
    }

    // Comprobar si la lista está vacía
    public boolean ListaVacia() {
        if(inicio == null) {//lista vacía, en este caso si
            return true;
        }else{//LISTA CON NODOS
            return false;
        }
    }

    // Vaciar lista
    public void vaciarLista() {
        inicio = null;
    }
    //validar que posición tenga un valor válido
    //O(?)

    // Obtener valor en una posición
    public int valorEn(int posicion) {
        //excepción
        //VALIDAR posición
        int tama = longitud();
        if(posicion >= 0 && posicion < tama) {//POSICIÓN VÁLIDA
            //que posiciones son válidas aqui, de 0 a N -1 (N es la cantidad de nodos)
            Nodo temp = inicio;
            for (int i = 0; i < posicion; i++) {
                temp = temp.getSiguiente();
            }
            return temp.getValor();
        }else{//POSICIÓN NO VÁLIDA
            throw new RuntimeException("La posición " + posicion + "no es válida");
        }
    }
    //Regresa la primer aparición del valor en la lista (posicion)
    //O(N)

    // Encontrar la primera aparición de un valor
    public int encontrar(int valor) {
        Nodo temp = inicio;
        int posicion = 0;

        while (temp != null) {
            if (temp.getValor() == valor) {
                return posicion;
            }

            posicion++;
            temp = temp.getSiguiente();
        }

        throw new RuntimeException("Valor no encontrado");
    }

    // Insertar en una posición
    public void insertarEn(int valor, int posicion) {
        if(posicion < 0 || posicion > longitud()) {
            throw new IndexOutOfBoundsException("Posicion no valida");
        } else{
            Nodo nuevo = new Nodo(valor);
            if(posicion == 0) { //INSERTAR AL INICIO
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                if(fin == null) { //LISTA VACIA
                    fin = nuevo;
                }
            } else if(posicion == longitud()) { //INSERTAR AL FINAL
                fin.setSiguiente(nuevo);
                fin = nuevo;
            } else{ //INSERTAR EN EL MEDIO
                Nodo temp = inicio;
                for(int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                //CONECTAR
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
        tama++;
    }

    // Borrar en una posición
    public void borrarEn(int posicion) {
        if (posicion < 0 || posicion >= longitud()) {
            throw new RuntimeException("Posición no válida");
        } else {
            if (posicion == 0) {
                inicio = inicio.getSiguiente();
                if (inicio == null) { // Si la lista quedó vacía
                    fin = null;
                }
            } else {
                Nodo temp = inicio;
                for (int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if (temp.getSiguiente() == null) {
                    fin = temp;
                }
            }
            tama--;
        }
    }
}