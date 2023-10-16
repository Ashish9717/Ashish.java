import java.util.Scanner;
public class Atm {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1.Balance enquiry");
        System.out.println("2.Deposite money");
        System.out.println("3.Withdwar");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:{
            double Balance=5100.45;
            System.out.println("your Balance is"+Balance);
        break;}
            case 2:{
                System.out.println("Enter deposite amount");
                double b=sc.nextDouble();
                double Balance=5100.45;
                double newbalance=5100.45+b;
                System.out.println("your current balance is"+newbalance);
                break;
            }
            case 3:{
                System.out.println("Enter your withdwar ammount");
                double w=sc.nextDouble();
                double newbalance=5100.45-w;
                System.out.println("your current balance is"+newbalance);
                break;

            }

        }
    }
    
}
