import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your range");
        int n=sc.nextInt();
       // int i=sc.nextInt();
       double i;
        for(i=0;i<=n;i++){
            if(i%2==0){
                System.out.println("even number is:"+i);
                }else{
                    System.out.println("odd no is:"+i);
                }
            }
        }
    }
    

