class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] sum = new int[2];
    HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (numMap.containsKey(difference)) {
                sum[0] = numMap.get(difference);
                sum[1] = i;
                return sum;
            }
            numMap.put(nums[i], i);
        }
        return sum;
    }
}
