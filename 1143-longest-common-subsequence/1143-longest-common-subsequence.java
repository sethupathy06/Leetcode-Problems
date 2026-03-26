class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(text1.charAt(j)==text2.charAt(i)){
                    count++;
                }
            }
        }
        return count;
    }
}