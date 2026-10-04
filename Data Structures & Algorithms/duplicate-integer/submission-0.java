class Solution {
    // public boolean hasDuplicate(int[] nums) {
    //     int len=nums.length;
    //     Set setTemp=new HashSet();
    //     for(int i=0;i<len;i++){
    //       setTemp.add(nums[i]);
    //     }
    //     if(setTemp.size()<len) return true;
    //     return false;
    // }
    public boolean hasDuplicate(int[] nums) {
        int len=nums.length;
        Set<Integer> setTemp=new HashSet();
        for(int i=0;i<len;i++){
          if(!setTemp.add(nums[i])){
            return true;
          }
        }
        return false;
    }
}