
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        root = null;
    }

    public void agregar(int valor) {
        if (root == null) {
            root = new Nodo(valor);
        } else {
            agregarRecu(root, valor);
        }
    }

    private void agregarRecu(Nodo actual, int valor) {
        if (valor > actual.getValor()) {
            if (actual.getDerecha() != null) {
                agregarRecu(actual.getDerecha(), valor);
            } else {
                actual.setDerecha(new Nodo(valor));
            }

        } else if (valor < actual.getValor()) {
            if (actual.getIzquierda() != null) {
                agregarRecu(actual.getIzquierda(), valor);
            } else {
                actual.setIzquierda(new Nodo(valor));
            }
        }
    }

    // Raiz a Izquierda a Derecha
    public void preOrder() {
        preOrderRecu(root);
    }

    private void preOrderRecu(Nodo actual) {
        if (actual != null) {
            System.out.println(actual.getValor());
            preOrderRecu(actual.getIzquierda());
            preOrderRecu(actual.getDerecha());
        }
    }

    // Izquierda a Raiz a Derecha
    public void inOrder() {
        inOrderRecu(root);
    }

    private void inOrderRecu(Nodo actual) {
        if (actual != null) {
            inOrderRecu(actual.getIzquierda());
            System.out.println("[" + actual.getValor() + "]");
            inOrderRecu(actual.getDerecha());
        }
    }

    // Izquierda a Derecha a Raiz
    public void postOrder() {
        postOrderRecu(root);
    }

    private void postOrderRecu(Nodo actual) {
        if (actual != null) {
            postOrderRecu(actual.getIzquierda());
            postOrderRecu(actual.getDerecha());
            System.out.println("[" + actual.getValor() + "]");
        }
    }
}
