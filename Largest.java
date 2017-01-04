import java.util.Scanner;
 
class Largest
{
   public static void main(String args[])
   {
      int a,b,c;
      System.out.println("Enter three integers ");
      Scanner sc = new Scanner(System.in);
 
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
 
      if ( a > b && a > c )
         System.out.println("First number "+a+" is largest");
      else if ( b > a && b > c )
         System.out.println("Second number "+b+" is largest");
      else 
         System.out.println("Third number "+c+ " is largest"); 
   }  
         
}
