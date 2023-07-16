class Solution {

    // T: O(n + m)
    // S: O(1)? Techninally, we only need 26 extra int spaces for any String length
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;
        for (char c : t.toCharArray())
            freq[c - 'a']--;
        for (int i : freq)
            if (i != 0)
                return false;
        return true;
    }
}

// Initialise a freq[26]. Go through string 1 and increment, go through string 2
// and decrement. At the check, check if any is anything else other than 0.