public class MyClass {
    public static void main(String args[]) {
      //Implicit type casting
      int i=100;
      //automatic type conversion
      long l=i;
      //automatic type conversion
      float f=l;

      System.out.println("Int value= " + i);
      System.out.println("Long value= " + l);
      System.out.println("Float value= " + f);
      
     //Explicit type casting
      double d=100.5;
      //Explicit type casting
      int in= int(d);
      
      System.out.println("Double value= " + d);
      System.out.println("Int value= " + in);
      
    }
}