import java.util.*;
  
  public class pythogorantriplet{
  
  public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c= scn.nextInt();
        if((a*a) ==(b*b)+(c*c)) {
            System.out.print ("true");
            
        }
         else if ((b*b) ==(a*a)+(c*c)) {
            System.out.print ("true");
            
        }
        else if((c*c) ==(b*b)+(a*a)) {
            System.out.print ("true");
            
        } 
        else{
            System.out.print("false");
        }
  }
      
  }