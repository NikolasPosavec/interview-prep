class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> seen = new ArrayList<>();
        
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int n : nums) {
            list.add(n);
        }

        for(int i = 1; i < nums.length; i++) {
            if(list.contains((nums[i] + nums[i - 1]) * -1)) {
                if(!(seen.contains(nums[i]) && seen.contains(nums[i-1]) 
                    && seen.contains(nums[i] + nums[i - 1] * -1))) {
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[i]);
                    seen.add(nums[i]);
                    temp.add(nums[i-1]);
                    seen.add(nums[i-1]);
                    temp.add((nums[i] + nums[i - 1]) * -1);
                    seen.add((nums[i] + nums[i - 1]) * -1);
                    result.add(temp);
                }
            }
        }

        return result;
    }
}
