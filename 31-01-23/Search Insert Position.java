//Search Insert Position
//........................................................


class Solution {
   public int searchInsert(int[] nums, int target) {
    int res = 0, low = 0, high = nums.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (target > nums[mid]) {
            low = mid + 1;
            res = mid + 1;
        } else if (target < nums[mid]) {
            high = mid - 1;
            res = mid;
        } else {
            res = mid;
            break;
        }
    }
    return res;
}
}