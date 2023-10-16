import java.util.Scanner;
public class Percent {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter student name");
        String name=sc.nextLine();
       // System.out.println("name"+name);
        System.out.println("enter your subjects");
        int sujects=sc.nextInt();
        Scanner Aa=new Scanner(System.in);
        System.out.println("enter your maths marks");
        float maths=sc.nextFloat();
        System.out.println("enter your hindi marks");
        float hindi=sc.nextFloat();
        System.out.println("enter your bio marks ");
        float bio=sc.nextFloat();
        System.out.println("enter your phy marks");
        float phy=sc.nextFloat();
        System.out.println("enter your chem marks");
        float chem=sc.nextFloat();
        System.out.println("chem"+chem);
                System.out.println("bio"+bio);
                        System.out.println("hindi"+hindi);
        System.out.println("maths"+maths);
        System.out.println("phy"+phy);


        float totalavg=(maths +hindi+phy+bio+chem)/5;
        float marksper=(maths+hindi+phy+bio+chem)*10/50;
        float totalsum=(maths+hindi+phy+bio+chem);
        System.out.println("totalavg"+totalavg);
        System.out.println("marksper"+marksper);
        System.out.println("totalsum"+totalsum);
    }
    
}
