import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        sum();
    }
   static void sum() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1=sc.nextInt();
        System.out.println("enter the num2");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
    }
}
