import java.util.Scanner;

public class Rozdeleni {
   public static void main(String args[]){

      int cislo;
      Scanner sc = new Scanner(System.in);
      System.out.print("Zadej cislo:");
      cislo = sc.nextInt();
      
      for(int i = 2; i< cislo; i++) {
         while(cislo % i == 0) {
            System.out.print(i+"  ");
            cislo = cislo/i;
         }
      }

      if(cislo > 2) {
         System.out.print(cislo);
      }
   }
}