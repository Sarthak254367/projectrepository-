import java.util.ArrayList;

public class missing2 {
    public static void main(String[] args) {
        
  int[] arr={5,1,2,0,3};
        sort(arr);
        System.out.println(missing2.sort(arr));

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

            ArrayList<Integer> ans=new ArrayList<>();
            for(int index=0; index<arr.length; index++){
                        if(arr[index]!=index+1) {
                            ans.add(index+1);
                        }
                        
            }
            return ans;
        }


    
        static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr [first]=arr[second];
        arr[second]=temp;
       }
    }

