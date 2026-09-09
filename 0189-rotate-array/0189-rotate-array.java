class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;

        int count = 0;
        for (int start = 0; count < n; start++){
            int current = start;
            int held = nums[start];
            do {
                int next = (current + k) % n;
                int saved = nums[next];
                nums[next] = held;
                held = saved;
                current = next;
                count++;
            } while (current != start);
        }
    }
}