class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramList = new HashMap<>();
        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            anagramList.putIfAbsent(sortedS, new ArrayList<>());
            anagramList.get(sortedS).add(s);
        }

        return new ArrayList<>(anagramList.values());
    }
}
