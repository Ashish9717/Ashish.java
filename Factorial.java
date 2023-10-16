import java.util.*;
public class Factorial {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number");
       int n=sc.nextInt();
       int r=0;
      // int ans;
      for(int i=1;i==n;i++){
       // if(r==n*(n-1)){
        r=n*(n-1);
        System.out.println(+r);
      }
      System.out.println();
    }
    
}
