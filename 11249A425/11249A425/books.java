// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class books {
   public books() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      String[] var2 = new String[10];
      System.out.println("Enter 10 Book Titles:");

      for(int var3 = 0; var3 < 10; ++var3) {
         var2[var3] = var1.nextLine();
      }

      System.out.println("Books Starting with 'A':");

      for(int var4 = 0; var4 < 10; ++var4) {
         if (var2[var4].startsWith("A") || var2[var4].startsWith("a")) {
            System.out.println(var2[var4]);
         }
      }

      var1.close();
   }
}
