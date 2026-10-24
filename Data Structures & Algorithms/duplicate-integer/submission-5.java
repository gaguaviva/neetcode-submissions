class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> numbers = new Hashtable<>();
        for (int i : nums) {
            if (numbers.containsKey(i)==true) 
                return true;
            else 
                numbers.put(i, 1);
        }
        return false;
    }
}