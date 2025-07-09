public class r {
    public static void main(String[] args) {
    // int ans=fibo(8);
   // System.out.println(fibo(8));
   int arr[]={1,2,3,4,55,666,78};
   System.out.println(search(arr,4, 0, arr.length-1));
    }

//   static int fibo(int n){

//     if(n<2){
//         return n;
//     }
    
//     return fibo(n-1)+fibo(n-2);

// }

static int search(int []arr,int target,int s,int e){
    
    if(s>e){
        return-1;
    }

    int m=s+(e-s)/2;

    if(arr[m]==target){
        return m;
    }
  //solving ledt hand part
    if(target<arr[m]){
       return search(arr, target, s, m-1);   //make sure to return the result od thr function call thrn must be in main
    }
 return search(arr, target, m+1, e);
 }


}