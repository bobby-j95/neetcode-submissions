class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*for each string value in array strs 
          if each value (sorting each letter) equals another value
          add values to list. Then return list*/
        Map<String, List<String>> hm = new HashMap<>();
        for (String s : strs){
            char[] cArray = s.toCharArray();
            Arrays.sort(cArray);
            String sortedS = new String(cArray);
            hm.putIfAbsent(sortedS, new ArrayList<>());
            hm.get(sortedS).add(s);
        }

        return new ArrayList<>(hm.values());
    }
}
