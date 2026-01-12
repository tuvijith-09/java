// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class OverloadDemo {
   OverloadDemo() {
   }

   int add(int var1, int var2) {
      return var1 + var2;
   }

   int add(int var1, int var2, int var3) {
      return var1 + var2 + var3;
   }

   double add(double var1, double var3) {
      return var1 + var3;
   }

   public static void main(String[] var0) {
      OverloadDemo var1 = new OverloadDemo();
      System.out.println("Sum of 2 integers: " + var1.add(10, 20));
      System.out.println("Sum of 3 integers: " + var1.add(10, 20, 30));
      System.out.println("Sum of 2 doubles: " + var1.add(5.5, 4.5));
   }
}
