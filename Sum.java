import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your digit");
        int n=sc.nextInt();
        int ans=0;
        int r=0;
        while(n!=0){
            r=n%10;
            ans=ans+r;
            n=n/10;
            // System.out.println("your output is"+ans);
        }
        System.out.println(ans);
    }
    
}
