class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        map.forEach((num, freq) -> {
            if(buckets[freq] == null)
                buckets[freq] = new ArrayList<>();  // adds a new array list at freq index if theres nothing at buckets[freq]
            buckets[freq].add(num);     // adds to the array list
        });

        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i > 0 && result.size() < k; i--) {     // iterates from backwards (because its sorted), also stops once result's size equals k
            if (buckets[i] != null) 
                result.addAll(buckets[i]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    
    }
}

