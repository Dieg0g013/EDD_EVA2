
public class Nodo {
   //DOS ATRIBUTOS
   private int valor;
   private Nodo derecha;
   private Nodo izquierda;
   //CONSTRUCTORES;
   
   public Nodo(){
      this.izquierda = null;//Esto es muy importante, marca el fin de la lista
      this.derecha = null;
   }
   
   public Nodo(int dato){//Poner el valor a guardar al momento de crear el nodo
      this.valor = valor;
      izquierda = null;
      derecha = null;
   }

   public Nodo getDerecha() {
      return derecha;
   }

   public Nodo getIzquierda() {
      return izquierda;
   }

   public void setDerecha(Nodo derecha) {
      this.derecha = derecha;
   }

   public void setIzquierda(Nodo izquierda) {
      this.izquierda = izquierda;
   }

   public int getValor() {
      return valor;
   }

   public void setValor(int valor) {
      this.valor = valor;
   } 
}
