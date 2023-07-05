import java.util.Stack;

//T: O(n)
//S: O(n)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(')
                stack.push(')');
            else if (bracket == '[')
                stack.push(']');
            else if (bracket == '{')
                stack.push('}');
            else if (stack.isEmpty() || bracket != stack.pop())
                return false;
        }
        return stack.isEmpty();
    }
}

// Iterate over the String of brackets and whenever we
// encounter an opening bracket, push closing bracket to Stack.
// When we have an open bracket, check if the last one corresponds,
// and if not, or stack is empty, return false. At the end,
// check if stack is empty i.e. no open brackets left unclosed.