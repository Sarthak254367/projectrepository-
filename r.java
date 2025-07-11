


public class r {
    public static void main(String[] args) {
    // int ans=fibo(8);
    //     System.out.println(fibo(8));
    int ans=sumofDigits(1342);
     System.out.println(ans);
    }
//   static int fibo(int n){

//     if(n<2){
//         return n;
//     }
//     return fibo(n-1)+fibo(n-2);

int ans=sumofDigits(1342);
// }

// static int factorial(int n){
//  //base condition
//     if(n<=1){
//     return 1;
//    }
 
//    return n*factorial(n-1);
// }

static int sumofDigits(int n){
    if(n==0){
        return 0;
    }

    return (n%10)+sumofDigits(n/10);
}



}