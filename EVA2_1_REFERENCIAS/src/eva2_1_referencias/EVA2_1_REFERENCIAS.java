
package eva2_1_referencias;
public class EVA2_1_REFERENCIAS {
   public static void main(String[] args) {
      ejemplo inicio = new ejemplo();
      inicio.valor = 100;
      System.out.println("inicio = " + inicio);
      System.out.println("inicio.valor = " + inicio.valor);
      System.out.println("inicio.otro = " + inicio.otro);
      //crear una lista:
      inicio.otro = new ejemplo();
      inicio.otro.valor = 200; //segundo objeto
      inicio.otro.otro = new ejemplo();
      inicio.otro.otro.valor = 300;
      inicio.otro.otro.otro= new ejemplo();
      inicio.otro.otro.otro.valor = 400;
      
      ejemplo sig = inicio;
      while(sig != null){
         System.out.print("[" + sig.valor + "]");
         sig = sig.otro;
      }
   }
   
}
class ejemplo{
   int valor;
   ejemplo otro;
}
