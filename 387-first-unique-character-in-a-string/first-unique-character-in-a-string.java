class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Count frequency of each character
        int[] freq = new int[26]; // because only lowercase a-z

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++; // increase count at the index
        }

        // Step 2: Find first character with count 1
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1) {
                return i; 
            }
        }

        return -1;
    }
}
