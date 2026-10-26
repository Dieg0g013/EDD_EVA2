
package eva2_8_recursividad;
public class EVA2_8_RECURSIVIDAD {
   public static void main(String[] args) {
      imprimirCiclo(5);
      imprimirRecu(5);
   }
   public static void imprimirCiclo(int numero){
      for (int i = numero; i >= 1; i--) {
         System.out.print(i + " - ");
         
      }
      System.out.println("");
   }
   public static void imprimirRecu(int numero){
      //RESUELVA UNA PARTE DEL PROBLEMA
      System.out.print(numero + " - ");
      //SE LLAME A SI MISMO
      if(numero > 1)//DETENER LA RECURSIVIDAD
      imprimirRecu(numero - 1);
      
   }
}
