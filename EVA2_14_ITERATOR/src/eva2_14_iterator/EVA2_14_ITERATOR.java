/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class EVA2_14_ITERATOR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {//O(N2)
      LinkedList<Integer> lista = new LinkedList<>();
      /*lista.add(100);//0
      lista.add(200);//1
      lista.add(300);//2
      lista.add(400);//3
      lista.add(500);//4*/
      for (int i = 0; i < 1000000; i++) {
         lista.add((int) (Math.random() * 1000));
         
      }
      System.out.println("Cantidad de nodos: " + lista.size());
      
      /*int promedio = 0;
      for (int i = 0; i < 1000000; i++) {
         promedio += lista.get(i);
         
      }
      System.out.println("Sumatoria : " + promedio);*/
      Iterator<Integer> iterador = lista.iterator();
      int promedio = 0;
      while(iterador.hasNext()){
         promedio += iterador.next();
      }
      System.out.println("Sumatoria = " + promedio);
      System.out.println("Promedio = " + (promedio / 1000000.0));
      
   }
   
}
