
import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={4,8,9,5,6};
       selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static int selectionsort(int[] arr) {
        for(int i=0;i<arr.length; i++) {
            //find the max item in the remaining array and swap with correct indec

            int last=arr.length-1-i;
            int maxIndex=getMaxIndex(arr, 0, last);
            swap(arr, last, maxIndex);
        }
        return 0;
    }


    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


    static int getMaxIndex(int []arr,int start,int end){
        int max=start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}

//     static int bubbleSort(int [] arr) {
//         for(int i=0; i<arr.length; i++) {
//             for(int j=1; j<arr.length-i; j++) {
//                       if(arr[j]<arr[j-1]) {

//                int temp=arr[j];
//                 arr[j]=arr[j-1];
//                arr[j-1]=temp;
// }
                
//             }
//         }
//         return -1;
    


