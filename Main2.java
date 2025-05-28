import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        
    Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       int c=in.nextInt();
          
     //  find the largest number among three 
       int max=a;

       if (b > max) {
        max=b;
       }

       if(c>max) {
          max=c;
       }
       
   System.out.println(max);
   
   alphabet checking in java
  char ch=in.next().trim().charAt(0);
   if(ch >='a' && ch<='z') {
    System.out.println("Lowercase");
   }
   else{
    System.out.println("uppercase");
   }


   System.out.println(ch); 
    reversing a number
     int num=2848879;
     int ans=0;
      while(num>0) {
             int rem=num%10;
             num/=10;
             ans=ans*10+rem;
   }
   
System.out.println(ans); */

   Scanner sc=new Scanner(System.in);
   int ans=0;
   
   while(true) {
    char op=sc.next().trim().charAt(0);
    System.out.println(op);
    if(op== '+' || op=='-'  || op=='*' || op=='%' ) {
      System.out.println("enter the two numbers");
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      System.out.println();
      if (op=='+') {
        ans=num1+num2;
        
      }
      if (op=='*') {
        ans=num1*num2;
        
      }
      if (op=='-') {
        ans=num1-num2;
        
      }
      if (op=='%') {
        ans=num1%num2;
        
      }
    }
    else if(op=='x' || op=='X') {
      break;
    }
    else {
      System.out.println("invalid operation");
    }
    System.out.println(ans);
  }
    
    }
   
}


