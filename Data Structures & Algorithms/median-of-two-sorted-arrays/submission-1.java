class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int count = 0;
        int l = 0;
        int r = 0;
        while(l < nums1.length && r < nums2.length) {
            if(nums1[l] < nums2[r]) {
                merged[count++] = nums1[l];
                l++;
            } else if(nums1[l] > nums2[r]) {
                merged[count++] = nums2[r];
                r++;
            } else {
                merged[count++] = nums1[l];
                merged[count++] = nums2[r];
                l++;
                r++;
            }
        }
        if(l == nums1.length) {
            while(r < nums2.length) {
                merged[count++] = nums2[r];
                r++;
            }
        } else {
            while(l < nums1.length) {
                merged[count++] = nums1[l];
                l++;
            }
        }
        
        if(merged.length % 2 == 0) {
            return (double)(merged[merged.length / 2] + merged[(merged.length / 2) - 1]) / 2;
        } else {
            return merged[merged.length / 2];
        }
        }
}
