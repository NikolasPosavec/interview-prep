class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int count = 0;
        for(int n : nums1) {
            merged[count++] = n; 
        }
        for(int m : nums2) {
            merged[count++] = m;
        }
        Arrays.sort(merged);
        
        if(merged.length % 2 == 0) {
            return (double)(merged[merged.length / 2] + merged[(merged.length / 2) - 1]) / 2;
        } else {
            return merged[merged.length / 2];
        }
        }
}
