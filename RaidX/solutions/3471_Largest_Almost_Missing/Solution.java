

class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        int l = 0, r = k;
        while (r <= length) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = l; i < r; i++) {
                if (set.contains(nums[i]))
                    continue;
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                set.add(nums[i]);
            }
            l++;
            r++;
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1)
                max = Math.max(max, e.getKey());
        }
        return max;
    }
    // hello
}