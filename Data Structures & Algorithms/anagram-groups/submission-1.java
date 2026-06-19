class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();

        for (String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            anagram.putIfAbsent(sorted, new ArrayList<>());
            anagram.get(sorted).add(s);
        }

        return new ArrayList<>(anagram.values());
    }
}
