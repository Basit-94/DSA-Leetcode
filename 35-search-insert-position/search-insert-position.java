class Solution {
    public int searchInsert(int[] nums, int target) {
    int l = 0;
    int m = nums.length - 1;

    while (l <= m) {

        int k = l + (m - l) / 2;

        if (nums[k] == target)
            return k;

        else if (nums[k] < target)
            l = k + 1;

        else
            m = k - 1;
    }

    return l;
    }
}