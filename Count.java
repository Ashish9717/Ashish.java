import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your digit");
        int n=sc.nextInt();
        int i;
        for(i=0;i<=n;++i){
            while(i!=0);
            n %=10;
            ++i;
           System.out.println("number of digit:"+i);}
    }
    
}
