class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] ,0) +1);
        }
        int  m = n*(n+1)/2;
        int sum =0 ,repeat =0;
        for(int i=0;i<n;i++){
            sum += nums[i];
         }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()==2){
                repeat = entry.getKey();
                arr[0] = repeat;
            }
        }
        int totalsum = m -(sum -repeat);
        arr[1] = totalsum;
        return arr;

    }
}