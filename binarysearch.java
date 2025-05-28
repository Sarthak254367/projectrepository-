public class binarysearch {
    public static void main(String[] args) {
        
        //binary search algorithm in java
     //arr={5,6,7,8,9,10} this is an sorted array in ascnedung order smallest to larget

 // int[] arr={-2,0,2,3,4,15,16,22,45};
 int[] arr={3,3,3,5,6,9,12,14,20,33};//this is catchy problem as first three elmenets are same
 //if start>first incresing
 //if first>start descending 
  int target=14;
  int ans=binarySearch(arr, target);
  System.out.println(ans);
     //why binary search :best case is that when the middle element is equal to target element

     //find the maximum no. of comparision in the worst case

//k is total no. of levels in worst case K=logN=n is the size of array


    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

      //  boolean isASc=arr[start]<arr[end];

        while(start<=end){
          //  int mid=(start+end) int has fixed size
          int mid=start+(end-start)/2;

          if(arr[mid]==target) {
            return mid;
          }
         // if(isASc) {
           // if(target<arr[mid]){
            // end=mid-1;
          //}

          //else{
            start=mid+1;
          //}
          if(target<arr[mid]){
           end=mid-1;
           

          }
          else if(target>arr[mid]){
          start=mid+1;
          
          }
          else{
            return mid;
          }
        }
        return -1;
    }
}
