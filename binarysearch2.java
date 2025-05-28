 class binarysearch2 {
    public static void main(String[] args) {
 

 // int[] arr={-2,0,2,3,4,15,16,22,45};
 int[] arr={2,3,5,9,14,16,18};//this is catchy problem as first three elmenets are same
 
  int target=45;
  int ans=ceiling(arr, target);
  System.out.println(ans);
     

    }




public













//the no which is smaller no >=target is ceiling
static int ceiling(int[] arr,int target){
    //but what if target is greater than the greatest number in array

    if(target>arr[arr.length-1]) {
        return-1;
    }
        int start=0;
        int end=arr.length-1;
     
      
        while(start<=end){
          //  int mid=(start+end) int has fixed size
          int mid=start+(end-start)/2;

          if(arr[mid]==target) {
            return mid;
          }

          else{
            start=mid+1;
          }
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
        return start;
    }
}
