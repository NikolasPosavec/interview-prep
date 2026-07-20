class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> seen = new ArrayList<>();
        Arrays.sort(nums);
        int p1 = 0;
        int p2 = nums.length - 1;

        while(p1 < p2) {
            int target = (nums[p1] + nums[p2]) * -1;
            if(target < nums[p2]) {
                for(int i = 0; i < nums.length; i++) {
                    if(i == p1 || i == p2) {
                        continue;
                    } else if(nums[i] == target && !seen.contains(i)) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[p1]);
                        seen.add(p1);
                        list.add(nums[p2]);
                        seen.add(p2);
                        list.add(target);
                        seen.add(i);
                        result.add(list);
                    }
                }
                p2--;
            } else {
                p1++;
            }
        }

        return result;
    }
}
