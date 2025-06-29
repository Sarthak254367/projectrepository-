public class main10 {

     static void printArray(int[]arr){
        for(int value:arr){
            System.out.print(value+" ");
        }
         System.out.println();
      }

      static int[] prefixSum(int arr[]){
        int[] prefixSum=new int[arr.length];
        prefixSum[0]=arr[0];


        for(int i=0; i<arr.length;i++){
       prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        return prefixSum;
      }
    public static void main(String[] args) {
       int [] arr={2,4,6,8,10};
       printArray(arr);
       prefixSum(arr);
       printArray(arr);
    }
}
