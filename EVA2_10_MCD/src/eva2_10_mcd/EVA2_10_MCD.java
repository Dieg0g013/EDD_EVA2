
package eva2_10_mcd;
public class EVA2_10_MCD {
   //Maximo comun divisor
   public static void main(String[] args) {
      
   }
   public static int mcd(int dividendo, int divisor){
      int resu = dividendo / divisor;
      int residuo = dividendo % divisor;
      System.out.println(residuo);
      if(residuo == 0){
         return divisor;
      }else{
         return mcd(divisor, residuo);
      }
   }
}
