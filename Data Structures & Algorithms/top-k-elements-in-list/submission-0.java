class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int frequency = entry.getValue();
            
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

       int[] result = new int[k];
        int counter = 0;
        
        for (int i = buckets.length - 1; i >= 0 && counter < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[counter++] = num;
                    if (counter == k) {
                        return result; 
                    }
                }
            }
        }
        
        return result;
    }
}
