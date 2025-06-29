public class slidingWindow {
    public static void main(String[] args) {
        //learning about sliding window
       int arr[]={2,1,5,1,3,2};
       int k=3;
       System.out.println(maxSubarray(arr, k));

    }

    static int   maxSubarray(int arr[],int k){
        int i=0;
        int j=0;
        int windowSum=0;
        int maxSum=0;

        while(j<arr.length){
            windowSum+=arr[j];

            //when window size is less than k move forward
            if(j-i+1<k){
                j++;
            }

            else if(j-i+1==k){
                maxSum=Math.max(maxSum, windowSum);
                windowSum-=arr[i];

                i++;
                j++;
            }
        }
        return maxSum;
    }
}
