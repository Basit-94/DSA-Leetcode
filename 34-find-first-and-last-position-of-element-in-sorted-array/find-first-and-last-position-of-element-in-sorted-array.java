class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a = firstOccurrence(nums,target);
        int b = secondOccurrence(nums,target);

        return new int[]{a,b};
    }
    int firstOccurrence(int[] nums, int target)
    {
        int l = 0,a = -1;
        int m = nums.length - 1;

    while (l <= m) {

        int k = l + (m - l) / 2;

        if (nums[k] == target){
            a = k;
            m = k-1;
        }
        else if (nums[k] < target)
            l = k + 1;

        else
            m = k - 1;
    }

    return a;
    }
    int secondOccurrence(int[] nums, int target)
    {
        int l = 0,a = -1;
        int m = nums.length - 1;

    while (l <= m) {

        int k = l + (m - l) / 2;

        if (nums[k] == target){
            a = k;
            l = k+1;
        }
        else if (nums[k] < target)
            l = k + 1;

        else
            m = k - 1;
    }

    return a;
    }
}