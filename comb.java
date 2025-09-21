class Solution {
    
       public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombination(candidates,target,0,ans,new ArrayList<>());
        return ans;
       }

      
      private void findCombination(int [] arr,int target,int i,List<List<Integer>> ans,List<Integer> ds ){
       if(i==arr.length){

       
        if(target==0) {
            ans.add(new ArrayList<>(ds));
        }

        return;
      }
        if(arr[i]<=target){
            ds.add(arr[i]);
            findCombination(arr,target-arr[i],i,ans,ds);
            ds.remove(ds.size()-1);

        }

        findCombination(arr,target,i+1,ans,ds);

      }
       
       }