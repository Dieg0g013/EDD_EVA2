package eva2_3_lista_doble;
public class Nodo {
   //DOS ATRIBUTOS
   private int dato;
   private Nodo siguiente;
   private Nodo previo;
   //CONSTRUCTORES;
   
   public Nodo(){
      siguiente = null;//Esto es muy importante, marca el fin de la lista
      previo = null;
   }
   
   public Nodo(int dato){//Poner el valor a guardar al momento de crear el nodo
      this.dato = dato;
      siguiente = null;
      previo = null;
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

   public Nodo getPrevio() {
      return previo;
   }

   public void setPrevio(Nodo previo) {
      this.previo = previo;
   }
   
   

    
}
