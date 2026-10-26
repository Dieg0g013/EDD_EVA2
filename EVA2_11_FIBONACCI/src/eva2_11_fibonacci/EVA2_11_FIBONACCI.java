package eva2_11_fibonacci;
public class EVA2_11_FIBONACCI {
   public static void main(String[] args) {
      System.out.println("Fibonnaci(0) = " + Fibo(0));
   
   
   }
   
public static int Fibo(int posi) {
        if(posi > 1)
           return Fibo(posi - 2) + Fibo(posi - 1);
        else
           return 1;
}

}
