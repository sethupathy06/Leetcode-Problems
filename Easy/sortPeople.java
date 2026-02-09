class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
         HashMap<Integer,String> map = new HashMap<>();
         int n = heights.length;
         String [] sort = new String[names.length];
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int j=0;
        for(int i=n-1;i>=0;i--){
            sort[j]= map.get(heights[i]);
            j++;
        }
        return sort;
    }
}