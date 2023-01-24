#Longest Substring Without Repeating Characters
#-----------------------------------------------------------------------------



class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> cache = new HashMap<Character, Integer>();
        int left = 0, right = 0, len = s.length(), maxLen = 0;
        while(right < len){
            Character rightChar = s.charAt(right++);
            cache.put(rightChar, cache.getOrDefault(rightChar, 0)+1);
            while(left < right && cache.get(rightChar)>1){
                Character leftChar = s.charAt(left++);
                cache.put(leftChar, cache.get(leftChar)-1);
            }
            maxLen = Math.max(maxLen, right-left);
        }
        return maxLen;
    }
}