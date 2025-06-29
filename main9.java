
public class main9 {



    static void printArray(int[]arr){
        for(int value:arr){
            System.out.print(value+" ");
        }
         System.out.println();
      }


    static void swap(int[]arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }


    static int sortZeroesAndOnes(int[]arr){
      
       int left=0;
       int right=arr.length-1;
       while(left<right){
        // if(arr[left]==1 && arr[right]==0){
        //     swap(arr, left, right);
        //     left++;
        //     right--;
        // }
        if(arr[left]%2==1 && arr[right]%2==0){
             swap(arr, left, right);
          left++;
          right--;
        }

        if(arr[left]%2==0){
            left++;
        }
        if(arr[right]%2==1){
            right--; 
        }
    }
    return 0;
       }
      
    public static void main(String[] args) {
        
        int []arr={1,3,5,6,8,4};

     System.out.println("Original Array:");
        
     printArray(arr);
      sortZeroesAndOnes(arr);
   
    System.out.println("Sorted Array:");
        
      printArray(arr);
    }
}
