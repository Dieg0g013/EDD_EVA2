package eva2_4_queue;

public class EVA2_4_QUEUE {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.push(10);
        queue.push(20);
        queue.push(30);


        System.out.println("Fila:");
        queue.imprimir();


        System.out.println("Primero: " + queue.peek());
        System.out.println("Elemento borrado: " + queue.pop());
        System.out.println("Fila cuando ya quitamos uno:");
        queue.imprimir();
    }
}