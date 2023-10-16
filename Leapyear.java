import java.util.Scanner;
public class Leapyear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your year");
        int n=sc.nextInt();
        if(n%4==0){
            System.out.println("given year is leap year");
            if(n%100==0){
                System.out.println("given year is leap year");
                if(n%400==0){
                    System.out.println("given year is leap year");
                }else{
                    System.out.println("guven year is not leapyear");
                }
            }else{
                System.out.println("given year is not leapyear");
            }
        }
    }
    
}
