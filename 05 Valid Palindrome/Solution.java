class Solution {

    // T: O(n)
    // S: O(1)
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            char charLeft = s.charAt(l);
            char charRight = s.charAt(r);

            if (!isAlphaNumeric(charLeft))
                l++;
            else if (!isAlphaNumeric(charRight))
                r--;
            else if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight))
                return false;
            else {
                l++;
                r--;
            }
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}

// Two pointers, start and end. Ignore non-alphanumericals. Compare the two
// characters (in lowercase!) and continue till left ≥ right.