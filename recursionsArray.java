public class recursionsArray {
    public static void main(String[] args) {
        // recursopn on  array
        //checkung rhe array is sorted or not
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Is the array sorted? " + sorted(arr, 0));
        System.out.println("Is the target present? " + linearSearch(arr, 3, 0));
        
        System.out.println("Index of target in rotated array: " + rotatedBinarySearch(new int[]{4, 5, 6, 7, 0, 1, 2}, 0, 0, 6));
    }

        static boolean sorted(int[] arr, int index) {
            if (index == arr.length - 1) {
                return true; // Base case: if we reach the end of the array, it's sorted
         
            }
            return arr[index] < arr[index + 1] && sorted(arr, index + 1);
      
            //if the current element is less than the next element, continue checking the rest of the array
        } 

  static boolean linearSearch(int arr[],int target,int index){
    if(index==arr.length){
        return false;
    }

    return arr[index]==target || linearSearch(arr, target, index);
    //checking if the current element in the index is equal to or not if not then move forward with index +1 then perform recursion

  }
  //rotated binary search
  static int rotatedBinarySearch(int arr[],int target,int start,int end){
      if(start>end){
          return -1;
      }
      int mid=(start+end)/2;
      if(arr[mid]==target){
          return mid;
      }
      //if the left side is sorted
      if(arr[start]<=arr[mid]){
          //check if the target is in the left half
          if(target>=arr[start] && target<arr[mid]){
              return rotatedBinarySearch(arr, target, start, mid-1);
          }
          //if not, search the right half
          return rotatedBinarySearch(arr, target, mid+1, end);
      }
      //if the right side is sorted
      if(target>arr[mid] && target<=arr[end]){
          return rotatedBinarySearch(arr, target, mid+1, end);
      }
      return rotatedBinarySearch(arr, target, start, mid-1);
  }
}
