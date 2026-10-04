class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.equals(t)) return true;
        int[] nums=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=((int) ch)%26;
            nums[index]=nums[index]+1;
        }
        for(int j=0;j<t.length();j++){
            char ch=t.charAt(j);
            int index=((int) ch)%26;
            nums[index]=nums[index]-1;
        }
        for(int i=0;i<26;i++){
            if(nums[i]!=0){
                return false;
            }
        }
       return true;
    }
}
