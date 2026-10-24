/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_lista_doble;
public class EVA2_3_LISTA_DOBLE {
   public static void main(String[] args) {
      ListaDoble lista = new ListaDoble();
      lista.agregar(100);
      lista.agregar(200);
      lista.agregar(300);
      lista.agregar(400);
      lista.agregar(500);
      lista.imprimir();
      lista.imprimirInv();
      lista.insertarEn(483, 3);
        lista.imprimir();
        System.out.println("Tamano despues de insertar: " + lista.longitud());
        lista.borrarEn(1);
        lista.imprimir();
        System.out.println("Tamano despues de borrar: " + lista.longitud());
        lista.imprimirInv();
   }
   
}
