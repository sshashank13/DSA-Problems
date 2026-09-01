class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int candidate = nums[i];
            int count = 0;
            for (int j = 0; j < n; j++){
                if (nums[j] == candidate) {
                    count++;
                }
            }
            if (count > n / 2) {
                return candidate;
            }
        }
        return -1;
    }
}