import java.util.Arrays;

public class insertsort {
    public static void main(String[] args) {
        //q why insertion short
       // for every index we are adding put that correct index of LHS//the lhs side is getting sorted
       int []arr={4,3,6,9,8};
       insertion(arr);
       System.out.println(Arrays.toString(arr));
       

       }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
   
       static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr [first]=arr[second];
        arr[second]=temp;
       }

    }
