import java.util.Scanner;
public class Netsalary {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
          System.out.println("Enter your basicsalary");
     int basicsalary=sc.nextInt();
     int pf=1500;
     float hra=(basicsalary*30)/100;
     float ta=(basicsalary*20)/100;
     float da=(basicsalary*10)/100;
System.out.println("hra"+basicsalary*0.3);
     System.out.println("ta"+basicsalary*0.2);
     System.out.println("da"+basicsalary*0.1);
     float salary=basicsalary+hra+ta+da-pf;
     System.out.println("salary"+salary);
    }

    
}
