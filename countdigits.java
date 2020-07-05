import java.util.*;
  
  public class countdigits{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    
int count = 0;
while (n!=0)
{
    count++;
    int q = n / 10;
    n=q;
    
}
System.out.print(count);
   }
 
  }