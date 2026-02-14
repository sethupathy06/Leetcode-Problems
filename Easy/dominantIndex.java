class Solution {
    public int dominantIndex(int[] nums) {
        int max =0;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max =nums[i];
                index = i;
            }
        }
        for(int i : nums){
            if(i*2>max && i!=max){
                return -1 ;
            }
        }
        return index;
    }
}