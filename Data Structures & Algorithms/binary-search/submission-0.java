class Solution {
    public int search(int[] nums, int target) {
        return binary_search(0, nums.length - 1, nums, target);
    }

    public int binary_search(int low, int high, int[] nums, int target){
        if(low > high) return -1;
        int mid = low + (high - low) / 2;

        if(nums[mid] == target) return mid;

        return (nums[mid] < target) ? binary_search(mid+1, high, nums, target)
        : binary_search(low, mid-1, nums, target);
    }
}
