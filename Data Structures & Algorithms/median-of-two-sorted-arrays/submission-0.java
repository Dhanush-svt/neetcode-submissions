class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int total = m + n;
        
        // We only need to track the current and previous values 
        // as we "walk" toward the middle index.
        int p1 = 0, p2 = 0;
        int current = 0, last = 0;

        // We only need to iterate until we hit the middle of the combined length
        for (int i = 0; i <= total / 2; i++) {
            last = current; // Keep track of the previous element for even-length medians
            
            // If nums1 still has elements AND (nums2 is empty OR nums1 has the smaller element)
            if (p1 < m && (p2 >= n || nums1[p1] < nums2[p2])) {
                current = nums1[p1++];
            } else {
                current = nums2[p2++];
            }
        }

        if (total % 2 != 0) {
            return (double) current;
        } else {
            return (last + current) / 2.0;
        }
    }
}