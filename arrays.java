public class arrays {
    public static void main(String[] args) {
    // int arr[]={7,9,8,5,6};
    // int target=9;
     //System.out.println(linearSearch(arr,target,1,4));
     
     //finding even no. of digitd
     int[] nums={12,345,2,6,7896};
     System.out.println(findNumbers(nums));

    }

      
    

     //int sum=0;
     //for(int i=0;i<arr.length; i++) {
       // sum+=arr[i];

     //}
     //System.out.println(sum);
    //}

    //searching arrray in range
    //approach
    //search for 3 in the range og index[1,4]

  //   static int linearSearch( int[] arr,int target,int start,int end)
// {
  //  if(arr.length==0) {
    //    return -1;
    //}


 //for(int index=start; index<=end; index++) {
   // int element= arr[index];
    //checking for element at every index if  it is=target
    //if(element==target) {
      //  return index;
    //}

 }
 //return target;

 //}
static int findNumbers(int[] nums){
    int count=0;
    for(int num:nums){
        if(even(num)){
 count++;
        }
    }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits=digits(num);
        return numberOfDigits%2==0;
    }




static int digits(int num){
    int count=0;

    while(num>0){
        count++;
        num=num/10;
    }
    return count;
}

}
