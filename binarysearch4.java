public class binarysearch4 {
    public static void main(String[] args) {
        //mountain array
       int[] arr={3,4,5,1,2,2};
       System.out.println(findPivotWithDUplicates(arr));
}

   //this will not for duplicate vlaues 
    static int findPivotWithDUplicates(int[] arr) {
        
        int start=0;
        int end=arr.length-1;
        
          int mid=start+(end-start)/2;
       
        if( mid<end && arr[mid]>arr[mid+1]){
          return mid;
           }


        if(mid>start && arr[mid]<arr[mid+1]){
            return mid-1;
      }
    
      //
      if(arr[mid]==arr[start] && arr[mid]==arr[end]){
        //skipthe duplicates
        //check if start is pivot
        if(arr[start]>arr[start+1]){
          return start;
        }
        start++;
    

        //check whether end is pivot

      if(arr[end]<arr[end-1]){
        return end-1;
      }

      end--;
    }
    
    //left side is sorted pivot should be in right
    else if(arr[start]<arr[mid] || (arr[start]==arr[mid]&& arr[mid]>arr[end])){
      start=mid+1;
    }

    else{
      end=mid-1;
    }
  
  return -1;
}

}


       
      
    
