class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int n=0;
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            n=nums[i]%len;
            if(nums[i]==0){
                arr[i] = nums[i];
            }
            if(nums[i]>0){
                arr[i]=nums[(i+n)%len];
            }
            if(nums[i]<0){
                arr[i] = nums[(i+n+len)%len];
            }
        }
        return arr;
    }
}