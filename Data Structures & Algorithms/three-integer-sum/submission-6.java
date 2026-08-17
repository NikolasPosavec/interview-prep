class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triples = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) {
            if(i != 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r) {
                if(nums[l] + nums[r] == -1 * nums[i]) {
                    List<Integer> valid = List.of(nums[i], nums[l], nums[r]);
                    triples.add(valid);
                    while(l < r && nums[l] == nums[l + 1])
                        l++;
                    while(l < r && nums[r - 1] == nums[r])
                        r--;
                    l++;
                    r--;
                } else if(nums[l] + nums[r] < -1 * nums[i]) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return triples;
    }
}
