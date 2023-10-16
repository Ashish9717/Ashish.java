import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your temp");
        float cel=sc.nextFloat();
        float fahrenheit=cel*9/5+32;
        System.out.println("cel temp is"+cel);
        System.out.println("fahrenheit temp is"+fahrenheit);
    }
    
}
