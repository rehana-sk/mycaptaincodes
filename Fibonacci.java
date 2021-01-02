import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();
       System.out.println("no.of terms to be printed:");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           System.out.print( +x +"\t");
           int nextterm=x+y;
           x=y;
           y=nextterm;
       }
    }
    
}
