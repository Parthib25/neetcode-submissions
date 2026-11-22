class Solution {
    List<List<Integer>> result=new ArrayList<>();
    int[] candidates;
    public void backtrack(int index,List<Integer> current,int target){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(candidates.length==index||target<0) return;

        current.add(candidates[index]);
        backtrack(index+1,current,target-candidates[index]);
        current.remove(current.size()-1);
        int nextIndex=index+1;
        while(nextIndex<candidates.length && candidates[index]==candidates[nextIndex]) nextIndex++;
        backtrack(nextIndex,current,target);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates=candidates;
        List<Integer> current=new ArrayList<>();
        backtrack(0,current,target);
        return result;
    }
}
