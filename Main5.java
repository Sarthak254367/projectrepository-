//import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
       sum();
    String message=greet();
      System.out.println(message);

     int ans=sum3(56,67);
     System.out.println(ans);

      //swapping two number
int a=65;
int b=45;
int temp=a;
a=b;
b=temp;
System.out.println(a+" "+b);

swap(a,b);
System.out.println(a+" "+b);*/
//pass by value only in java




     int marks[] ={6,7,8,9,67};
     //changing the array
     change(marks);
System.out.println(marks[0]);
    
    }
}

static void change(int arr[]) {
   arr[0]=98;
}

}
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

static String greet() {

   String greeting="how are you";
    return greeting;
}

//passing the value in brackets
static int sum3(int a,int b) {
   int sum=a+b;
    return sum;

}

//swapping two number
//static void swap(int a,int b) 
//{  
//int temp=a;
//a=b;
//b=temp;

}





