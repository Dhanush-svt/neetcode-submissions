class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l=0, r=n-1, resIndex = n-1;
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                res[resIndex] = nums[l]*nums[l];
                l++;
            }else{
                res[resIndex] = nums[r]*nums[r];
                r--;
            }
            resIndex--;
        }
        return res;
    }
}