import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        String month=sc.nextLine();
        switch(month){
            case "january":System.out.println("this is spring");break;
            case "febuary":System.out.println("this is spring");break;
            case "march":System.out.println("this is spring");break;
            case "april":System.out.println("this is summer");break;
            case "may":System.out.println("this is summer");break;
            case "june":System.out.println("this is summer");break;
            case "july":System.out.println("this is monsoon");     break;                 
             case "august":System.out.println("this is monsoon");break;
            case "september":System.out.println("this is monsoon");break;
            case "october":System.out.println("this is winter");break;
            case "november":System.out.println("this is winter");break;
            case "december":System.out.println("this is winter");      break;                                                                              
            
                                                                                    
        }
    }
    
}
