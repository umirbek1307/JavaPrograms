import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       int t = scn.nextInt(); 
       for(int i=1; i<=t; i++)
       {
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
  }
