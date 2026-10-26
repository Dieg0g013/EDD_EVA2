
package eva2_5_stack;
public class EVA2_5_STACK {
   public static void main(String[] args) {
    Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack:");
        stack.imprimir();
        System.out.println("Último: " + stack.peek());
        System.out.println("Stack después de quitar");
        stack.imprimir();
    }
}

 
