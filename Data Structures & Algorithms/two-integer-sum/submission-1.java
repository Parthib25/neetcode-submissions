class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> lookupMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complimentValue=target-nums[i];
            System.out.println(complimentValue);
            if(lookupMap.containsKey(nums[i])){
                return new int[]{lookupMap.get(nums[i]),i};
            }else{
                lookupMap.put(complimentValue,i);
            }
           
        }
        return null;
    }
}
