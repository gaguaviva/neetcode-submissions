class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean dupeFlag = false;
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                dupeFlag = true;
                break;
            } else {
                numbers.add(nums[i]);
            }
        }
        return dupeFlag;
    }
}