class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        li.add(new ArrayList<>());
        for(int n : nums){
            int size = li.size();
          for(int i=0;i<size;i++){
            List<Integer> list = new ArrayList<>(li.get(i));
            list.add(n);
            li.add(list);
          }
        }
        return li;
    }
}