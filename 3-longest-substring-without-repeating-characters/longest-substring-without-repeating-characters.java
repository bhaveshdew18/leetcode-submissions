class Solution {
     public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> subS = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (subS.contains(s.charAt(right))) {
                subS.remove(s.charAt(left));
                left++;
            }

            subS.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }
}