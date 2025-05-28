public class dsa {
    public static void main(String[] args) {
        int[] arr={4,5,9,34,3};
      System.out.println(max(arr));
      System.out.println(min(arr));
}
 
static int max(int[] arr){
    int maxVal=arr[0];
    for(int i=0; i<arr.length; i++) {
      
        if(arr[i]>maxVal) {
          maxVal=arr[i];
          System.out.println("The maximum value of an array is:");
        }
   }
  return maxVal;
}

static int min(int[] arr){
    int minVal=arr[0];
    for(int i=0; i<arr.length; i++) {
      
        if(arr[i]<minVal) {
          minVal=arr[i];
          System.out.println("The minimum value of an array is:");
        }
   }
  return minVal;
}

}




