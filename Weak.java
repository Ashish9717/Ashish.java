import java.util.Scanner;
public class Weak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        String day=sc.nextLine();
        switch(day){
            case "monday":{
                System.out.println("this is weak day");
                break;
            }
        case "tuesday":
            System.out.println("this is weak day");break;
        
        case "wednesday":System.out.println("this is  weak day");
    break;
         case "thrusday":System.out.println("this is  weak day");
           break;
         case "friday":System.out.println("this is weak day");
            break;
         case "saturday":
           System.out.println("this is holiday");
            break;
         case "sunday":System.out.println("this is holiday");
             break;
        }
    }
    
}
