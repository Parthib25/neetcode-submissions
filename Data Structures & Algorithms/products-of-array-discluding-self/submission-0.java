class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodPrefix=1;int prodSuffix=1;
        int[] numsPrefix=new int[nums.length];
        int[] numsSuffix=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                numsPrefix[i]=prodPrefix;
            }else{
                prodPrefix=nums[i-1]*prodPrefix;
                numsPrefix[i]=prodPrefix;
            }   
        }

        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                numsSuffix[i]=prodSuffix;
            }else{
                prodSuffix=nums[i+1]*prodSuffix;
                numsSuffix[i]=prodSuffix;
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=numsPrefix[i]*numsSuffix[i];
        }

        return nums;
    }
}  
