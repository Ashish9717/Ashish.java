import java.util.Scanner;
public class Memu {
    public static void main(String[] args) {
        char operator;
        Double n1,n2,result;
        Scanner sc= new Scanner(System.in);
       // System.out.println("chose an opeartor:+,-,*,/");
        //29operator=sc.next().charAt(0);
        System.out.println("enter your fist input");
        double num1=sc.nextDouble();
        System.out.println("chose an opeartor:+,-,*,/");
        operator=sc.next().charAt(0);
        System.out.println("enter your second input");
        Double num2=sc.nextDouble();
        switch(operator){
            case '+':
            result=num1 +num2;
            System.out.println("output:" +result);break;
            case '*':
            result=num1*num2;
            System.out.println("output:" +result);break;
            case '-':
            result=num1-num2;
            System.out.println("output:"+result);break;
            case '/':
            result=num1/num2;
            System.out.println("output:" +result);break;
        }
    }
    
}
