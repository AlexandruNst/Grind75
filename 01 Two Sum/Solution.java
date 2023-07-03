import java.util.*;

//T: O(n)
//S: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return new int[] { map.get(nums[i]), i };
            else
                map.put(target - nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}

// Iterate and use a HashMap to keep track of elements visited so far
// and their index. On new element, check if the partner exists in
// the HashMap and return the indexes. Check BEFORE adding to HashMap
// to avoid using the same element twice.
