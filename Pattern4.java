import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            if(i==1||i==n)
            for( int j=1;j<=n;j++){
                System.out.print("*");
            }
            else{
                for( int j=1;j==n;j++){
                    if(j==1||j==n)
                    System.out.print("*");
                    else
                        System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
        
    }
    
}
