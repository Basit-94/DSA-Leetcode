class Solution {
    public int maxArea(int[] height) {
        int max = 0,left = 0,right = height.length-1;
        max = Math.abs( (right-left)*(Math.min(height[left],height[right])) );

        while(left<right) {
            if(height[left]<height[right]) {
                left++;
            }
            else {
                right--;
            }
            max = Math.max(max,Math.abs( (right-left)*(Math.min(height[left],height[right])) ));
        }

        return max;
    }
}