class Solution {
    public int longestConsecutive(int[] nums) {
        // imagine the numbers in a number line and check if we have a left neighbour. If it doesnt then we increase the length till the end.
//Time complexity
      HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        int length=0;
        for(int i=0;i<nums.length;i++){
            int currLen=0;
            if(!numsSet.contains(nums[i]-1)){
                while(numsSet.contains(nums[i]+currLen)) currLen++; 
            }
            if(currLen>length) length=currLen;
        }
        return length;
    }
}
