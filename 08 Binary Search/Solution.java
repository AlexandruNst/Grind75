class Solution {

    // T: O(log n)
    // S: O(1)
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length;
        while (start < end) {
            int mid = (start + end) / 2; // to avoid overflow, end + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid;
        }
        return -1;
    }
}

// Start = 0, end = arr.length. Get the mid, if mid element is target, return.
// If less, we look in the right (start = mid + 1), if more, we look in the left
// (end = mid).