

public class missing {
    public static void main(String[] args) {
        int[] arr={5,1,2,0,3};
        sort(arr);
        System.out.println(missing.sort(arr));

    }

    static int sort(int[] arr) {
        int i=0;
        while(i<arr.length){
           int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

            for(int index=0;index<arr.length; index++) {
                if(arr[index]!=index){
                    return index;
                }
            }
    
        return arr.length;
    }
    

    
        static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr [first]=arr[second];
        arr[second]=temp;
       }
    }

