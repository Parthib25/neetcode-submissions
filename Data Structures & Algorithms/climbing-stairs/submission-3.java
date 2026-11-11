class Solution {
   
    public int countStairs(int n){
        int prev1=2; int prev2=1;
        if(n<=2) return n;
        for(int i=3;i<=n;i++){
            int current=prev2+prev1;
            prev2=prev1;
            prev1=current;
        }
        return prev1;
    }
    public int climbStairs(int n) {
        
        return countStairs(n);
    }
}
