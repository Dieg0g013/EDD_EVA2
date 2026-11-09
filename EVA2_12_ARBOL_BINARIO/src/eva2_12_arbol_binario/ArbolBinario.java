/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_12_arbol_binario;
public class ArbolBinario {
   private Nodo root;
   
   public ArbolBinario(){
      root = null;
   }
   public void agregar(int valor){
      //Esta vacio el arbol
      if (root == null) {//arbol vacio
         root = new Nodo (valor);//inserte el valor
         
      }else{
         agregarRecu(root, valor);
         
      }
   }
   
   private void agregarRecu(Nodo actual, int valor){
      if (valor  > actual.getValor()) {//A la derecha
         if (actual.getDerecha() != null) {//ocupado
            agregarRecu(actual.getDerecha(), valor);
         }else{//disponible
            actual.setDerecha(new Nodo(valor));
            
         }
         
      }else if (valor < actual.getValor()) {//A la izquierda
         if (actual.getIzquierda() != null){ //ocupado 
         agregarRecu(actual.getIzquierda(), valor);
         }else{//disponible
            actual.setIzquierda(new Nodo(valor));
         
      }//else --> el valor esta repetido
      }
   }
      public void preOrder(){
         preOrderRecu(root);
         System.out.println("");
         
         
      }
      private void preOrderRecu(Nodo actual){
         if (actual != null) {
            System.out.println(actual.getValor());

         System.out.println(actual.getValor());
         preOrderRecu(actual.getIzquierda());//Leer el lado izquierdo
         preOrderRecu(actual.getDerecha());//Leer el lado derecho
         }
      
   }
   
}
