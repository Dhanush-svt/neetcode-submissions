class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        for(int num: nums){
            if(l<2 || num != nums[l-2]){
                nums[l] = num;
                l++;
            }
        }
        return l;
    }
}