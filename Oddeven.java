import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("a is even");
        }
        else 
        System.out.println("a is odd");
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        if(b%2==0){
            System.out.println("b is even");
        }
        else
        System.out.println("b is odd");

    }
    
}
