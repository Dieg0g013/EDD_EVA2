package eva2_2_lista_simple;

public class EVA2_2_LISTA_SIMPLE {

    public static void main(String[] args) {

        ListaSimple lista = new ListaSimple();

        System.out.println("Tamano de la lista: " + lista.longitud());

        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);

        lista.imprimir();
        System.out.println("Tamano de la lista: " + lista.longitud());
        System.out.println("Valor de la posicion 4: " + lista.valorEn(4));
        System.out.println("Valor 100 de la posicion: " + lista.encontrar(100));
        System.out.println("Valor 300 de la posicion: " + lista.encontrar(300));
        System.out.println("Valor 500 de la posicion: " + lista.encontrar(500));
        lista.insertarEn(483, 3);
        lista.imprimir();
        System.out.println("Tamano despues de insertar: " + lista.longitud());
        lista.borrarEn(1);
        lista.imprimir();
        System.out.println("Tamano despues de borrar: " + lista.longitud());
        lista.imprimirInv();
    }
}