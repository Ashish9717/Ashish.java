import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        float weight=sc.nextFloat();
        System.out.println("enter Height your in meters");
        float Height=sc.nextFloat();
        float Bmi=weight/(Height*Height);
        System.out.println("Bmi"+Bmi);
    }
    
}
