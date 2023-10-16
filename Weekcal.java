import java.util.Scanner;

public class Weekcal {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
          int n=sc.nextInt();
        switch(n){
            case 1: System.out.println("Hi,Today is sunday");
            break;
            case 2: System.out.println("Hi,Today is Monday");
            break;
            case 3: System.out.println("Hi,Today is tuesday");
            break;
            case 4:System.out.println("Hi,today is wednesday");
            break;
            case 5:System.out.println("Hi,Today is thrusday");
            break;
            case 6:System.out.println("Hi,today is friday");
            break;
            case 7:System.out.println("Hi,Today is saturday");
            break;
            
        }
    }
    
    
}
