import java.util.Scanner;
public class Tax {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary");
        int n=sc.nextInt();
        if(n==10000){
        System.out.println("no tax");}
            if(n<10000&n>20000){
             int htax =(10*n)/100;
          System.out.println("your tax is "+htax);  }
            if(n<20000&n>30000){
             int htax=(15*n)/100;
            System.out.println("your tax is "+htax);}
            if(n<30000){
                    int htax=(25*n)/100;
                    System.out.println("your tax is "+htax);
                }
                
             }
        }
          

    
    

