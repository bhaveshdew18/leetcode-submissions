class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res = new HashMap<>();
        for(String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorteds = new String(charArr);
            res.putIfAbsent(sorteds, new ArrayList<>());
            res.get(sorteds).add(s);
        }
        return new ArrayList<>(res.values());
    }
}