import java.util.Arrays;

public class merge {
     public static void main(String[] args) {
  int arr[]={5,4,3,2,1};
  arr=mergeSort(arr);
  System.out.println(Arrays.toString(arr));
    

}
static int[] mergeSort(int[] arr){ //this function is used two divide the array into two halves
    if(arr.length==1){
        return arr;
    }

    int mid=arr.length/2;
    //spliting the array in two halves
    int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
    int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

    ///merge them
    return merge(left,right);

}

private static int[] merge(int []first,int[] second){
    int []mix=new int[first.length+second.length];

    int i=0; //two pointers concept //pointer for the first array
    int j=0;//pointe fotr thr second array
    //pointey for the mix array
    int k=0;             
 
    while(i<first.length && j<second.length){
        if(first[i]<second[j]){
            mix[k]=first[i];
            i++;
        }
        else{
            mix[k]=second[j];
            j++;
        }
        k++;
    }

    //it may be possible that one of the array id not finished 
    //copy the remaining elements 
    ///out od the two loops only one is correct
    while(i<first.length){
        mix[k]=first[i];
        i++;
        k++;
    }

     while(j<second.length){
        mix[k]=first[j];
        j++;
        k++;
    }

    return mix;
}
}

