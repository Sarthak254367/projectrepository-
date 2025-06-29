import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        //starting recursion from scratch
        //print natural numbets from  1 to n
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);
    }
static void printIncreasing(int n){
    if(n==1){
        System.out.println(n);
        return;
    }

    printIncreasing(n-1);
    System.out.println(n);
}


}
