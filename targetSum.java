public class targetSum {
    public static void main(String[] args) {
        //finding sexond largest number in array
        //find the repwating element in array
    int arr[]={2,3,4,2,5};
    System.out.println(firstRepeatingNumber(arr));

        
    }

static int firstRepeatingNumber(int arr[]){
    int n=arr.length;
    for(int i=0; i<n; i++){
         for(int j=i+1; j<n; j++){
           if(arr[i]==arr[j]){
          return arr[i];
           }
                
            
         }
    }
    return -1;
}





}
