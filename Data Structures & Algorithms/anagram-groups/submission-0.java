class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] word = strs[i].toCharArray();    // makes string into a char array
            Arrays.sort(word);  // sorts array
            String sort = new String(word); // makes a new string = char array
            map.putIfAbsent(sort, new ArrayList<>());   // if absent, it will make new key + value (value is arraylist)
            map.get(sort).add(strs[i]); // goes to sort value, then adds current strs to list
        }
        List<List<String>> result = new ArrayList<>(map.values()); // copies all values to the list
        return result;
    }
}
