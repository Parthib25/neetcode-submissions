class Solution {

    public String recordFrequency(String str1){
        int[] countStorer=new int[26];
        for(int i=0;i<str1.length();i++){
           countStorer[str1.charAt(i) - 'a']+=1;
        }
        return Arrays.toString(countStorer);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mapList=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String key=recordFrequency(strs[i]);
            if(mapList.containsKey(key)){
              List<String> groupedArray= mapList.get(key);
              groupedArray.add(strs[i]);
              mapList.put(key,groupedArray);
            }else{
                List<String> groupedArray = new ArrayList<>();
                groupedArray.add(strs[i]);
                mapList.put(key,groupedArray);
            }
           
        }
        for(List<String> values:mapList.values()){
            res.add(values);
        }
        return res;
    }
}
