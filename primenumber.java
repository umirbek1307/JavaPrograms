import java.util.*;
  
  public class primenumber{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
  
      System.out.println("Enter the number:");
           int n = scn.nextInt();
           boolean isprime=true;
           for(int div = 2; div*div <=n; div++) 
           {
               if (n%div==0) {
                   isprime=false;
                   break;
               }
           }
           if (isprime== true) {
               System.out.println("prime");
           }
           else {
                System.out.println("not prime");
           }
       }
  
   }
  
