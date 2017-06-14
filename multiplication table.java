import java.util.Scanner;
class Multiplication Table
{
   public static void main(String args[])
   {
      int n, a;
      System.out.println("Enter an integer to print it's multiplication table");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      System.out.println("Multiplication table of "+n+" is :-");
 
      for ( a = 1 ; a<= 10 ; ++ )
         System.out.println(n+"*"+a+" = "+(n*a));
   }
}
