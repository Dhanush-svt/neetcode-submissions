class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0, r=nums.length-1;
        while(l<r){
            if((nums[l] & 1)==1){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r--] = temp;
            }else{
                l++;
            }
        }
        return nums;
    }
}