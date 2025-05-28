public class linearsearch {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,90,8};
        int target=90;
        int ans=linearSearch(nums, target);
        System.out.println(ans);
    }

    //search ina array return the index if the item is ffound
    //otherwise return-1

    static int linearSearch( int[] arr,int target)
 {
    if(arr.length==0) {
        return -1;
    }


 for(int index=0; index<arr.length; index++) {
    int element= arr[index];
    //checking for element at every index if  it is=target
    if(element==target) {
        return index;
    }

 }
 return target;

 }





    

}
