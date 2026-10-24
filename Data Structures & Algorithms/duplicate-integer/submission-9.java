class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i : nums) {
            if (numbers.contains(i)) 
                return true;
            else 
                numbers.add(i);
        }
        return false;
    }
}